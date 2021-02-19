/*
 * @projectName bxgl
 * @package com.study.bxgl.common
 * @className com.study.bxgl.common.Const
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Const
 * @description 常量类
 * @author liujunxian
 * @date 2021年02月19日 11:40
 * @version 3.0.0
 */
public class Const {
    //投保信息excel开始读入的行
    public static int START_ROW_TBXX_EXCEL = 2;

    //投保信息excel开始读入的页签
    public static int START_SHEET_TBXX_EXCEL = 0;

    //投保信息excel列与字段对应关系 列名-字段名
    public static Map<String, String> RELATTION_COLUMN_TBXX = new HashMap<String, String>(){
        {
            put("","");
        }
    };

}
