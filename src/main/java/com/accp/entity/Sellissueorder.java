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
@ApiModel(value="Sellissueorder对象", description="")
public class Sellissueorder extends Model<Sellissueorder> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billId")
    private String billId;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "单据类型")
    @TableField("sinId")
    private Integer sinId;

    @ApiModelProperty(value = "单据名称")
    private String sinname;

    @ApiModelProperty(value = "客户编号")
    private String cliid;

    @ApiModelProperty(value = "客户简称")
    private String clishortname;

    @ApiModelProperty(value = "地址编号")
    private String cliplaceid;

    @ApiModelProperty(value = "地址")
    private String cliplace;

    @ApiModelProperty(value = "有效日期")
    private LocalDate effectdate;

    @ApiModelProperty(value = "币别")
    @TableField("currencyType")
    private String currencyType;

    @ApiModelProperty(value = "单价是否含税")
    @TableField("priceWhetherTax")
    private String priceWhetherTax;

    @ApiModelProperty(value = "仓库编号")
    private String stoid;

    @ApiModelProperty(value = "仓库名称")
    private String stoname;

    @ApiModelProperty(value = "业务人员编号")
    private String empid;

    @ApiModelProperty(value = "业务人员")
    @TableField("empName")
    private String empName;

    @ApiModelProperty(value = "部门编号")
    private String depid;

    @ApiModelProperty(value = "所属部门")
    @TableField("depName")
    private String depName;

    @ApiModelProperty(value = "制单人员")
    @TableField("makeEmpName")
    private String makeEmpName;

    @ApiModelProperty(value = "复核人员")
    @TableField("auditingEmpName")
    private String auditingEmpName;

    @ApiModelProperty(value = "审核状态")
    private Integer checkstate;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "合计金额")
    @TableField("totalMoney")
    private Integer totalMoney;

    @ApiModelProperty(value = "合计税额")
    @TableField("totalTax")
    private Integer totalTax;

    @ApiModelProperty(value = "合计含税金额")
    @TableField("totalTaxMoney")
    private Integer totalTaxMoney;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "备用字段")
    private String text1;

    @ApiModelProperty(value = "备用字段")
    private String text2;


    public static final String BILLID = "billId";

    public static final String BILLDATE = "billDate";

    public static final String SINID = "sinId";

    public static final String SINNAME = "sinname";

    public static final String CLIID = "cliid";

    public static final String CLISHORTNAME = "clishortname";

    public static final String CLIPLACEID = "cliplaceid";

    public static final String CLIPLACE = "cliplace";

    public static final String EFFECTDATE = "effectdate";

    public static final String CURRENCYTYPE = "currencyType";

    public static final String PRICEWHETHERTAX = "priceWhetherTax";

    public static final String STOID = "stoid";

    public static final String STONAME = "stoname";

    public static final String EMPID = "empid";

    public static final String EMPNAME = "empName";

    public static final String DEPID = "depid";

    public static final String DEPNAME = "depName";

    public static final String MAKEEMPNAME = "makeEmpName";

    public static final String AUDITINGEMPNAME = "auditingEmpName";

    public static final String CHECKSTATE = "checkstate";

    public static final String REMARK = "remark";

    public static final String TOTALMONEY = "totalMoney";

    public static final String TOTALTAX = "totalTax";

    public static final String TOTALTAXMONEY = "totalTaxMoney";

    public static final String ENABLES = "enables";

    public static final String TEXT1 = "text1";

    public static final String TEXT2 = "text2";

    @Override
    protected Serializable pkVal() {
        return this.billId;
    }

}
