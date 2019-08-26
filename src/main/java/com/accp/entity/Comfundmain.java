package com.accp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * 应付冲款单主表
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comfundmain对象", description="应付冲款单主表")
public class Comfundmain extends Model<Comfundmain> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标记，pk")
    @TableId("Flag")
    private Integer Flag;

    @ApiModelProperty(value = "唯一单据号码，pk")
    @TableField("FundBillID")
    private String FundBillID;

    @ApiModelProperty(value = "单据日期")
    @TableField("FundBillDate")
    private Integer FundBillDate;

    @ApiModelProperty(value = "客户")
    @TableField("CustomerID")
    private String CustomerID;

    @ApiModelProperty(value = "凭证编号")
    @TableField("VoucherNo")
    private String VoucherNo;

    @ApiModelProperty(value = "公司信息")
    @TableField("VoucherAbs")
    private String VoucherAbs;

    @ApiModelProperty(value = "结算一")
    @TableField("Cash")
    private BigDecimal Cash;

    @ApiModelProperty(value = "单据金额")
    @TableField("BillMoney")
    private String BillMoney;

    @ApiModelProperty(value = "自定义栏位一")
    @TableField("SelfDefine1")
    private String SelfDefine1;

    @ApiModelProperty(value = "自定义栏位二")
    @TableField("SelfDefine2")
    private String SelfDefine2;

    @ApiModelProperty(value = "备注")
    @TableField("Memo")
    private String Memo;

    @ApiModelProperty(value = "冲款金额合计")
    @TableField("SumOffset")
    private BigDecimal SumOffset;

    @ApiModelProperty(value = "结算二")
    @TableField("Visa")
    private BigDecimal Visa;

    @ApiModelProperty(value = "币别")
    @TableField("CurrID")
    private String CurrID;

    @ApiModelProperty(value = "汇率")
    @TableField("ExchRate")
    private Float ExchRate;

    @ApiModelProperty(value = "制单人员")
    @TableField("Maker")
    private String Maker;

    @ApiModelProperty(value = "复合人员")
    @TableField("Permitter")
    private String Permitter;

    @ApiModelProperty(value = "预收金额合计")
    @TableField("OrigAddPrepay")
    private BigDecimal OrigAddPrepay;

    @ApiModelProperty(value = "取用预售金额")
    @TableField("OrigPrepayUsed")
    private BigDecimal OrigPrepayUsed;

    @ApiModelProperty(value = "结算方式一")
    @TableField("CashStyle")
    private String CashStyle;

    @ApiModelProperty(value = "结算方式二")
    @TableField("VisaStyle")
    private String VisaStyle;

    @ApiModelProperty(value = "结算方式三所付的金额")
    @TableField("OtherPay")
    private BigDecimal OtherPay;

    @ApiModelProperty(value = "结算方式三")
    @TableField("OtherPayStyle")
    private String OtherPayStyle;

    @ApiModelProperty(value = "是否是所有客户id")
    @TableField("IsAllCurrID")
    private Boolean IsAllCurrID;

    @ApiModelProperty(value = "复合人员编号")
    @TableField("PermitterID")
    private String PermitterID;

    @ApiModelProperty(value = "制单人员编号")
    @TableField("MakerID")
    private String MakerID;

    @ApiModelProperty(value = "单据集合的数据")
    @TableField("AccBillList")
    private String AccBillList;

    @ApiModelProperty(value = "审核状态")
    @TableField("HasCheck")
    private Boolean HasCheck;

    @ApiModelProperty(value = "应收冲款类型")
    @TableField("OffSetStyle")
    private Integer OffSetStyle;

    @ApiModelProperty(value = "总量错误")
    @TableField("TotalError")
    private BigDecimal TotalError;


    public static final String FLAG = "Flag";

    public static final String FUNDBILLID = "FundBillID";

    public static final String FUNDBILLDATE = "FundBillDate";

    public static final String CUSTOMERID = "CustomerID";

    public static final String VOUCHERNO = "VoucherNo";

    public static final String VOUCHERABS = "VoucherAbs";

    public static final String CASH = "Cash";

    public static final String BILLMONEY = "BillMoney";

    public static final String SELFDEFINE1 = "SelfDefine1";

    public static final String SELFDEFINE2 = "SelfDefine2";

    public static final String MEMO = "Memo";

    public static final String SUMOFFSET = "SumOffset";

    public static final String VISA = "Visa";

    public static final String CURRID = "CurrID";

    public static final String EXCHRATE = "ExchRate";

    public static final String MAKER = "Maker";

    public static final String PERMITTER = "Permitter";

    public static final String ORIGADDPREPAY = "OrigAddPrepay";

    public static final String ORIGPREPAYUSED = "OrigPrepayUsed";

    public static final String CASHSTYLE = "CashStyle";

    public static final String VISASTYLE = "VisaStyle";

    public static final String OTHERPAY = "OtherPay";

    public static final String OTHERPAYSTYLE = "OtherPayStyle";

    public static final String ISALLCURRID = "IsAllCurrID";

    public static final String PERMITTERID = "PermitterID";

    public static final String MAKERID = "MakerID";

    public static final String ACCBILLLIST = "AccBillList";

    public static final String HASCHECK = "HasCheck";

    public static final String OFFSETSTYLE = "OffSetStyle";

    public static final String TOTALERROR = "TotalError";

    @Override
    protected Serializable pkVal() {
        return this.Flag;
    }

}
