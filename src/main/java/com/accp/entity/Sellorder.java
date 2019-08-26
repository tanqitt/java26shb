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
@ApiModel(value="Sellorder对象", description="")
public class Sellorder extends Model<Sellorder> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billNo")
    private String billNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "单据类型")
    @TableField("sinId")
    private Integer sinId;

    @ApiModelProperty(value = "单据名称")
    @TableField("sinName")
    private String sinName;

    @ApiModelProperty(value = "客户编号")
    @TableField("customerID")
    private Integer customerID;

    @ApiModelProperty(value = "客户简称")
    @TableField("custShortName")
    private String custShortName;

    @ApiModelProperty(value = "地址编号")
    @TableField("addreassID")
    private Integer addreassID;

    @ApiModelProperty(value = "地址")
    @TableField("custAddress")
    private String custAddress;

    @ApiModelProperty(value = "订单状况")
    @TableField("orderStatus")
    private Integer orderStatus;

    @ApiModelProperty(value = "币别")
    @TableField("currID")
    private String currID;

    @ApiModelProperty(value = "单价是否含税")
    @TableField("PriceOfTax")
    private String PriceOfTax;

    @ApiModelProperty(value = "业务人员编号")
    @TableField("SalasID")
    private Integer SalasID;

    @ApiModelProperty(value = "业务人员")
    @TableField("SalasName")
    private String SalasName;

    @ApiModelProperty(value = "部门编号")
    @TableField("DeparID")
    private Integer DeparID;

    @ApiModelProperty(value = "所属部门")
    @TableField("DeparName")
    private String DeparName;

    @ApiModelProperty(value = "制单人员")
    @TableField("Maker")
    private String Maker;

    @ApiModelProperty(value = "复核人员")
    @TableField("Permitter")
    private String Permitter;

    @ApiModelProperty(value = "审核状态")
    private Integer checkstate;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "合计金额")
    @TableField("sumBTaxAmt")
    private Float sumBTaxAmt;

    @ApiModelProperty(value = "合计税额")
    @TableField("sumTax")
    private Float sumTax;

    @ApiModelProperty(value = "合计含税金额")
    @TableField("sumAmtTax")
    private Float sumAmtTax;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String BILLNO = "billNo";

    public static final String BILLDATE = "billDate";

    public static final String SINID = "sinId";

    public static final String SINNAME = "sinName";

    public static final String CUSTOMERID = "customerID";

    public static final String CUSTSHORTNAME = "custShortName";

    public static final String ADDREASSID = "addreassID";

    public static final String CUSTADDRESS = "custAddress";

    public static final String ORDERSTATUS = "orderStatus";

    public static final String CURRID = "currID";

    public static final String PRICEOFTAX = "PriceOfTax";

    public static final String SALASID = "SalasID";

    public static final String SALASNAME = "SalasName";

    public static final String DEPARID = "DeparID";

    public static final String DEPARNAME = "DeparName";

    public static final String MAKER = "Maker";

    public static final String PERMITTER = "Permitter";

    public static final String CHECKSTATE = "checkstate";

    public static final String REMARK = "remark";

    public static final String SUMBTAXAMT = "sumBTaxAmt";

    public static final String SUMTAX = "sumTax";

    public static final String SUMAMTTAX = "sumAmtTax";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
