package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Purchaseinvoice对象", description="")
public class Purchaseinvoice extends Model<Purchaseinvoice> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "系统编号")
    @TableId("Sysid")
    private Integer Sysid;

    @ApiModelProperty(value = "单据号码")
    @TableField("Fundbillno")
    private String Fundbillno;

    @ApiModelProperty(value = "单据日期")
    @TableField("Billdate")
    private LocalDate Billdate;

    @ApiModelProperty(value = "供应商")
    @TableField("Custid")
    private String Custid;

    @ApiModelProperty(value = "供应商全称")
    @TableField("Fullname")
    private String Fullname;

    @ApiModelProperty(value = "供应商简称")
    @TableField("Custname")
    private String Custname;

    @ApiModelProperty(value = "账款归属")
    @TableField("Dueto")
    private String Dueto;

    @ApiModelProperty(value = "账款归属简称")
    @TableField("Fundsattribname")
    private String Fundsattribname;

    @ApiModelProperty(value = "账款月份")
    @TableField("Accmonth")
    private LocalDate Accmonth;

    @ApiModelProperty(value = "发票号码")
    private String invoiceno;

    @ApiModelProperty(value = "币别")
    private String currid;

    @ApiModelProperty(value = "币别名称")
    @TableField("Currencyname")
    private String Currencyname;

    @ApiModelProperty(value = "汇率")
    @TableField("Exchrate")
    private String Exchrate;

    @ApiModelProperty(value = "发票金额")
    @TableField("Total")
    private Float Total;

    @ApiModelProperty(value = "发票税额")
    private Float tax;

    @ApiModelProperty(value = "已冲款金额")
    @TableField("Offset")
    private Float Offset;

    @ApiModelProperty(value = "冲款单折让金额")
    @TableField("Discount")
    private Float Discount;

    @ApiModelProperty(value = "付款日期")
    @TableField("Prepayday")
    private LocalDate Prepayday;

    @ApiModelProperty(value = "所属部门")
    @TableField("Deptid")
    private String Deptid;

    @ApiModelProperty(value = "所属项目")
    private String deptname;

    @ApiModelProperty(value = "状态")
    @TableField("Status")
    private String Status;

    @ApiModelProperty(value = "采购人员")
    @TableField("Salesman")
    private String Salesman;

    @ApiModelProperty(value = "人员姓名")
    @TableField("PersonName")
    private String PersonName;

    @ApiModelProperty(value = "结算方式一名称")
    @TableField("CashPayStyle")
    private String CashPayStyle;

    @ApiModelProperty(value = "结算方式一金额")
    @TableField("Cashpay")
    private Float Cashpay;

    @ApiModelProperty(value = "结算方式二名称")
    @TableField("VisaOayStyle")
    private String VisaOayStyle;

    @ApiModelProperty(value = "结算方式二金额")
    @TableField("Visapay")
    private Float Visapay;

    @ApiModelProperty(value = "结算方式三名称")
    @TableField("OtherPayStyle")
    private String OtherPayStyle;

    @ApiModelProperty(value = "结算方式三金额")
    @TableField("Otherpay")
    private Float Otherpay;

    @ApiModelProperty(value = "是否审核")
    private String isaditing;

    @ApiModelProperty(value = "单据是否含税")
    @TableField("Priceoftax")
    private String Priceoftax;

    @ApiModelProperty(value = "凭证编号")
    @TableField("Voucherno")
    private String Voucherno;

    @ApiModelProperty(value = "差价凭证编号")
    @TableField("Cvoucherno")
    private String Cvoucherno;

    @ApiModelProperty(value = "制单人编号")
    @TableField("Makerid")
    private String Makerid;

    @ApiModelProperty(value = "制单人员")
    @TableField("Maker")
    private String Maker;

    @ApiModelProperty(value = "复核人员编号")
    @TableField("Permitterid")
    private String Permitterid;

    @ApiModelProperty(value = "复核人员")
    @TableField("Permitter")
    private String Permitter;

    @ApiModelProperty(value = "自定义栏一")
    @TableField("Udefone")
    private String Udefone;

    @ApiModelProperty(value = "自定义栏二")
    @TableField("Udeftwo")
    private String Udeftwo;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    @ApiModelProperty(value = "单据类型")
    @TableField("Billtype")
    private String Billtype;

    @ApiModelProperty(value = "采购核对状态")
    @TableField("Affirmstate")
    private String Affirmstate;

    @ApiModelProperty(value = "付款条件")
    @TableField("Payterm")
    private String Payterm;

    @ApiModelProperty(value = "付款延迟天数")
    @TableField("Delaydays")
    private String Delaydays;

    @ApiModelProperty(value = "发票类型")
    @TableField("Invotypeid")
    private String Invotypeid;

    @ApiModelProperty(value = "发票类型名称")
    @TableField("Inbotypename")
    private String Inbotypename;

    @ApiModelProperty(value = "保留字段一")
    private String safetyone;

    @ApiModelProperty(value = "保留字段二")
    private byte[] safetytwo;


    public static final String SYSID = "Sysid";

    public static final String FUNDBILLNO = "Fundbillno";

    public static final String BILLDATE = "Billdate";

    public static final String CUSTID = "Custid";

    public static final String FULLNAME = "Fullname";

    public static final String CUSTNAME = "Custname";

    public static final String DUETO = "Dueto";

    public static final String FUNDSATTRIBNAME = "Fundsattribname";

    public static final String ACCMONTH = "Accmonth";

    public static final String INVOICENO = "invoiceno";

    public static final String CURRID = "currid";

    public static final String CURRENCYNAME = "Currencyname";

    public static final String EXCHRATE = "Exchrate";

    public static final String TOTAL = "Total";

    public static final String TAX = "tax";

    public static final String OFFSET = "Offset";

    public static final String DISCOUNT = "Discount";

    public static final String PREPAYDAY = "Prepayday";

    public static final String DEPTID = "Deptid";

    public static final String DEPTNAME = "deptname";

    public static final String STATUS = "Status";

    public static final String SALESMAN = "Salesman";

    public static final String PERSONNAME = "PersonName";

    public static final String CASHPAYSTYLE = "CashPayStyle";

    public static final String CASHPAY = "Cashpay";

    public static final String VISAOAYSTYLE = "VisaOayStyle";

    public static final String VISAPAY = "Visapay";

    public static final String OTHERPAYSTYLE = "OtherPayStyle";

    public static final String OTHERPAY = "Otherpay";

    public static final String ISADITING = "isaditing";

    public static final String PRICEOFTAX = "Priceoftax";

    public static final String VOUCHERNO = "Voucherno";

    public static final String CVOUCHERNO = "Cvoucherno";

    public static final String MAKERID = "Makerid";

    public static final String MAKER = "Maker";

    public static final String PERMITTERID = "Permitterid";

    public static final String PERMITTER = "Permitter";

    public static final String UDEFONE = "Udefone";

    public static final String UDEFTWO = "Udeftwo";

    public static final String REMARK = "Remark";

    public static final String BILLTYPE = "Billtype";

    public static final String AFFIRMSTATE = "Affirmstate";

    public static final String PAYTERM = "Payterm";

    public static final String DELAYDAYS = "Delaydays";

    public static final String INVOTYPEID = "Invotypeid";

    public static final String INBOTYPENAME = "Inbotypename";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.Sysid;
    }

}
