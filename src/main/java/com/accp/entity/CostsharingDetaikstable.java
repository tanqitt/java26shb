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
@ApiModel(value="CostsharingDetaikstable对象", description="")
public class CostsharingDetaikstable extends Model<CostsharingDetaikstable> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "栏号")
    private Integer serno;

    @ApiModelProperty(value = "费用编号")
    private Integer costid;

    @ApiModelProperty(value = "费用名称")
    private String costname;

    @ApiModelProperty(value = "币别编号")
    private Integer currid;

    @ApiModelProperty(value = "汇率")
    private String currencyname;

    @ApiModelProperty(value = "金额")
    private Double amount;

    @ApiModelProperty(value = "金额本位币")
    private Double amountamortizedcurrency;


    public static final String SERNO = "serno";

    public static final String COSTID = "costid";

    public static final String COSTNAME = "costname";

    public static final String CURRID = "currid";

    public static final String CURRENCYNAME = "currencyname";

    public static final String AMOUNT = "amount";

    public static final String AMOUNTAMORTIZEDCURRENCY = "amountamortizedcurrency";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
