package com.accp.entity;

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
 * 
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Quotedetails对象", description="")
public class Quotedetails extends Model<Quotedetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billNo")
    private String billNo;

    @ApiModelProperty(value = "栏号")
    @TableField("serNo")
    private Integer serNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("prodID")
    private String prodID;

    @ApiModelProperty(value = "物料名称")
    @TableField("prodName")
    private String prodName;

    @ApiModelProperty(value = "规格型号")
    @TableField("prodSize")
    private String prodSize;

    @ApiModelProperty(value = "单位名称")
    @TableField("stuUnitName")
    private String stuUnitName;

    @ApiModelProperty(value = "数量")
    private Integer amount;

    @ApiModelProperty(value = "折扣前单价")
    @TableField("oldPrice")
    private Float oldPrice;

    @ApiModelProperty(value = "折数")
    private Float dicount;

    @ApiModelProperty(value = "单价")
    @TableField("sPrice")
    private Float sPrice;

    @ApiModelProperty(value = "金额")
    private Float amcount;

    @ApiModelProperty(value = "税率")
    @TableField("taxRate")
    private Float taxRate;

    @ApiModelProperty(value = "税额")
    @TableField("taxAmt")
    private Float taxAmt;

    @ApiModelProperty(value = "含税金额")
    @TableField("vFTotal")
    private Float vFTotal;

    @ApiModelProperty(value = "赠品")
    @TableField("IsGift")
    private String IsGift;

    @ApiModelProperty(value = "实际成本")
    @TableField("factCost")
    private Float factCost;

    @ApiModelProperty(value = "标准成本")
    @TableField("BStdCust")
    private Float BStdCust;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String BILLNO = "billNo";

    public static final String SERNO = "serNo";

    public static final String PRODID = "prodID";

    public static final String PRODNAME = "prodName";

    public static final String PRODSIZE = "prodSize";

    public static final String STUUNITNAME = "stuUnitName";

    public static final String AMOUNT = "amount";

    public static final String OLDPRICE = "oldPrice";

    public static final String DICOUNT = "dicount";

    public static final String SPRICE = "sPrice";

    public static final String AMCOUNT = "amcount";

    public static final String TAXRATE = "taxRate";

    public static final String TAXAMT = "taxAmt";

    public static final String VFTOTAL = "vFTotal";

    public static final String ISGIFT = "IsGift";

    public static final String FACTCOST = "factCost";

    public static final String BSTDCUST = "BStdCust";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
