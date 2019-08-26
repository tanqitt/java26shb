package com.accp.entity;

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
@ApiModel(value="Outboundtype对象", description="")
public class Outboundtype extends Model<Outboundtype> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类型编号")
    @TableId("classId")
    private Integer classId;

    @ApiModelProperty(value = "类型名称")
    @TableField("className")
    private String className;

    @ApiModelProperty(value = "英文名称")
    @TableField("engName")
    private String engName;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "借方科目")
    @TableField("accSubjectId")
    private Integer accSubjectId;

    @ApiModelProperty(value = "科目名称")
    @TableField("accSubjectName")
    private String accSubjectName;


    public static final String CLASSID = "classId";

    public static final String CLASSNAME = "className";

    public static final String ENGNAME = "engName";

    public static final String MEMO = "memo";

    public static final String ACCSUBJECTID = "accSubjectId";

    public static final String ACCSUBJECTNAME = "accSubjectName";

    @Override
    protected Serializable pkVal() {
        return this.classId;
    }

}
