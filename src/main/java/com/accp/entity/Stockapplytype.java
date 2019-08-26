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
@ApiModel(value="Stockapplytype对象", description="")
public class Stockapplytype extends Model<Stockapplytype> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类型编号")
    private String aptid;

    @ApiModelProperty(value = "类型名称")
    private String aptname;

    @ApiModelProperty(value = "英文名称")
    private String aptename;

    @ApiModelProperty(value = "备注")
    private String aptremark;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enable;


    public static final String APTID = "aptid";

    public static final String APTNAME = "aptname";

    public static final String APTENAME = "aptename";

    public static final String APTREMARK = "aptremark";

    public static final String ENABLE = "enable";

    @Override
    protected Serializable pkVal() {
        return this.aptid;
    }

}
