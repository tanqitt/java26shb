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
@ApiModel(value="Duetothesingle对象", description="")
public class Duetothesingle extends Model<Duetothesingle> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billNo")
    private String billNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("adjustDate")
    private LocalDate adjustDate;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "自定栏一")
    @TableField("uDefOne")
    private String uDefOne;

    @ApiModelProperty(value = "自定栏二")
    @TableField("uDefTwo")
    private String uDefTwo;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "库存量合计")
    @TableField("sunQty")
    private Integer sunQty;

    @ApiModelProperty(value = "调价金额合计")
    @TableField("sumCost")
    private Integer sumCost;

    @ApiModelProperty(value = "凭证编号")
    @TableField("voucherNo")
    private Integer voucherNo;

    @ApiModelProperty(value = "英文名称")
    @TableField("engName")
    private String engName;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "所属部门编号")
    @TableField("departId")
    private String departId;

    @ApiModelProperty(value = "所属部门名称")
    @TableField("departName")
    private String departName;

    @ApiModelProperty(value = "增值科目")
    @TableField("incSubjectID")
    private String incSubjectID;

    @ApiModelProperty(value = "科目名称")
    @TableField("incSubjectName")
    private String incSubjectName;

    @ApiModelProperty(value = "减值科目")
    @TableField("decSujectId")
    private String decSujectId;

    @ApiModelProperty(value = "科目名称")
    @TableField("decSujectName")
    private String decSujectName;

    @ApiModelProperty(value = "审核状态")
    private Integer messtate;

    @ApiModelProperty(value = "是否可用")
    private Integer mestrash;

    @ApiModelProperty(value = "保留字段1")
    @TableField("mespreservingOne")
    private String mespreservingOne;

    @ApiModelProperty(value = "保留字段2")
    @TableField("mespreservingTwo")
    private String mespreservingTwo;


    public static final String BILLNO = "billNo";

    public static final String ADJUSTDATE = "adjustDate";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String UDEFONE = "uDefOne";

    public static final String UDEFTWO = "uDefTwo";

    public static final String REMARK = "remark";

    public static final String SUNQTY = "sunQty";

    public static final String SUMCOST = "sumCost";

    public static final String VOUCHERNO = "voucherNo";

    public static final String ENGNAME = "engName";

    public static final String MEMO = "memo";

    public static final String DEPARTID = "departId";

    public static final String DEPARTNAME = "departName";

    public static final String INCSUBJECTID = "incSubjectID";

    public static final String INCSUBJECTNAME = "incSubjectName";

    public static final String DECSUJECTID = "decSujectId";

    public static final String DECSUJECTNAME = "decSujectName";

    public static final String MESSTATE = "messtate";

    public static final String MESTRASH = "mestrash";

    public static final String MESPRESERVINGONE = "mespreservingOne";

    public static final String MESPRESERVINGTWO = "mespreservingTwo";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
