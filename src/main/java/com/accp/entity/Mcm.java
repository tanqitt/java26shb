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
@ApiModel(value="Mcm对象", description="")
public class Mcm extends Model<Mcm> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类别编号                      类别编号                      类别编号 类别编号")
    @TableId("classID")
    private String classID;

    @ApiModelProperty(value = "类别名称")
    @TableField("className")
    private String className;

    @ApiModelProperty(value = "英文名称")
    @TableField("engName")
    private String engName;

    @ApiModelProperty(value = "存货科目")
    @TableField("accInvenoryID")
    private Integer accInvenoryID;

    @ApiModelProperty(value = "销售收入科目")
    @TableField("accSaleID")
    private Integer accSaleID;

    @ApiModelProperty(value = "销售成本科目")
    @TableField("accSaleCostID")
    private Integer accSaleCostID;

    @ApiModelProperty(value = "销售退回科目")
    @TableField("returnSaleID")
    private Integer returnSaleID;

    @ApiModelProperty(value = "其他收入科目")
    @TableField("otherIncomeID")
    private Integer otherIncomeID;

    @ApiModelProperty(value = "其他费用科目")
    @TableField("otherExpenseID")
    private Integer otherExpenseID;

    @ApiModelProperty(value = "其他成本科目")
    @TableField("otherCostID")
    private Integer otherCostID;

    @ApiModelProperty(value = "备注")
    private String memo;


    public static final String CLASSID = "classID";

    public static final String CLASSNAME = "className";

    public static final String ENGNAME = "engName";

    public static final String ACCINVENORYID = "accInvenoryID";

    public static final String ACCSALEID = "accSaleID";

    public static final String ACCSALECOSTID = "accSaleCostID";

    public static final String RETURNSALEID = "returnSaleID";

    public static final String OTHERINCOMEID = "otherIncomeID";

    public static final String OTHEREXPENSEID = "otherExpenseID";

    public static final String OTHERCOSTID = "otherCostID";

    public static final String MEMO = "memo";

    @Override
    protected Serializable pkVal() {
        return this.classID;
    }

}
