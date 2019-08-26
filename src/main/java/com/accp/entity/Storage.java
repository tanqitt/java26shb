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
@ApiModel(value="Storage对象", description="")
public class Storage extends Model<Storage> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "仓库编号              仓库编号       仓库编号")
    private String stoid;

    @ApiModelProperty(value = "仓库名称")
    private String stoname;

    @ApiModelProperty(value = "仓库简称")
    private String stosimplename;

    @ApiModelProperty(value = "联系人")
    private String stoconnectper;

    @ApiModelProperty(value = "联系人ID(新增)")
    private String stoempid;

    @ApiModelProperty(value = "联系电话")
    private String stophone;

    @ApiModelProperty(value = "仓库地址")
    private String stoaddress;

    @ApiModelProperty(value = "备注")
    private String storemark;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;


    public static final String STOID = "stoid";

    public static final String STONAME = "stoname";

    public static final String STOSIMPLENAME = "stosimplename";

    public static final String STOCONNECTPER = "stoconnectper";

    public static final String STOEMPID = "stoempid";

    public static final String STOPHONE = "stophone";

    public static final String STOADDRESS = "stoaddress";

    public static final String STOREMARK = "storemark";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.stoid;
    }

}
