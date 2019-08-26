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
@ApiModel(value="Dsdscust1对象", description="")
public class Dsdscust1 extends Model<Dsdscust1> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "客户编号")
    private String id;

    @ApiModelProperty(value = "账款归属")
    private String fundsattribution;

    @ApiModelProperty(value = "客户全称")
    private String fullname;

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

    @ApiModelProperty(value = "固定汇率")
    private String currencyrate;

    @ApiModelProperty(value = "币别简称")
    private String currencyshortname;

    @ApiModelProperty(value = "外商")
    private String isforeign;

    @ApiModelProperty(value = "客户简称")
    private String shortname;

    @ApiModelProperty(value = "税务登记号")
    private String taxno;

    @ApiModelProperty(value = "负责人")
    private String chiefname;

    @ApiModelProperty(value = "资本额")
    private String capitailzation;

    @ApiModelProperty(value = "联系人")
    private String linkman;

    @ApiModelProperty(value = "联系电话一")
    private String telephone1;

    @ApiModelProperty(value = "联系电话二")
    private String telephone2;

    @ApiModelProperty(value = "联系电话三")
    private String telephone3;

    @ApiModelProperty(value = "移动号码")
    private String mobiletel;

    @ApiModelProperty(value = "传真号码")
    private String faxno;

    @ApiModelProperty(value = "行业别")
    private String industarialclass;

    @ApiModelProperty(value = "业务人员")
    private String personid;

    @ApiModelProperty(value = "人员姓名")
    private String personname;

    @ApiModelProperty(value = "电子邮件")
    private String email;

    @ApiModelProperty(value = "网址")
    private String webaddress;

    @ApiModelProperty(value = "人员姓名")
    private String servername;

    @ApiModelProperty(value = "单价是否含税")
    private String priceoftax;

    @ApiModelProperty(value = "其他付款方")
    private String gatherother;

    @ApiModelProperty(value = "潜在客户编号")
    private String transnewid;

    @ApiModelProperty(value = "最近拜访日")
    private LocalDate lastvisitdate;

    @ApiModelProperty(value = "预约拜访日")
    private LocalDate bookvisitdate;

    @ApiModelProperty(value = "客户建立日期")
    private LocalDate buildupdate;

    @ApiModelProperty(value = "发票类型")
    private String invotypeid;

    @ApiModelProperty(value = "发票类型名称")
    private String invotypename;

    @ApiModelProperty(value = "英文全称")
    private String engfullname;

    @ApiModelProperty(value = "英文简称")
    private String engshortname;

    @ApiModelProperty(value = "应付佣金科目")
    private String acccommi;

    @ApiModelProperty(value = "科目名称")
    private String acccomminame;

    @ApiModelProperty(value = "佣金支出科目")
    private String acccommipaied;

    @ApiModelProperty(value = "科目名称")
    private String acccommipaiedname;

    @ApiModelProperty(value = "发票地址邮政编号")
    private String invzipcode;

    @ApiModelProperty(value = "发票地址")
    private String invaddress;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "售价等级")
    private String pricerank;

    @ApiModelProperty(value = "折数%")
    private String rateofdiscount;

    @ApiModelProperty(value = "自定义栏一")
    @TableField("Addfield1")
    private String Addfield1;

    @ApiModelProperty(value = "自定义栏二")
    @TableField("Addfield2")
    private String Addfield2;

    @ApiModelProperty(value = "最出销售出库日")
    private LocalDate earliesttraddate;

    @ApiModelProperty(value = "最初销售退货日")
    private LocalDate firsttradedate;

    @ApiModelProperty(value = "最近销售出库日")
    private LocalDate latelytradedate;

    @ApiModelProperty(value = "最近销售退货日")
    private LocalDate latelyreturndate;

    @ApiModelProperty(value = "应收账款科目")
    private String accreceivable;

    @ApiModelProperty(value = "科目名称")
    private String accreceivablename;

    @ApiModelProperty(value = "预收账款科目")
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

    @ApiModelProperty(value = "收款条件")
    private String recvway;

    @ApiModelProperty(value = "收款天数")
    private String distdays;

    @ApiModelProperty(value = "每月结账日")
    private LocalDate dayofclose;

    @ApiModelProperty(value = "Term")
    private String term;

    @ApiModelProperty(value = "终止交易日")
    private LocalDate invaliddate;

    @ApiModelProperty(value = "价格条款(地区)")
    private String termarea;

    @ApiModelProperty(value = "PAVYMENT")
    private String payment;

    @ApiModelProperty(value = "SHIPMENT")
    private String shipment;

    @ApiModelProperty(value = "INSURANCE")
    private String insurance;

    @ApiModelProperty(value = "代理商")
    private String agentid;

    @ApiModelProperty(value = "供应商简称")
    private String agentname;

    @ApiModelProperty(value = "区域运费")
    private String areafreightid;

    @ApiModelProperty(value = "名称")
    private String areafreighname;

    @ApiModelProperty(value = "FROM")
    private String comefrom;

    @ApiModelProperty(value = "TO")
    private String wentto;

    @ApiModelProperty(value = "期初预收款")
    private String startadvrecv;

    @ApiModelProperty(value = "期初应收款")
    private String startreceivable;

    @ApiModelProperty(value = "期末预收款")
    private String curadvrecv;

    @ApiModelProperty(value = "期末应收款")
    private String curreceivable;

    @ApiModelProperty(value = "剩余额度")
    private String remainquota;


    public static final String ID = "id";

    public static final String FUNDSATTRIBUTION = "fundsattribution";

    public static final String FULLNAME = "fullname";

    public static final String CLASSID = "classid";

    public static final String CLASSNAME = "classname";

    public static final String AREAID = "areaid";

    public static final String AREANAME = "areaname";

    public static final String CURRENCYID = "currencyid";

    public static final String CURRENCYNAME = "currencyname";

    public static final String CURRENCYRATE = "currencyrate";

    public static final String CURRENCYSHORTNAME = "currencyshortname";

    public static final String ISFOREIGN = "isforeign";

    public static final String SHORTNAME = "shortname";

    public static final String TAXNO = "taxno";

    public static final String CHIEFNAME = "chiefname";

    public static final String CAPITAILZATION = "capitailzation";

    public static final String LINKMAN = "linkman";

    public static final String TELEPHONE1 = "telephone1";

    public static final String TELEPHONE2 = "telephone2";

    public static final String TELEPHONE3 = "telephone3";

    public static final String MOBILETEL = "mobiletel";

    public static final String FAXNO = "faxno";

    public static final String INDUSTARIALCLASS = "industarialclass";

    public static final String PERSONID = "personid";

    public static final String PERSONNAME = "personname";

    public static final String EMAIL = "email";

    public static final String WEBADDRESS = "webaddress";

    public static final String SERVERNAME = "servername";

    public static final String PRICEOFTAX = "priceoftax";

    public static final String GATHEROTHER = "gatherother";

    public static final String TRANSNEWID = "transnewid";

    public static final String LASTVISITDATE = "lastvisitdate";

    public static final String BOOKVISITDATE = "bookvisitdate";

    public static final String BUILDUPDATE = "buildupdate";

    public static final String INVOTYPEID = "invotypeid";

    public static final String INVOTYPENAME = "invotypename";

    public static final String ENGFULLNAME = "engfullname";

    public static final String ENGSHORTNAME = "engshortname";

    public static final String ACCCOMMI = "acccommi";

    public static final String ACCCOMMINAME = "acccomminame";

    public static final String ACCCOMMIPAIED = "acccommipaied";

    public static final String ACCCOMMIPAIEDNAME = "acccommipaiedname";

    public static final String INVZIPCODE = "invzipcode";

    public static final String INVADDRESS = "invaddress";

    public static final String MEMO = "memo";

    public static final String PRICERANK = "pricerank";

    public static final String RATEOFDISCOUNT = "rateofdiscount";

    public static final String ADDFIELD1 = "Addfield1";

    public static final String ADDFIELD2 = "Addfield2";

    public static final String EARLIESTTRADDATE = "earliesttraddate";

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

    public static final String RECVWAY = "recvway";

    public static final String DISTDAYS = "distdays";

    public static final String DAYOFCLOSE = "dayofclose";

    public static final String TERM = "term";

    public static final String INVALIDDATE = "invaliddate";

    public static final String TERMAREA = "termarea";

    public static final String PAYMENT = "payment";

    public static final String SHIPMENT = "shipment";

    public static final String INSURANCE = "insurance";

    public static final String AGENTID = "agentid";

    public static final String AGENTNAME = "agentname";

    public static final String AREAFREIGHTID = "areafreightid";

    public static final String AREAFREIGHNAME = "areafreighname";

    public static final String COMEFROM = "comefrom";

    public static final String WENTTO = "wentto";

    public static final String STARTADVRECV = "startadvrecv";

    public static final String STARTRECEIVABLE = "startreceivable";

    public static final String CURADVRECV = "curadvrecv";

    public static final String CURRECEIVABLE = "curreceivable";

    public static final String REMAINQUOTA = "remainquota";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
