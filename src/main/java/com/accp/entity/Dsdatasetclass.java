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
@ApiModel(value="Dsdatasetclass对象", description="")
public class Dsdatasetclass extends Model<Dsdatasetclass> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类别编号")
    private String classid;

    @ApiModelProperty(value = "类别名称")
    private String classname;

    @ApiModelProperty(value = "英文名称")
    private String engname;

    @ApiModelProperty(value = "备注")
    private String memo;


    public static final String CLASSID = "classid";

    public static final String CLASSNAME = "classname";

    public static final String ENGNAME = "engname";

    public static final String MEMO = "memo";

    @Override
    protected Serializable pkVal() {
        return this.classid;
    }

}
