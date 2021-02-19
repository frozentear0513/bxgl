package com.study.bxgl.tbxx.pojo;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 投保信息表(TTbxx)实体类
 *
 * @author liujunxian
 * @since 2021-02-18 18:28:26
 * @version 1.0
 */
@ApiModel(value = "TTbxx",description = "投保信息表")
public class TTbxx implements Serializable {
    private static final long serialVersionUID = 290907279978621254L;
    /**
    * id
    */
	@ApiModelProperty(name = "id",notes = "id",dataType = "Integer",required = true)
    private Integer id;
    /**
    * 1:员工类型  2:子女类型  3:亲属类型   
    */
	@ApiModelProperty(name = "touBaoLeiXin",notes = "1:员工类型  2:子女类型  3:亲属类型   ",dataType = "Integer",required = true)
    private Integer touBaoLeiXin;
    /**
    * 被保人姓名
    */
	@ApiModelProperty(name = "beiBaoRenXingMing",notes = "被保人姓名",dataType = "String",required = true)
    private String beiBaoRenXingMing;
    /**
    * 1:身份证  2:独生子女证  3:军官证  4:港澳通行证
    */
	@ApiModelProperty(name = "zhengJianLeiXing",notes = "1:身份证  2:独生子女证  3:军官证  4:港澳通行证",dataType = "Integer",required = true)
    private Integer zhengJianLeiXing;
    /**
    * 证件号码
    */
	@ApiModelProperty(name = "zhengJianHaoMa",notes = "证件号码",dataType = "String",required = true)
    private String zhengJianHaoMa;
    /**
    * 联系电话
    */
	@ApiModelProperty(name = "lianXiDianHua",notes = "联系电话",dataType = "String",required = true)
    private String lianXiDianHua;
    /**
    * 投保时间	
    */
	@ApiModelProperty(name = "touBaoShiJian",notes = "投保时间	",dataType = "Date",required = true)
    private Date touBaoShiJian;
    /**
    * 终保时间	
    */
	@ApiModelProperty(name = "zongBaoHiJian",notes = "终保时间	",dataType = "Date",required = true)
    private Date zongBaoHiJian;
    /**
    * 性别1:男  2:女  3:其他
    */
	@ApiModelProperty(name = "xingBie",notes = "性别1:男  2:女  3:其他",dataType = "Integer",required = true)
    private Integer xingBie;
    /**
    * 	属地
    */
	@ApiModelProperty(name = "shuDi",notes = "	属地",dataType = "String",required = true)
    private String shuDi;
    /**
    * 	出生日期
    */
	@ApiModelProperty(name = "chuShengRiQi",notes = "	出生日期",dataType = "Date",required = true)
    private Date chuShengRiQi;
    /**
    * 1:正常  2:漏报
    */
	@ApiModelProperty(name = "zhengChangHuoLouBao",notes = "1:正常  2:漏报",dataType = "Integer",required = true)
    private Integer zhengChangHuoLouBao;
    /**
    * 员工编码	
    */
	@ApiModelProperty(name = "yuanGongBianMa",notes = "员工编码	",dataType = "String",required = true)
    private String yuanGongBianMa;
    /**
    * 单位名称	id
    */
	@ApiModelProperty(name = "danWeiId",notes = "单位名称	id",dataType = "Integer",required = true)
    private Integer danWeiId;
    /**
    * 部门名称id
    */
	@ApiModelProperty(name = "buMenId",notes = "部门名称id",dataType = "Integer",required = true)
    private Integer buMenId;
    /**
    * 	父亲员工编号
    */
	@ApiModelProperty(name = "fuQingYuanGongBiaoHao",notes = "	父亲员工编号",dataType = "String",required = true)
    private String fuQingYuanGongBiaoHao;
    /**
    * 母亲员工编号	
    */
	@ApiModelProperty(name = "muQingYuanGongBiaoHao",notes = "母亲员工编号	",dataType = "String",required = true)
    private String muQingYuanGongBiaoHao;
    /**
    * 承保情况1:承保全年(一次付款)2:母方半年承保3:父方半年承保
    */
	@ApiModelProperty(name = "chengBaoQingKuang",notes = "承保情况1:承保全年(一次付款)2:母方半年承保3:父方半年承保",dataType = "Integer",required = true)
    private Integer chengBaoQingKuang;
    /**
    * 父亲姓名
    */
	@ApiModelProperty(name = "fuQingXingMing",notes = "父亲姓名",dataType = "String",required = true)
    private String fuQingXingMing;
    /**
    * 母亲姓名
    */
	@ApiModelProperty(name = "muQingXingMing",notes = "母亲姓名",dataType = "String",required = true)
    private String muQingXingMing;
    /**
    * 父亲单位id
    */
	@ApiModelProperty(name = "fuQingDanWeiId",notes = "父亲单位id",dataType = "Integer",required = true)
    private Integer fuQingDanWeiId;
    /**
    * 母亲单位id
    */
	@ApiModelProperty(name = "muQingDanWeiId",notes = "母亲单位id",dataType = "Integer",required = true)
    private Integer muQingDanWeiId;
    /**
    * 劳保证号
    */
	@ApiModelProperty(name = "laoBaoZhengHao",notes = "劳保证号",dataType = "String",required = true)
    private String laoBaoZhengHao;
    /**
    * 	直系关系1:子女 2:父亲 3:父母
    */
	@ApiModelProperty(name = "zhiXiGuanXi",notes = "	直系关系1:子女 2:父亲 3:父母",dataType = "Integer",required = true)
    private Integer zhiXiGuanXi;
    /**
    * 受保人地址
    */
	@ApiModelProperty(name = "shouBaoRenDiZhi",notes = "受保人地址",dataType = "String",required = true)
    private String shouBaoRenDiZhi;
    /**
    * 修改时间
    */
	@ApiModelProperty(name = "xiuGaiShiJian",notes = "修改时间",dataType = "Date",required = true)
    private Date xiuGaiShiJian;
    /**
    * 投保人姓名
    */
	@ApiModelProperty(name = "touBaoRenXingMing",notes = "投保人姓名",dataType = "String",required = true)
    private String touBaoRenXingMing;

    /**
     * 投保人姓名
     */
    @ApiModelProperty(name = "zhuangTai",notes = "保险状态",dataType = "Integer",required = true)
    private String zhuangTai;

    public String getZhuangTai() {
        return zhuangTai;
    }

    public void setZhuangTai(String zhuangTai) {
        this.zhuangTai = zhuangTai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        
    public Integer getTouBaoLeiXin() {
        return touBaoLeiXin;
    }

    public void setTouBaoLeiXin(Integer touBaoLeiXin) {
        this.touBaoLeiXin = touBaoLeiXin;
    }
        
    public String getBeiBaoRenXingMing() {
        return beiBaoRenXingMing;
    }

    public void setBeiBaoRenXingMing(String beiBaoRenXingMing) {
        this.beiBaoRenXingMing = beiBaoRenXingMing;
    }
        
    public Integer getZhengJianLeiXing() {
        return zhengJianLeiXing;
    }

    public void setZhengJianLeiXing(Integer zhengJianLeiXing) {
        this.zhengJianLeiXing = zhengJianLeiXing;
    }
        
    public String getZhengJianHaoMa() {
        return zhengJianHaoMa;
    }

    public void setZhengJianHaoMa(String zhengJianHaoMa) {
        this.zhengJianHaoMa = zhengJianHaoMa;
    }
        
    public String getLianXiDianHua() {
        return lianXiDianHua;
    }

    public void setLianXiDianHua(String lianXiDianHua) {
        this.lianXiDianHua = lianXiDianHua;
    }
        
    public Date getTouBaoShiJian() {
        return touBaoShiJian;
    }

    public void setTouBaoShiJian(Date touBaoShiJian) {
        this.touBaoShiJian = touBaoShiJian;
    }
        
    public Date getZongBaoHiJian() {
        return zongBaoHiJian;
    }

    public void setZongBaoHiJian(Date zongBaoHiJian) {
        this.zongBaoHiJian = zongBaoHiJian;
    }
        
    public Integer getXingBie() {
        return xingBie;
    }

    public void setXingBie(Integer xingBie) {
        this.xingBie = xingBie;
    }
        
    public String getShuDi() {
        return shuDi;
    }

    public void setShuDi(String shuDi) {
        this.shuDi = shuDi;
    }
        
    public Date getChuShengRiQi() {
        return chuShengRiQi;
    }

    public void setChuShengRiQi(Date chuShengRiQi) {
        this.chuShengRiQi = chuShengRiQi;
    }
        
    public Integer getZhengChangHuoLouBao() {
        return zhengChangHuoLouBao;
    }

    public void setZhengChangHuoLouBao(Integer zhengChangHuoLouBao) {
        this.zhengChangHuoLouBao = zhengChangHuoLouBao;
    }
        
    public String getYuanGongBianMa() {
        return yuanGongBianMa;
    }

    public void setYuanGongBianMa(String yuanGongBianMa) {
        this.yuanGongBianMa = yuanGongBianMa;
    }
        
    public Integer getDanWeiId() {
        return danWeiId;
    }

    public void setDanWeiId(Integer danWeiId) {
        this.danWeiId = danWeiId;
    }
        
    public Integer getBuMenId() {
        return buMenId;
    }

    public void setBuMenId(Integer buMenId) {
        this.buMenId = buMenId;
    }
        
    public String getFuQingYuanGongBiaoHao() {
        return fuQingYuanGongBiaoHao;
    }

    public void setFuQingYuanGongBiaoHao(String fuQingYuanGongBiaoHao) {
        this.fuQingYuanGongBiaoHao = fuQingYuanGongBiaoHao;
    }
        
    public String getMuQingYuanGongBiaoHao() {
        return muQingYuanGongBiaoHao;
    }

    public void setMuQingYuanGongBiaoHao(String muQingYuanGongBiaoHao) {
        this.muQingYuanGongBiaoHao = muQingYuanGongBiaoHao;
    }
        
    public Integer getChengBaoQingKuang() {
        return chengBaoQingKuang;
    }

    public void setChengBaoQingKuang(Integer chengBaoQingKuang) {
        this.chengBaoQingKuang = chengBaoQingKuang;
    }
        
    public String getFuQingXingMing() {
        return fuQingXingMing;
    }

    public void setFuQingXingMing(String fuQingXingMing) {
        this.fuQingXingMing = fuQingXingMing;
    }
        
    public String getMuQingXingMing() {
        return muQingXingMing;
    }

    public void setMuQingXingMing(String muQingXingMing) {
        this.muQingXingMing = muQingXingMing;
    }
        
    public Integer getFuQingDanWeiId() {
        return fuQingDanWeiId;
    }

    public void setFuQingDanWeiId(Integer fuQingDanWeiId) {
        this.fuQingDanWeiId = fuQingDanWeiId;
    }
        
    public Integer getMuQingDanWeiId() {
        return muQingDanWeiId;
    }

    public void setMuQingDanWeiId(Integer muQingDanWeiId) {
        this.muQingDanWeiId = muQingDanWeiId;
    }
        
    public String getLaoBaoZhengHao() {
        return laoBaoZhengHao;
    }

    public void setLaoBaoZhengHao(String laoBaoZhengHao) {
        this.laoBaoZhengHao = laoBaoZhengHao;
    }
        
    public Integer getZhiXiGuanXi() {
        return zhiXiGuanXi;
    }

    public void setZhiXiGuanXi(Integer zhiXiGuanXi) {
        this.zhiXiGuanXi = zhiXiGuanXi;
    }
        
    public String getShouBaoRenDiZhi() {
        return shouBaoRenDiZhi;
    }

    public void setShouBaoRenDiZhi(String shouBaoRenDiZhi) {
        this.shouBaoRenDiZhi = shouBaoRenDiZhi;
    }
        
    public Date getXiuGaiShiJian() {
        return xiuGaiShiJian;
    }

    public void setXiuGaiShiJian(Date xiuGaiShiJian) {
        this.xiuGaiShiJian = xiuGaiShiJian;
    }
        
    public String getTouBaoRenXingMing() {
        return touBaoRenXingMing;
    }

    public void setTouBaoRenXingMing(String touBaoRenXingMing) {
        this.touBaoRenXingMing = touBaoRenXingMing;
    }

}