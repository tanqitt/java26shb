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
@ApiModel(value="Depttab对象", description="")
public class Depttab extends Model<Depttab> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "部门编号")
    private String depid;

    @ApiModelProperty(value = "部门名称")
    private String depname;

    @ApiModelProperty(value = "备注")
    private String depremark;

    @ApiModelProperty(value = "是否废码")
    private String deptrash;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;


    public static final String DEPID = "depid";

    public static final String DEPNAME = "depname";

    public static final String DEPREMARK = "depremark";

    public static final String DEPTRASH = "deptrash";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.depid;
    }

}
