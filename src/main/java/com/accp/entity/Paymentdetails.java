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
@ApiModel(value="Paymentdetails对象", description="")
public class Paymentdetails extends Model<Paymentdetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "应付冲款单单号")
    private String payid;

    @ApiModelProperty(value = "行号")
    private String paydetid;

    @ApiModelProperty(value = "来源单别")
    private String paydetoddtype;

    @ApiModelProperty(value = "来源单号")
    private String paydetoddid;

    @ApiModelProperty(value = "原单金额")
    private Float formeroddmoney;

    @ApiModelProperty(value = "现行余额")
    private Float nocebalance;

    @ApiModelProperty(value = "折让金额")
    private Float payzr;

    @ApiModelProperty(value = "冲款金额")
    private Float paydetmoney;

    @ApiModelProperty(value = "取用预付")
    private Float takadvmoney;

    @ApiModelProperty(value = "冲抵金额")
    private Float rushmoney;

    @ApiModelProperty(value = "保留字段一")
    private String safetyone;

    @ApiModelProperty(value = "保留字段二")
    private String safetytwo;


    public static final String PAYID = "payid";

    public static final String PAYDETID = "paydetid";

    public static final String PAYDETODDTYPE = "paydetoddtype";

    public static final String PAYDETODDID = "paydetoddid";

    public static final String FORMERODDMONEY = "formeroddmoney";

    public static final String NOCEBALANCE = "nocebalance";

    public static final String PAYZR = "payzr";

    public static final String PAYDETMONEY = "paydetmoney";

    public static final String TAKADVMONEY = "takadvmoney";

    public static final String RUSHMONEY = "rushmoney";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.payid;
    }

}
