package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@ApiModel(value="Stockorderdetails对象", description="")
public class Stockorderdetails extends Model<Stockorderdetails> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty(value = "单据号")
    private String sodid;

    @ApiModelProperty(value = "行号")
    private Integer sodlineid;

    @ApiModelProperty(value = "物料编号")
    private String sodmaterielid;

    @ApiModelProperty(value = "物料名称")
    private String sodmatid;

    @ApiModelProperty(value = "(规格型号)")
    private String sodspec;

    @ApiModelProperty(value = "数量")
    private Integer sodamount;

    @ApiModelProperty(value = "折扣前单价")
    private Double sodpreprice;

    @ApiModelProperty(value = "折数（%）")
    private Integer sodagio;

    @ApiModelProperty(value = "单价")
    private Double sodprice;

    @ApiModelProperty(value = "金额")
    private Double sodsum;

    @ApiModelProperty(value = "税率（%）")
    private Integer sodcess;

    @ApiModelProperty(value = "税额")
    private Double sodsumcess;

    @ApiModelProperty(value = "含税金额")
    private Double sodsumprice;

    @ApiModelProperty(value = "预入库日")
    private LocalDate sodpreincomestorage;

    @ApiModelProperty(value = "是否赠品：1-是，0-否")
    private Integer sodpresent;

    @ApiModelProperty(value = "来源单别")
    private String sodorigintype;

    @ApiModelProperty(value = "来源单号")
    private String sodorigin;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String ID = "id";

    public static final String SODID = "sodid";

    public static final String SODLINEID = "sodlineid";

    public static final String SODMATERIELID = "sodmaterielid";

    public static final String SODMATID = "sodmatid";

    public static final String SODSPEC = "sodspec";

    public static final String SODAMOUNT = "sodamount";

    public static final String SODPREPRICE = "sodpreprice";

    public static final String SODAGIO = "sodagio";

    public static final String SODPRICE = "sodprice";

    public static final String SODSUM = "sodsum";

    public static final String SODCESS = "sodcess";

    public static final String SODSUMCESS = "sodsumcess";

    public static final String SODSUMPRICE = "sodsumprice";

    public static final String SODPREINCOMESTORAGE = "sodpreincomestorage";

    public static final String SODPRESENT = "sodpresent";

    public static final String SODORIGINTYPE = "sodorigintype";

    public static final String SODORIGIN = "sodorigin";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
