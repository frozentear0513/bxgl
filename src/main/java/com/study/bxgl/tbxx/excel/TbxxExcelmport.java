/*
 * @projectName bxgl
 * @package com.study.bxgl.tbxx.excel
 * @className com.study.bxgl.tbxx.excel.TbxxExcelmport
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.tbxx.excel;

import com.mysql.jdbc.StringUtils;
import com.study.bxgl.common.Const;
import com.study.bxgl.tbxx.pojo.TTbxx;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TbxxExcelmport
 * @description excel导入操作
 * @author liujunxian
 * @date 2021年02月19日 11:30
 * @version 3.0.0
 */
public class TbxxExcelmport {
    public static List<TTbxx> readListTbxxFromExcel(InputStream in) throws IOException, NoSuchFieldException, IllegalAccessException {
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        in.close();
        //读取第一个sheet
        XSSFSheet sheet = workbook.getSheetAt(Const.START_SHEET_TBXX_EXCEL);
        List<String> colNames = getCols(sheet.getRow(0));
        if(sheet == null || CollectionUtils.isEmpty(colNames)){
            return Collections.emptyList();
        }
        List<TTbxx> tbxxs = new ArrayList<>();
        //从第3行读取到最后一行
        for (int rowIndex = Const.START_ROW_TBXX_EXCEL; rowIndex <= sheet.getLastRowNum(); rowIndex++) {

            // XSSFRow 代表一行数据
            XSSFRow row = sheet.getRow(rowIndex);
            //获取单元格信息
            TTbxx tbxx = getRowTbxx(row, colNames);
            tbxxs.add(tbxx);
        }
        // 操作完毕后，记得要将打开的 XSSFWorkbook 关闭
        workbook.close();
        return tbxxs;
    }

    private static List<String> getCols(XSSFRow row) {
        List<String> cols = new ArrayList<>();
        for (int colIndex = 0; ; colIndex++) {
            XSSFCell tbxxCell = row.getCell(colIndex);
            String colValue = tbxxCell.getStringCellValue();
            if(StringUtils.isNullOrEmpty(colValue)){
                break;
            }
            cols.add(colValue);
        }
        return cols;
    }

    private static TTbxx getRowTbxx(XSSFRow row, List colNames) throws NoSuchFieldException, IllegalAccessException {
        TTbxx tbxx = new TTbxx();
        for (int colIndex = 0; colIndex < colNames.size(); colIndex++) {
            XSSFCell tbxxCell = row.getCell(colIndex);
            String column = Const.RELATTION_COLUMN_TBXX.get(colNames.get(colIndex));
            // 获取obj类的字节文件对象
            Class tbxxClass = tbxx.getClass();
            // 获取该类的成员变量
            Field f = tbxxClass.getDeclaredField(column);
            // 取消语言访问检查
            f.setAccessible(true);
            // 给变量赋值
            f.set(tbxx, tbxxCell.getRawValue());
        }
        return tbxx;
    }
}
