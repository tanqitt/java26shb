package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="CostsharingResult对象", description="")
public class CostsharingResult extends Model<CostsharingResult> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "栏号")
    private Integer serno;

    @ApiModelProperty(value = "采购入库单号(单据日期)")
    private Integer billno;

    @ApiModelProperty(value = "物料编号")
    private String prodid;

    @ApiModelProperty(value = "物料名称")
    private String prodname;

    @ApiModelProperty(value = "规格型号")
    private String prodsize;

    @ApiModelProperty(value = "采购金额(采购入库金额)")
    private Double amount;

    @ApiModelProperty(value = "单位编号")
    private Integer sunitid;

    @ApiModelProperty(value = "单位名称")
    private String sunit;

    @ApiModelProperty(value = "数量")
    private Integer squantity;

    @ApiModelProperty(value = "重量")
    private String weight;

    @ApiModelProperty(value = "材积")
    private String volume;

    @ApiModelProperty(value = "分摊金额")
    private Double mlamount;


    public static final String SERNO = "serno";

    public static final String BILLNO = "billno";

    public static final String PRODID = "prodid";

    public static final String PRODNAME = "prodname";

    public static final String PRODSIZE = "prodsize";

    public static final String AMOUNT = "amount";

    public static final String SUNITID = "sunitid";

    public static final String SUNIT = "sunit";

    public static final String SQUANTITY = "squantity";

    public static final String WEIGHT = "weight";

    public static final String VOLUME = "volume";

    public static final String MLAMOUNT = "mlamount";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
