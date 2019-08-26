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
@ApiModel(value="Inventorylistdetails对象", description="")
public class Inventorylistdetails extends Model<Inventorylistdetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "盘点单的单据号码")
    @TableId("billNo")
    private String billNo;

    @ApiModelProperty(value = "单据号码")
    @TableField("moveNumber")
    private String moveNumber;

    @ApiModelProperty(value = "栏号")
    @TableField("columnNo")
    private Integer columnNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("stockNumber")
    private String stockNumber;

    @ApiModelProperty(value = "物料名称")
    @TableField("stockName")
    private String stockName;

    @ApiModelProperty(value = "规格型号")
    private String specifications;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "账面数量")
    private Double physical;

    @ApiModelProperty(value = "盘点数量")
    private Integer inventory;

    @ApiModelProperty(value = "盈亏数量")
    @TableField("numberOfProfit")
    private Integer numberOfProfit;

    @ApiModelProperty(value = "单价")
    @TableField("unitPrice")
    private Double unitPrice;

    @ApiModelProperty(value = "盈亏金额")
    private Double quantity;

    @ApiModelProperty(value = "原因")
    @TableField("entryNote")
    private String entryNote;

    @ApiModelProperty(value = "保留字段1")
    @TableField("mespreservingOne")
    private String mespreservingOne;

    @ApiModelProperty(value = "保留字段2")
    @TableField("mespreservingTwo")
    private String mespreservingTwo;


    public static final String BILLNO = "billNo";

    public static final String MOVENUMBER = "moveNumber";

    public static final String COLUMNNO = "columnNo";

    public static final String STOCKNUMBER = "stockNumber";

    public static final String STOCKNAME = "stockName";

    public static final String SPECIFICATIONS = "specifications";

    public static final String UNIT = "unit";

    public static final String PHYSICAL = "physical";

    public static final String INVENTORY = "inventory";

    public static final String NUMBEROFPROFIT = "numberOfProfit";

    public static final String UNITPRICE = "unitPrice";

    public static final String QUANTITY = "quantity";

    public static final String ENTRYNOTE = "entryNote";

    public static final String MESPRESERVINGONE = "mespreservingOne";

    public static final String MESPRESERVINGTWO = "mespreservingTwo";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
