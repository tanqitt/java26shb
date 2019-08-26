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
@ApiModel(value="Inventorystatement对象", description="")
public class Inventorystatement extends Model<Inventorystatement> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "物料编号")
    @TableId("stockNumber")
    private String stockNumber;

    @ApiModelProperty(value = "物料名称")
    @TableField("stockName")
    private String stockName;

    @ApiModelProperty(value = "规格型号")
    private String specifications;

    @ApiModelProperty(value = "类别名称")
    @TableField("categoryName")
    private String categoryName;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "上期结存数量")
    @TableField("theBalance")
    private Integer theBalance;

    @ApiModelProperty(value = "上期结存平均成本")
    @TableField("averageCost")
    private Double averageCost;

    @ApiModelProperty(value = "上期结存总成本")
    @TableField("totalCost")
    private Double totalCost;

    @ApiModelProperty(value = "本期收入数量")
    @TableField("currentIncome")
    private Integer currentIncome;

    @ApiModelProperty(value = "本期收入总成本")
    @TableField("totalCostOfCurrent")
    private Double totalCostOfCurrent;

    @ApiModelProperty(value = "本期发出数量")
    @TableField("quantityIssued")
    private Integer quantityIssued;

    @ApiModelProperty(value = "本期发出总成本")
    @TableField("totalCostOfIssue")
    private Double totalCostOfIssue;

    @ApiModelProperty(value = "期末结存数量")
    @TableField("endingBalance")
    private Integer endingBalance;

    @ApiModelProperty(value = "期末结存平均成本")
    @TableField("endingBalanceSum")
    private Double endingBalanceSum;

    @ApiModelProperty(value = "期末结存总成本")
    @TableField("totalClosingCost")
    private Double totalClosingCost;

    @ApiModelProperty(value = "保留字段1")
    @TableField("mespreservingOne")
    private String mespreservingOne;

    @ApiModelProperty(value = "保留字段2")
    @TableField("mespreservingTwo")
    private String mespreservingTwo;

    @ApiModelProperty(value = "仓库编号")
    @TableField("theWarehouseNumber")
    private Integer theWarehouseNumber;

    @ApiModelProperty(value = "仓库名称")
    @TableField("theWarehouseName")
    private String theWarehouseName;

    @ApiModelProperty(value = "单别")
    @TableField("singleDont")
    private String singleDont;

    @ApiModelProperty(value = "单号")
    @TableField("oddNumbers")
    private String oddNumbers;


    public static final String STOCKNUMBER = "stockNumber";

    public static final String STOCKNAME = "stockName";

    public static final String SPECIFICATIONS = "specifications";

    public static final String CATEGORYNAME = "categoryName";

    public static final String UNIT = "unit";

    public static final String THEBALANCE = "theBalance";

    public static final String AVERAGECOST = "averageCost";

    public static final String TOTALCOST = "totalCost";

    public static final String CURRENTINCOME = "currentIncome";

    public static final String TOTALCOSTOFCURRENT = "totalCostOfCurrent";

    public static final String QUANTITYISSUED = "quantityIssued";

    public static final String TOTALCOSTOFISSUE = "totalCostOfIssue";

    public static final String ENDINGBALANCE = "endingBalance";

    public static final String ENDINGBALANCESUM = "endingBalanceSum";

    public static final String TOTALCLOSINGCOST = "totalClosingCost";

    public static final String MESPRESERVINGONE = "mespreservingOne";

    public static final String MESPRESERVINGTWO = "mespreservingTwo";

    public static final String THEWAREHOUSENUMBER = "theWarehouseNumber";

    public static final String THEWAREHOUSENAME = "theWarehouseName";

    public static final String SINGLEDONT = "singleDont";

    public static final String ODDNUMBERS = "oddNumbers";

    @Override
    protected Serializable pkVal() {
        return this.stockNumber;
    }

}
