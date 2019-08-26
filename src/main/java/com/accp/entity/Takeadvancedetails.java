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
@ApiModel(value="Takeadvancedetails对象", description="")
public class Takeadvancedetails extends Model<Takeadvancedetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "应付冲款单单号")
    private String payid;

    @ApiModelProperty(value = "行号")
    private String takid;

    @ApiModelProperty(value = "预收单单号")
    private String advid;

    @ApiModelProperty(value = "预收单行号")
    private String advdetid;

    @ApiModelProperty(value = "取用预收金额")
    private Float takadvmoney;

    @ApiModelProperty(value = "保留字段一")
    private String safetyone;

    @ApiModelProperty(value = "保留字段二")
    private String safetytwo;


    public static final String PAYID = "payid";

    public static final String TAKID = "takid";

    public static final String ADVID = "advid";

    public static final String ADVDETID = "advdetid";

    public static final String TAKADVMONEY = "takadvmoney";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.payid;
    }

}
