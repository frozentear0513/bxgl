/*
 * @projectName bxgl
 * @package com.study.bxgl.common
 * @className com.study.bxgl.common.Const
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.common;

import java.util.*;

/**
 * Const
 * @description 常量类
 * @author liujunxian
 * @date 2021年02月19日 11:40
 * @version 3.0.0
 */
public class Const {
    //投保信息excel开始读入的行
    public static int START_ROW_TBXX_EXCEL = 1;

    //投保信息excel开始读入的页签
    public static int START_SHEET_TBXX_EXCEL = 0;

    //投保信息excel列与字段对应关系 列名-字段名
    public static Map<String, String> RELATTION_COLUMN_TBXX = new HashMap<String, String>(){
        {
            put("投保类型","touBaoLeiXin");
            put("被保人姓名","beiBaoRenXingMing");
            put("证件类型","zhengJianLeiXing");
            put("证件号码","zhengJianHaoMa");
            put("联系电话","lianXiDianHua");
            put("投保时间","touBaoShiJian");
            put("终保时间","zongBaoHiJian");
            put("性别","xingBie");
            put("属地","shuDi");
            put("出生日期","chuShengRiQi");
            put("正常或漏报","zhengChangHuoLouBao");
            put("员工编码","yuanGongBianMa");
            put("单位名称","danWeiId");
            put("部门名称","buMenId");
            put("父亲员工编号","fuQingYuanGongBiaoHao");
            put("母亲员工编号","muQingYuanGongBiaoHao");
            put("承保情况","chengBaoQingKuang");
            put("父亲姓名","fuQingXingMing");
            put("母亲姓名","muQingXingMing");
            put("父亲单位","fuQingDanWeiId");
            put("母亲单位","muQingDanWeiId");
            put("劳保证号","laoBaoZhengHao");
            put("直系关系","zhiXiGuanXi");
            put("受保人地址","shouBaoRenDiZhi");
            put("投保人姓名","touBaoRenXingMing");
        }
    };

    //整型字段集合
    public static List<String> COLUMN_INT = new ArrayList<String>(Arrays.asList("danWeiId","buMenId","fuQingDanWeiId","muQingDanWeiId"));

    //日期字段集合
    public static List<String> COLUMN_DATE = new ArrayList<String>(Arrays.asList("touBaoShiJian","zongBaoHiJian","chuShengRiQi"));

    //未投保
    public static int WTB_TBLX = 0;
    //投保
    public static int TB_TBLX = 1;

}
