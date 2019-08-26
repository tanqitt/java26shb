package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Dsdatasat1对象", description="")
public class Dsdatasat1 extends Model<Dsdatasat1> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "供应商编号")
    private String id;

    @ApiModelProperty(value = "账款归属")
    private String fundsattribution;

    @ApiModelProperty(value = "类别")
    private String classid;

    @ApiModelProperty(value = "类别名称")
    private String classname;

    @ApiModelProperty(value = "地区")
    private String areaid;

    @ApiModelProperty(value = "地区名称")
    private String areaname;

    @ApiModelProperty(value = "币别")
    private String currencyid;

    @ApiModelProperty(value = "币别名称")
    private String currencyname;

    @ApiModelProperty(value = "币别简称")
    private String currencyshortname;

    @ApiModelProperty(value = "供应商全称")
    private String fullname;

    @ApiModelProperty(value = "外商")
    private String isforeign;

    @ApiModelProperty(value = "税务登记号")
    private String taxno;

    @ApiModelProperty(value = "供应商简称人")
    private String shortname;

    @ApiModelProperty(value = "负责人")
    private String chiefname;

    @ApiModelProperty(value = "资本额")
    private String capitalization;

    @ApiModelProperty(value = "联系人")
    private String linkman;

    @ApiModelProperty(value = "联系电话一")
    @TableField("Telephone1")
    private String Telephone1;

    @ApiModelProperty(value = "联系电话二")
    @TableField("Telephone2")
    private String Telephone2;

    @ApiModelProperty(value = "联系电话三")
    @TableField("Telephone3")
    private String Telephone3;

    @ApiModelProperty(value = "移动电话")
    private String mobiletel;

    @ApiModelProperty(value = "采购人员")
    private String personid;

    @ApiModelProperty(value = "人员姓名")
    private String personname;

    @ApiModelProperty(value = "传真号码")
    private String faxno;

    @ApiModelProperty(value = "行业别")
    private String industrialclass;

    @ApiModelProperty(value = "电子邮箱")
    private String meail;

    @ApiModelProperty(value = "网址")
    private String webaddress;

    @ApiModelProperty(value = "单价是否含税")
    private String priceoftax;

    @ApiModelProperty(value = "其他付款方描述")
    private String gatherother;

    @ApiModelProperty(value = "发票类型")
    private String invotypeid;

    @ApiModelProperty(value = "发票类型全称")
    private String invotypename;

    @ApiModelProperty(value = "英文全称")
    private String engfullname;

    @ApiModelProperty(value = "英文简称")
    private String engshorname;

    @ApiModelProperty(value = "联系人")
    private String englinkman;

    @ApiModelProperty(value = "联系人职称")
    private String englinkmanprof;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "付款天数")
    private String daysofbillexpire;

    @ApiModelProperty(value = "自定义栏一")
    @TableField("Addfield1")
    private String Addfield1;

    @ApiModelProperty(value = "自定义栏二")
    @TableField("Addfield2")
    private String Addfield2;

    @ApiModelProperty(value = "最初采购入库日")
    private LocalDate earliesttrad;

    @ApiModelProperty(value = "最初采购退货日")
    private LocalDate firsttradedate;

    @ApiModelProperty(value = "最近采购入库日")
    private LocalDate latelytradedate;

    @ApiModelProperty(value = "最近采购退货日")
    private LocalDate latelyreturndate;

    @ApiModelProperty(value = "应付账款科目")
    private String accreceivable;

    @ApiModelProperty(value = "科目名称")
    private String accreceivablename;

    @ApiModelProperty(value = "预付账款科目")
    private String accadvrecv;

    @ApiModelProperty(value = "科目名称")
    private String accadvrecvname;

    @ApiModelProperty(value = "银行账号")
    private String bankaccount;

    @ApiModelProperty(value = "开户银行")
    private String bankid;

    @ApiModelProperty(value = "银行名称")
    private String bankname;

    @ApiModelProperty(value = "信用等级")
    private String creditlevel;

    @ApiModelProperty(value = "账款额度")
    private String amountquota;

    @ApiModelProperty(value = "票据额度")
    private String billquota;

    @ApiModelProperty(value = "付款条件")
    private String recvway;

    @ApiModelProperty(value = "货到付款天数")
    private String distdays;

    @ApiModelProperty(value = "每月结账日")
    private LocalDate dayofclose;

    @ApiModelProperty(value = "月结付款日")
    private LocalDate dayofrecv;

    @ApiModelProperty(value = "TERM")
    private String term;

    @ApiModelProperty(value = "终止交易日")
    private LocalDate invaliddate;

    @ApiModelProperty(value = "价格条款(地区)")
    private String termarea;

    @ApiModelProperty(value = "付款方式")
    private String payway;

    @ApiModelProperty(value = "应付暂估科目")
    private String accreceivalietemp;

    @ApiModelProperty(value = "应付暂估科目名称")
    private String accreceivalietempname;

    @ApiModelProperty(value = "期初预付款")
    @TableField("Startadvrecv")
    private String Startadvrecv;

    @ApiModelProperty(value = "期初应付款")
    private String startreceivable;

    @ApiModelProperty(value = "期末预付款")
    private String curadvrecv;

    @ApiModelProperty(value = "期末应付款")
    private String curreceivable;

    @ApiModelProperty(value = "剩余额度")
    private String remainquota;


    public static final String ID = "id";

    public static final String FUNDSATTRIBUTION = "fundsattribution";

    public static final String CLASSID = "classid";

    public static final String CLASSNAME = "classname";

    public static final String AREAID = "areaid";

    public static final String AREANAME = "areaname";

    public static final String CURRENCYID = "currencyid";

    public static final String CURRENCYNAME = "currencyname";

    public static final String CURRENCYSHORTNAME = "currencyshortname";

    public static final String FULLNAME = "fullname";

    public static final String ISFOREIGN = "isforeign";

    public static final String TAXNO = "taxno";

    public static final String SHORTNAME = "shortname";

    public static final String CHIEFNAME = "chiefname";

    public static final String CAPITALIZATION = "capitalization";

    public static final String LINKMAN = "linkman";

    public static final String TELEPHONE1 = "Telephone1";

    public static final String TELEPHONE2 = "Telephone2";

    public static final String TELEPHONE3 = "Telephone3";

    public static final String MOBILETEL = "mobiletel";

    public static final String PERSONID = "personid";

    public static final String PERSONNAME = "personname";

    public static final String FAXNO = "faxno";

    public static final String INDUSTRIALCLASS = "industrialclass";

    public static final String MEAIL = "meail";

    public static final String WEBADDRESS = "webaddress";

    public static final String PRICEOFTAX = "priceoftax";

    public static final String GATHEROTHER = "gatherother";

    public static final String INVOTYPEID = "invotypeid";

    public static final String INVOTYPENAME = "invotypename";

    public static final String ENGFULLNAME = "engfullname";

    public static final String ENGSHORNAME = "engshorname";

    public static final String ENGLINKMAN = "englinkman";

    public static final String ENGLINKMANPROF = "englinkmanprof";

    public static final String MEMO = "memo";

    public static final String DAYSOFBILLEXPIRE = "daysofbillexpire";

    public static final String ADDFIELD1 = "Addfield1";

    public static final String ADDFIELD2 = "Addfield2";

    public static final String EARLIESTTRAD = "earliesttrad";

    public static final String FIRSTTRADEDATE = "firsttradedate";

    public static final String LATELYTRADEDATE = "latelytradedate";

    public static final String LATELYRETURNDATE = "latelyreturndate";

    public static final String ACCRECEIVABLE = "accreceivable";

    public static final String ACCRECEIVABLENAME = "accreceivablename";

    public static final String ACCADVRECV = "accadvrecv";

    public static final String ACCADVRECVNAME = "accadvrecvname";

    public static final String BANKACCOUNT = "bankaccount";

    public static final String BANKID = "bankid";

    public static final String BANKNAME = "bankname";

    public static final String CREDITLEVEL = "creditlevel";

    public static final String AMOUNTQUOTA = "amountquota";

    public static final String BILLQUOTA = "billquota";

    public static final String RECVWAY = "recvway";

    public static final String DISTDAYS = "distdays";

    public static final String DAYOFCLOSE = "dayofclose";

    public static final String DAYOFRECV = "dayofrecv";

    public static final String TERM = "term";

    public static final String INVALIDDATE = "invaliddate";

    public static final String TERMAREA = "termarea";

    public static final String PAYWAY = "payway";

    public static final String ACCRECEIVALIETEMP = "accreceivalietemp";

    public static final String ACCRECEIVALIETEMPNAME = "accreceivalietempname";

    public static final String STARTADVRECV = "Startadvrecv";

    public static final String STARTRECEIVABLE = "startreceivable";

    public static final String CURADVRECV = "curadvrecv";

    public static final String CURRECEIVABLE = "curreceivable";

    public static final String REMAINQUOTA = "remainquota";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
