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
@ApiModel(value="Priceadjustrmentlist对象", description="")
public class Priceadjustrmentlist extends Model<Priceadjustrmentlist> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "调价单的单据号码")
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

    @ApiModelProperty(value = "库存量")
    private Integer stock;

    @ApiModelProperty(value = "平均成本")
    private Double auerage;

    @ApiModelProperty(value = "单价")
    @TableField("unitPrice")
    private Double unitPrice;

    @ApiModelProperty(value = "调价金额")
    private Double quantity;

    @ApiModelProperty(value = "分录备注")
    @TableField("entryNote")
    private String entryNote;

    @ApiModelProperty(value = "保留字段1")
    @TableField("mesperservingOne")
    private String mesperservingOne;

    @ApiModelProperty(value = "保留字段2")
    @TableField("mesperservingTwo")
    private String mesperservingTwo;


    public static final String BILLNO = "billNo";

    public static final String MOVENUMBER = "moveNumber";

    public static final String COLUMNNO = "columnNo";

    public static final String STOCKNUMBER = "stockNumber";

    public static final String STOCKNAME = "stockName";

    public static final String SPECIFICATIONS = "specifications";

    public static final String UNIT = "unit";

    public static final String STOCK = "stock";

    public static final String AUERAGE = "auerage";

    public static final String UNITPRICE = "unitPrice";

    public static final String QUANTITY = "quantity";

    public static final String ENTRYNOTE = "entryNote";

    public static final String MESPERSERVINGONE = "mesperservingOne";

    public static final String MESPERSERVINGTWO = "mesperservingTwo";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
