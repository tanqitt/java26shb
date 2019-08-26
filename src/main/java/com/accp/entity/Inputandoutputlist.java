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
@ApiModel(value="Inputandoutputlist对象", description="")
public class Inputandoutputlist extends Model<Inputandoutputlist> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "来源单别")
    @TableId("singleSource")
    private String singleSource;

    @ApiModelProperty(value = "来源单号")
    @TableField("billNo")
    private String billNo;

    @ApiModelProperty(value = "行号")
    @TableField("lineNumber")
    private Integer lineNumber;

    @ApiModelProperty(value = "仓库编号")
    @TableField("warehouseId")
    private Integer warehouseId;

    @ApiModelProperty(value = "物料编号")
    @TableField("stockNumber")
    private String stockNumber;

    @ApiModelProperty(value = "日期")
    @TableField("adjustDate")
    private LocalDate adjustDate;

    @ApiModelProperty(value = "数量")
    private Integer quantuty;

    @ApiModelProperty(value = "是加减")
    @TableField("addAndSubtract")
    private Integer addAndSubtract;

    @ApiModelProperty(value = "单价")
    @TableField("unitPrice")
    private Double unitPrice;

    @ApiModelProperty(value = "总金额")
    @TableField("aggregateAmount")
    private Double aggregateAmount;

    @ApiModelProperty(value = "保留字段1")
    @TableField("mespreservingOne")
    private String mespreservingOne;

    @ApiModelProperty(value = "保留字段2")
    @TableField("mespreservingTwo")
    private String mespreservingTwo;


    public static final String SINGLESOURCE = "singleSource";

    public static final String BILLNO = "billNo";

    public static final String LINENUMBER = "lineNumber";

    public static final String WAREHOUSEID = "warehouseId";

    public static final String STOCKNUMBER = "stockNumber";

    public static final String ADJUSTDATE = "adjustDate";

    public static final String QUANTUTY = "quantuty";

    public static final String ADDANDSUBTRACT = "addAndSubtract";

    public static final String UNITPRICE = "unitPrice";

    public static final String AGGREGATEAMOUNT = "aggregateAmount";

    public static final String MESPRESERVINGONE = "mespreservingOne";

    public static final String MESPRESERVINGTWO = "mespreservingTwo";

    @Override
    protected Serializable pkVal() {
        return this.singleSource;
    }

}
