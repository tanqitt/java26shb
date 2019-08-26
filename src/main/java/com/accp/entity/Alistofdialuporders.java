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
@ApiModel(value="Alistofdialuporders对象", description="")
public class Alistofdialuporders extends Model<Alistofdialuporders> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "调拨单的单据号码")
    @TableId("moveNo")
    private Integer moveNo;

    @ApiModelProperty(value = "单据号码")
    @TableField("moveNumber")
    private Integer moveNumber;

    @ApiModelProperty(value = "栏号")
    @TableField("columnNo")
    private Integer columnNo;

    @ApiModelProperty(value = "物料名称")
    @TableField("stockName")
    private String stockName;

    @ApiModelProperty(value = "物料编号")
    @TableField("stockNumber")
    private String stockNumber;

    @ApiModelProperty(value = "规格型号")
    private String specifications;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "现行平均成本")
    private Double current;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "分录备注")
    @TableField("entryNote")
    private String entryNote;

    @ApiModelProperty(value = "使用有效日期")
    @TableField("effectiveDate")
    private String effectiveDate;

    @ApiModelProperty(value = "保留字段1")
    @TableField("mespreservingOne")
    private String mespreservingOne;

    @ApiModelProperty(value = "保留字段2")
    @TableField("mespreservingTwo")
    private String mespreservingTwo;


    public static final String MOVENO = "moveNo";

    public static final String MOVENUMBER = "moveNumber";

    public static final String COLUMNNO = "columnNo";

    public static final String STOCKNAME = "stockName";

    public static final String STOCKNUMBER = "stockNumber";

    public static final String SPECIFICATIONS = "specifications";

    public static final String UNIT = "unit";

    public static final String CURRENT = "current";

    public static final String QUANTITY = "quantity";

    public static final String ENTRYNOTE = "entryNote";

    public static final String EFFECTIVEDATE = "effectiveDate";

    public static final String MESPRESERVINGONE = "mespreservingOne";

    public static final String MESPRESERVINGTWO = "mespreservingTwo";

    @Override
    protected Serializable pkVal() {
        return this.moveNo;
    }

}
