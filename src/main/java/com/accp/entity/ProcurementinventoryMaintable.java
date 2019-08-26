package com.accp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="ProcurementinventoryMaintable对象", description="")
public class ProcurementinventoryMaintable extends Model<ProcurementinventoryMaintable> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "采购入库表id")
    @TableId(value = "procurementinventoryid", type = IdType.AUTO)
    private Integer procurementinventoryid;

    @ApiModelProperty(value = "供应商编号")
    private Integer custid;

    @ApiModelProperty(value = "供应商简称")
    private String custshorname;

    @ApiModelProperty(value = "供应商地址")
    private String custaddress;

    @ApiModelProperty(value = "单据日期")
    private LocalDate billdate;

    @ApiModelProperty(value = "单据号码")
    private Integer billno;

    @ApiModelProperty(value = "采购入库类型编号")
    private Integer saleclassid;

    @ApiModelProperty(value = "采购入库类型名称")
    private String saleclassname;

    @ApiModelProperty(value = "仓库编号")
    private Integer wareid;

    @ApiModelProperty(value = "仓库名称")
    private String warename;

    @ApiModelProperty(value = "单价是否含税")
    private Integer priceoftax;

    @ApiModelProperty(value = "币别编号")
    private Integer currid;

    @ApiModelProperty(value = "币别名称")
    private String currencyname;

    @ApiModelProperty(value = "汇率")
    private Integer exchrate;

    @ApiModelProperty(value = "国外贸易")
    private Integer hasforeigntrade;

    @ApiModelProperty(value = "采购人员编号")
    private Integer salesid;

    @ApiModelProperty(value = "采购人员名称")
    private String salesname;

    @ApiModelProperty(value = "所属部门编号")
    private Integer deparid;

    @ApiModelProperty(value = "所属部门名称")
    private String deparname;

    @ApiModelProperty(value = "所属项目编号")
    private Integer projectid;

    @ApiModelProperty(value = "所属项目名称")
    private String projectname;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "审核状态")
    private Integer estate;


    public static final String PROCUREMENTINVENTORYID = "procurementinventoryid";

    public static final String CUSTID = "custid";

    public static final String CUSTSHORNAME = "custshorname";

    public static final String CUSTADDRESS = "custaddress";

    public static final String BILLDATE = "billdate";

    public static final String BILLNO = "billno";

    public static final String SALECLASSID = "saleclassid";

    public static final String SALECLASSNAME = "saleclassname";

    public static final String WAREID = "wareid";

    public static final String WARENAME = "warename";

    public static final String PRICEOFTAX = "priceoftax";

    public static final String CURRID = "currid";

    public static final String CURRENCYNAME = "currencyname";

    public static final String EXCHRATE = "exchrate";

    public static final String HASFOREIGNTRADE = "hasforeigntrade";

    public static final String SALESID = "salesid";

    public static final String SALESNAME = "salesname";

    public static final String DEPARID = "deparid";

    public static final String DEPARNAME = "deparname";

    public static final String PROJECTID = "projectid";

    public static final String PROJECTNAME = "projectname";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String ESTATE = "estate";

    @Override
    protected Serializable pkVal() {
        return this.procurementinventoryid;
    }

}
