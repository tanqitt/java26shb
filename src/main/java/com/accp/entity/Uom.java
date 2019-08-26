package com.accp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="Uom对象", description="")
public class Uom extends Model<Uom> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "计量单位id")
    @TableId(value = "uomID", type = IdType.AUTO)
    private Integer uomID;

    @ApiModelProperty(value = "计量名称")
    @TableField("uomName")
    private String uomName;


    public static final String UOMID = "uomID";

    public static final String UOMNAME = "uomName";

    @Override
    protected Serializable pkVal() {
        return this.uomID;
    }

}
