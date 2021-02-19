/*
 * @projectName bxgl
 * @package com.study.bxgl.common
 * @className com.study.bxgl.common.Enum
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.common;

/**
 * Enum
 * @description 公用枚举类
 * @author liujunxian
 * @date 2021年02月19日 14:23
 * @version 3.0.0
 */
public class Enum {

    public enum Tblx {
        YGLX("员工类型", 1), ZNLX("子女类型", 2), QSLX("亲属类型", 3);

        private String desc;//文字描述

        private Integer code; //对应的代码

        /**
         * 私有构造,防止被外部调用
         * @param desc
         */
        private Tblx(String desc, Integer code) {
            this.desc = desc;
            this.code = code;
        }

        /**
         * 定义方法,返回描述,跟常规类的定义没区别
         * @return
         */
        public String getDesc() {
            return desc;
        }

        /**
         * 定义方法,返回代码,跟常规类的定义没区别
         * @return
         */
        public int getCode() {
            return code;
        }
    }

    public enum ZJLX {
        SFZ("身份证", 1), DSZNZ("独生子女证", 2), JGZ("军官证", 3), GATXZ("港澳通行证", 4);

        private String desc;//文字描述

        private Integer code; //对应的代码

        /**
         * 私有构造,防止被外部调用
         * @param desc
         */
        private ZJLX(String desc, Integer code) {
            this.desc = desc;
            this.code = code;
        }

        /**
         * 定义方法,返回描述,跟常规类的定义没区别
         * @return
         */
        public String getDesc() {
            return desc;
        }

        /**
         * 定义方法,返回代码,跟常规类的定义没区别
         * @return
         */
        public int getCode() {
            return code;
        }
    }

    public enum CBQK {
        CBQN("承保全年(一次付款)", 1), FMBNCB("母方半年承保", 2), FFBNCB("父方半年承保", 3);

        private String desc;//文字描述

        private Integer code; //对应的代码

        /**
         * 私有构造,防止被外部调用
         * @param desc
         */
        private CBQK(String desc, Integer code) {
            this.desc = desc;
            this.code = code;
        }

        /**
         * 定义方法,返回描述,跟常规类的定义没区别
         * @return
         */
        public String getDesc() {
            return desc;
        }

        /**
         * 定义方法,返回代码,跟常规类的定义没区别
         * @return
         */
        public int getCode() {
            return code;
        }
    }

    public enum ZXGX {
        ZN("子女", 1), FQ("父亲", 2), MQ("母亲", 3);

        private String desc;//文字描述

        private Integer code; //对应的代码

        /**
         * 私有构造,防止被外部调用
         * @param desc
         */
        private ZXGX(String desc, Integer code) {
            this.desc = desc;
            this.code = code;
        }

        /**
         * 定义方法,返回描述,跟常规类的定义没区别
         * @return
         */
        public String getDesc() {
            return desc;
        }

        /**
         * 定义方法,返回代码,跟常规类的定义没区别
         * @return
         */
        public int getCode() {
            return code;
        }
    }

    public enum ZCHLB {
        ZC("正常", 1), LB("漏报", 2);

        private String desc;//文字描述

        private Integer code; //对应的代码

        /**
         * 私有构造,防止被外部调用
         * @param desc
         */
        private ZCHLB(String desc, Integer code) {
            this.desc = desc;
            this.code = code;
        }

        /**
         * 定义方法,返回描述,跟常规类的定义没区别
         * @return
         */
        public String getDesc() {
            return desc;
        }

        /**
         * 定义方法,返回代码,跟常规类的定义没区别
         * @return
         */
        public int getCode() {
            return code;
        }
    }
    public enum XB {
        NAN("男", 1), NV("女", 2);

        private String desc;//文字描述

        private Integer code; //对应的代码

        /**
         * 私有构造,防止被外部调用
         * @param desc
         */
        private XB(String desc, Integer code) {
            this.desc = desc;
            this.code = code;
        }

        /**
         * 定义方法,返回描述,跟常规类的定义没区别
         * @return
         */
        public String getDesc() {
            return desc;
        }

        /**
         * 定义方法,返回代码,跟常规类的定义没区别
         * @return
         */
        public int getCode() {
            return code;
        }
    }
}
