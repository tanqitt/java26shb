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
@ApiModel(value="Advancedetails对象", description="")
public class Advancedetails extends Model<Advancedetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主表单号")
    private String advid;

    @ApiModelProperty(value = "行号")
    private Float advdetid;

    @ApiModelProperty(value = "预付金额")
    private Float advdetmoney;

    @ApiModelProperty(value = "来源单别")
    private String advdetoddtype;

    @ApiModelProperty(value = "来源单号")
    private String advdetoddid;

    @ApiModelProperty(value = "摘要")
    private String advdetdegest;

    @ApiModelProperty(value = "预付余额")
    private Float advdetbalance;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String ADVID = "advid";

    public static final String ADVDETID = "advdetid";

    public static final String ADVDETMONEY = "advdetmoney";

    public static final String ADVDETODDTYPE = "advdetoddtype";

    public static final String ADVDETODDID = "advdetoddid";

    public static final String ADVDETDEGEST = "advdetdegest";

    public static final String ADVDETBALANCE = "advdetbalance";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.advid;
    }

}
