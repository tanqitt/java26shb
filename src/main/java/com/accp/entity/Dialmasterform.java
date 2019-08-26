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
@ApiModel(value="Dialmasterform对象", description="")
public class Dialmasterform extends Model<Dialmasterform> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("moveNo")
    private Integer moveNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("moveDate")
    private LocalDate moveDate;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "数量合计")
    @TableField("sumQty")
    private Double sumQty;

    @ApiModelProperty(value = "备注")
    private String reark;

    @ApiModelProperty(value = "自定栏一")
    @TableField("uDefOne")
    private String uDefOne;

    @ApiModelProperty(value = "自定栏二")
    @TableField("uDefTwo")
    private String uDefTwo;

    @ApiModelProperty(value = "调出仓库")
    @TableField("wareOutId")
    private String wareOutId;

    @ApiModelProperty(value = "调出仓库名称")
    @TableField("wareOutName")
    private String wareOutName;

    @ApiModelProperty(value = "调入仓库")
    @TableField("wareId")
    private String wareId;

    @ApiModelProperty(value = "调入仓库名称")
    @TableField("wareName")
    private String wareName;

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


    public static final String MOVENO = "moveNo";

    public static final String MOVEDATE = "moveDate";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String SUMQTY = "sumQty";

    public static final String REARK = "reark";

    public static final String UDEFONE = "uDefOne";

    public static final String UDEFTWO = "uDefTwo";

    public static final String WAREOUTID = "wareOutId";

    public static final String WAREOUTNAME = "wareOutName";

    public static final String WAREID = "wareId";

    public static final String WARENAME = "wareName";

    public static final String MAKERSIGN = "makerSign";

    public static final String PERMITTERSIGN = "permitterSign";

    public static final String MESSTATE = "messtate";

    public static final String MESTRASH = "mestrash";

    public static final String MESPRESERVINGONE = "mespreservingOne";

    public static final String MESPRESERVINGTWO = "mespreservingTwo";

    @Override
    protected Serializable pkVal() {
        return this.moveNo;
    }

}
