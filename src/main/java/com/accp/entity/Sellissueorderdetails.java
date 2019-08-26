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
@ApiModel(value="Sellissueorderdetails对象", description="")
public class Sellissueorderdetails extends Model<Sellissueorderdetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billId")
    private String billId;

    @ApiModelProperty(value = "栏号")
    @TableField("coteMark")
    private Integer coteMark;

    @ApiModelProperty(value = "物料编号")
    private String matid;

    @ApiModelProperty(value = "物料名称")
    private String matname;

    @ApiModelProperty(value = "规格型号")
    private String matspec;

    @ApiModelProperty(value = "单位名称")
    private String matunit;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "折扣前单价")
    @TableField("agioAgoPrice")
    private Integer agioAgoPrice;

    @ApiModelProperty(value = "折数")
    private Integer agio;

    @ApiModelProperty(value = "单价")
    private Integer price;

    @ApiModelProperty(value = "金额")
    private Integer money;

    @ApiModelProperty(value = "税率")
    private Integer cess;

    @ApiModelProperty(value = "税额")
    private Integer taxmoney;

    @ApiModelProperty(value = "含税金额")
    private Integer intaxmoney;

    @ApiModelProperty(value = "赠品 1为是2为否")
    private Integer present;

    @ApiModelProperty(value = "实际成本")
    @TableField("factCost")
    private Integer factCost;

    @ApiModelProperty(value = "标准成本")
    @TableField("criterionCost")
    private Integer criterionCost;

    @ApiModelProperty(value = "来源单别")
    @TableField("sinName")
    private String sinName;

    @ApiModelProperty(value = "来源单号")
    @TableField("originBillId")
    private String originBillId;

    @ApiModelProperty(value = "标识是否删除 默认1不删除，0：删除")
    private Integer enables;

    @ApiModelProperty(value = "备用字段")
    private String text1;

    @ApiModelProperty(value = "备用字段")
    private String text2;


    public static final String BILLID = "billId";

    public static final String COTEMARK = "coteMark";

    public static final String MATID = "matid";

    public static final String MATNAME = "matname";

    public static final String MATSPEC = "matspec";

    public static final String MATUNIT = "matunit";

    public static final String NUMBER = "number";

    public static final String AGIOAGOPRICE = "agioAgoPrice";

    public static final String AGIO = "agio";

    public static final String PRICE = "price";

    public static final String MONEY = "money";

    public static final String CESS = "cess";

    public static final String TAXMONEY = "taxmoney";

    public static final String INTAXMONEY = "intaxmoney";

    public static final String PRESENT = "present";

    public static final String FACTCOST = "factCost";

    public static final String CRITERIONCOST = "criterionCost";

    public static final String SINNAME = "sinName";

    public static final String ORIGINBILLID = "originBillId";

    public static final String ENABLES = "enables";

    public static final String TEXT1 = "text1";

    public static final String TEXT2 = "text2";

    @Override
    protected Serializable pkVal() {
        return this.billId;
    }

}
