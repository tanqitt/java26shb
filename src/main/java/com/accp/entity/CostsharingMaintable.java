package com.accp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="CostsharingMaintable对象", description="")
public class CostsharingMaintable extends Model<CostsharingMaintable> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "费用分摊表id")
    @TableId(value = "costsharingid", type = IdType.AUTO)
    private Integer costsharingid;

    @ApiModelProperty(value = "单价日期")
    private LocalDate billdate;

    @ApiModelProperty(value = "单据号码")
    private Integer billno;

    @ApiModelProperty(value = "分摊方式")
    @TableField("assignStyle")
    private Integer assignStyle;

    @ApiModelProperty(value = "待摊金额本位币")
    private Double amountamortizedcurrency;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "审核状态")
    private Integer estate;


    public static final String COSTSHARINGID = "costsharingid";

    public static final String BILLDATE = "billdate";

    public static final String BILLNO = "billno";

    public static final String ASSIGNSTYLE = "assignStyle";

    public static final String AMOUNTAMORTIZEDCURRENCY = "amountamortizedcurrency";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String ESTATE = "estate";

    @Override
    protected Serializable pkVal() {
        return this.costsharingid;
    }

}
