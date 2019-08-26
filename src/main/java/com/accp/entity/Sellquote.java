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
@ApiModel(value="Sellquote对象", description="")
public class Sellquote extends Model<Sellquote> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billNo")
    private String billNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "单据类型")
    @TableField("sinId")
    private Integer sinId;

    @ApiModelProperty(value = "单据名称")
    @TableField("sinName")
    private String sinName;

    @ApiModelProperty(value = "客户编号")
    @TableField("custID")
    private Integer custID;

    @ApiModelProperty(value = "客户简称")
    @TableField("formaCust")
    private String formaCust;

    @ApiModelProperty(value = "地址编号")
    @TableField("custAreaID")
    private Integer custAreaID;

    @ApiModelProperty(value = "地址")
    @TableField("custAreaName")
    private String custAreaName;

    @ApiModelProperty(value = "有效日期")
    @TableField("validDate")
    private LocalDate validDate;

    @ApiModelProperty(value = "币别")
    @TableField("currID")
    private String currID;

    @ApiModelProperty(value = "单价是否含税")
    @TableField("priceOfTax")
    private String priceOfTax;

    @ApiModelProperty(value = "业务人员编号")
    @TableField("salasID")
    private Integer salasID;

    @ApiModelProperty(value = "业务人员")
    @TableField("salasName")
    private String salasName;

    @ApiModelProperty(value = "部门编号")
    @TableField("deparID")
    private Integer deparID;

    @ApiModelProperty(value = "所属部门")
    @TableField("deparName")
    private String deparName;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "审核状态")
    @TableField("checkstateID")
    private Integer checkstateID;

    @ApiModelProperty(value = "合计金额")
    @TableField("sumBTaxAmt")
    private Float sumBTaxAmt;

    @ApiModelProperty(value = "合计税额")
    @TableField("sumTax")
    private Float sumTax;

    @ApiModelProperty(value = "合计含税金额")
    @TableField("sumAmtTax")
    private Float sumAmtTax;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    @TableField("Safetyone")
    private String Safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytow;


    public static final String BILLNO = "billNo";

    public static final String BILLDATE = "billDate";

    public static final String SINID = "sinId";

    public static final String SINNAME = "sinName";

    public static final String CUSTID = "custID";

    public static final String FORMACUST = "formaCust";

    public static final String CUSTAREAID = "custAreaID";

    public static final String CUSTAREANAME = "custAreaName";

    public static final String VALIDDATE = "validDate";

    public static final String CURRID = "currID";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String SALASID = "salasID";

    public static final String SALASNAME = "salasName";

    public static final String DEPARID = "deparID";

    public static final String DEPARNAME = "deparName";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String CHECKSTATEID = "checkstateID";

    public static final String SUMBTAXAMT = "sumBTaxAmt";

    public static final String SUMTAX = "sumTax";

    public static final String SUMAMTTAX = "sumAmtTax";

    public static final String REMARK = "remark";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "Safetyone";

    public static final String SAFETYTOW = "safetytow";

    @Override
    protected Serializable pkVal() {
        return this.billNo;
    }

}
