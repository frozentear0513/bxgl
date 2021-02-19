/*
 * @projectName bxgl
 * @package com.study.bxgl.tbxx.excel
 * @className com.study.bxgl.tbxx.excel.TbxxExcelmport
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.tbxx.excel;
import com.study.bxgl.common.Const;
import com.study.bxgl.common.Enum;
import com.study.bxgl.tbxx.mapper.TTbxxMapper;
import com.study.bxgl.tbxx.pojo.TTbxx;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * TbxxExcelmport
 * @description excel导入操作
 * @author liujunxian
 * @date 2021年02月19日 11:30
 * @version 3.0.0
 */
@Component
public class TbxxExcelmport {
    @Autowired
    private TTbxxMapper tbxxMapper;
    public List<TTbxx> readListTbxxFromExcel(InputStream in) throws IOException, NoSuchFieldException, IllegalAccessException {
        HSSFWorkbook workbook = new HSSFWorkbook(in);
        in.close();
        //读取第一个sheet
        HSSFSheet sheet = workbook.getSheetAt(Const.START_SHEET_TBXX_EXCEL);
        List<String> colNames = getCols(sheet.getRow(0));
        if(sheet == null || CollectionUtils.isEmpty(colNames)){
            return Collections.emptyList();
        }
        List<TTbxx> tbxxs = new ArrayList<>();
        //从第3行读取到最后一行
        for (int rowIndex = Const.START_ROW_TBXX_EXCEL; rowIndex <= sheet.getLastRowNum(); rowIndex++) {

            // XSSFRow 代表一行数据
            HSSFRow row = sheet.getRow(rowIndex);
            //获取单元格信息
            TTbxx tbxx = getRowTbxx(row, colNames);
            tbxx.setXiuGaiShiJian(new Date());
            tbxx.setZhuangTai(Const.TB_TBLX);
            tbxxs.add(tbxx);
        }
        // 操作完毕后，记得要将打开的 XSSFWorkbook 关闭
        workbook.close();
        return tbxxs;
    }

    private List<String> getCols(HSSFRow row) {
        List<String> cols = new ArrayList<>();
        for (int colIndex = 0; ; colIndex++) {
            HSSFCell tbxxCell = row.getCell(colIndex);
            if(tbxxCell == null){
                break;
            }
            String colValue = tbxxCell.getStringCellValue();
            cols.add(colValue);
        }
        return cols;
    }

    private TTbxx getRowTbxx(HSSFRow row, List colNames) throws NoSuchFieldException, IllegalAccessException {
        TTbxx tbxx = new TTbxx();
        for (int colIndex = 0; colIndex < colNames.size(); colIndex++) {
            HSSFCell tbxxCell = row.getCell(colIndex);
            String column = Const.RELATTION_COLUMN_TBXX.get(colNames.get(colIndex));
            // 获取obj类的字节文件对象
            Class tbxxClass = tbxx.getClass();
            // 获取该类的成员变量
            Field f = tbxxClass.getDeclaredField(column);
            // 取消语言访问检查
            f.setAccessible(true);
            // 给变量赋值
            f.set(tbxx, getColumnValue(column, tbxxCell));
        }
        return tbxx;
    }

    private Object getColumnValue(String column, HSSFCell rawCell) {
        Object rawValue = getCellValue(column, rawCell);
        if(StringUtils.equals(column, "touBaoLeiXin")){
            Enum.Tblx[] values = Enum.Tblx.values();
            for (Enum.Tblx tblx:values) {
                if(StringUtils.equals(rawValue.toString(), tblx.getDesc())){
                    return tblx.getCode();
                }
            }
        } else if(StringUtils.equals(column, "zhengJianLeiXing")){
            Enum.ZJLX[] values = Enum.ZJLX.values();
            for (Enum.ZJLX zjlx:values) {
                if(StringUtils.equals(rawValue.toString(), zjlx.getDesc())){
                    return zjlx.getCode();
                }
            }
        }else if(StringUtils.equals(column, "chengBaoQingKuang")){
            Enum.CBQK[] values = Enum.CBQK.values();
            for (Enum.CBQK cbqk:values) {
                if(StringUtils.equals(rawValue.toString(), cbqk.getDesc())){
                    return cbqk.getCode();
                }
            }
        }else if(StringUtils.equals(column, "zhiXiGuanXi")){
            Enum.ZXGX[] values = Enum.ZXGX.values();
            for (Enum.ZXGX zxgx:values) {
                if(StringUtils.equals(rawValue.toString(), zxgx.getDesc())){
                    return zxgx.getCode();
                }
            }
        }else if(StringUtils.equals(column, "zhengChangHuoLouBao")){
            Enum.ZCHLB[] values = Enum.ZCHLB.values();
            for (Enum.ZCHLB zchlb:values) {
                if(StringUtils.equals(rawValue.toString(), zchlb.getDesc())){
                    return zchlb.getCode();
                }
            }
        }else if(StringUtils.equals(column, "xingBie")){
            Enum.XB[] values = Enum.XB.values();
            for (Enum.XB xb:values) {
                if(StringUtils.equals(rawValue.toString(), xb.getDesc())){
                    return xb.getCode();
                }
            }
        }else if(StringUtils.equals(column, "danWeiId") || StringUtils.equals(column, "fuQingDanWeiId") || StringUtils.equals(column, "muQingDanWeiId")){
            return tbxxMapper.chaXunDanWeiIdByDanWeiMingCheng(rawValue.toString());
        }else if(StringUtils.equals(column, "buMenId")){
            return tbxxMapper.chaXunBuMenIdByBuMenMingCheng(rawValue.toString());
        }
        return rawValue;
    }

    private Object getCellValue(String column, HSSFCell rawCell) {
        if(Const.COLUMN_INT.contains(column)){
            return Double.valueOf(rawCell.getNumericCellValue()).intValue();
        }
        if(Const.COLUMN_DATE.contains(column)){
            return rawCell.getDateCellValue();
        }
        return rawCell.getStringCellValue();
    }
}
