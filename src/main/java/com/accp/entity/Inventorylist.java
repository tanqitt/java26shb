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
@ApiModel(value="Inventorylist对象", description="")
public class Inventorylist extends Model<Inventorylist> {

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

    @ApiModelProperty(value = "盘点仓库")
    @TableField("wareId")
    private String wareId;

    @ApiModelProperty(value = "盘点仓库名称")
    @TableField("wareName")
    private String wareName;

    @ApiModelProperty(value = "盈亏数量合计")
    @TableField("sunQty")
    private Integer sunQty;

    @ApiModelProperty(value = "盈亏金额合计")
    @TableField("sumCost")
    private Integer sumCost;

    @ApiModelProperty(value = "凭证编号")
    @TableField("voucherNo")
    private Integer voucherNo;

    @ApiModelProperty(value = "盘点人员编号")
    @TableField("salesId")
    private Integer salesId;

    @ApiModelProperty(value = "盘点人员名称")
    @TableField("salesName")
    private String salesName;

    @ApiModelProperty(value = "所属部门编号")
    @TableField("departId")
    private Integer departId;

    @ApiModelProperty(value = "所属部门名称")
    @TableField("departName")
    private String departName;

    @ApiModelProperty(value = "英文名称")
    @TableField("engName")
    private String engName;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "账面数量为")
    @TableField("zeroFilter")
    private Integer zeroFilter;

    @ApiModelProperty(value = "账面数量合计")
    @TableField("sumCurQty")
    private Integer sumCurQty;

    @ApiModelProperty(value = "盘点数量合计")
    @TableField("sumCheckQty")
    private Integer sumCheckQty;

    @ApiModelProperty(value = "增值科目编号")
    @TableField("incSubjectId")
    private Integer incSubjectId;

    @ApiModelProperty(value = "科目名称")
    @TableField("incSubjectName")
    private String incSubjectName;

    @ApiModelProperty(value = "减值科目编号")
    @TableField("decSubjectId")
    private Integer decSubjectId;

    @ApiModelProperty(value = "科目名称")
    @TableField("decSubjectName")
    private String decSubjectName;

    @ApiModelProperty(value = "制单人签名")
    @TableField("makerSign")
    private String makerSign;

    @ApiModelProperty(value = "复核人签名")
    @TableField("permitterSign")
    private String permitterSign;

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

    public static final String WAREID = "wareId";

    public static final String WARENAME = "wareName";

    public static final String SUNQTY = "sunQty";

    public static final String SUMCOST = "sumCost";

    public static final String VOUCHERNO = "voucherNo";

    public static final String SALESID = "salesId";

    public static final String SALESNAME = "salesName";

    public static final String DEPARTID = "departId";

    public static final String DEPARTNAME = "departName";

    public static final String ENGNAME = "engName";

    public static final String MEMO = "memo";

    public static final String ZEROFILTER = "zeroFilter";

    public static final String SUMCURQTY = "sumCurQty";

    public static final String SUMCHECKQTY = "sumCheckQty";

    public static final String INCSUBJECTID = "incSubjectId";

    public static final String INCSUBJECTNAME = "incSubjectName";

    public static final String DECSUBJECTID = "decSubjectId";

    public static final String DECSUBJECTNAME = "decSubjectName";

    public static final String MAKERSIGN = "makerSign";

    public static final String PERMITTERSIGN = "permitterSign";

    public static final String MESSTATE = "messtate";

    public static final String MESTRASH = "mestrash";

    public static final String MESPRESERVINGONE = "mespreservingOne";

    public static final String MESPRESERVINGTWO = "mespreservingTwo";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
