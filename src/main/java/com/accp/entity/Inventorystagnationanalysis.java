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
@ApiModel(value="Inventorystagnationanalysis对象", description="")
public class Inventorystagnationanalysis extends Model<Inventorystagnationanalysis> {

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
    private String unit;

    @ApiModelProperty(value = "单位名称")
    @TableField("stockNu")
    private String stockNu;

    @ApiModelProperty(value = "最近入库日")
    @TableField("stockDate")
    private LocalDate stockDate;

    @ApiModelProperty(value = "库存量")
    @TableField("CurrentIncome")
    private Integer CurrentIncome;

    @ApiModelProperty(value = "现行总成本")
    @TableField("totalCost")
    private Double totalCost;

    @ApiModelProperty(value = "呆滞天数")
    @TableField("stockDay")
    private Integer stockDay;

    @ApiModelProperty(value = "保留字段1")
    @TableField("mespreservingOne")
    private String mespreservingOne;

    @ApiModelProperty(value = "保留字段2")
    @TableField("mespreservingTwo")
    private String mespreservingTwo;


    public static final String STOCKNUMBER = "stockNumber";

    public static final String STOCKNAME = "stockName";

    public static final String SPECIFICATIONS = "specifications";

    public static final String UNIT = "unit";

    public static final String STOCKNU = "stockNu";

    public static final String STOCKDATE = "stockDate";

    public static final String CURRENTINCOME = "CurrentIncome";

    public static final String TOTALCOST = "totalCost";

    public static final String STOCKDAY = "stockDay";

    public static final String MESPRESERVINGONE = "mespreservingOne";

    public static final String MESPRESERVINGTWO = "mespreservingTwo";

    @Override
    protected Serializable pkVal() {
        return this.stockNumber;
    }

}
