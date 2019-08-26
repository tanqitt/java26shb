package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="Dsproductclass对象", description="")
public class Dsproductclass extends Model<Dsproductclass> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类别编号")
    private String classid;

    @ApiModelProperty(value = "类别名称")
    private String classname;

    @ApiModelProperty(value = "英文名称")
    private String engname;

    @ApiModelProperty(value = "存活科目")
    private String accinventoryid;

    @ApiModelProperty(value = "科目名称")
    private String accinventoryname;

    @ApiModelProperty(value = "科目名称")
    private String acpurchasedname;

    @ApiModelProperty(value = "科目名称")
    private String returnpurchasename;

    @ApiModelProperty(value = "销售收入科目编号")
    private String accsaleid;

    @ApiModelProperty(value = "科目名称")
    private String accsalename;

    @ApiModelProperty(value = "销售成本科目编号")
    private String accsalecostid;

    @ApiModelProperty(value = "科目名称")
    private String accsalecostname;

    @ApiModelProperty(value = "销售退回科目编号")
    private String returnsaleid;

    @ApiModelProperty(value = "科目名称")
    @TableField("Returnsalename")
    private String Returnsalename;

    @ApiModelProperty(value = "赠品费用科目编号")
    private String giftexpenseid;

    @ApiModelProperty(value = "科目名称")
    private String giftexpensename;

    @ApiModelProperty(value = "其他收入科目编号")
    private String otherincomeid;

    @ApiModelProperty(value = "科目名称")
    private String otherincomename;

    @ApiModelProperty(value = "其他费用科目编号")
    private String otherexpenseid;

    @ApiModelProperty(value = "科目名称")
    private String otherexpensename;

    @ApiModelProperty(value = "其他成本科目编号")
    private String othercostid;

    @ApiModelProperty(value = "科目名称")
    private String othercostname;

    @ApiModelProperty(value = "备注")
    private String memo;


    public static final String CLASSID = "classid";

    public static final String CLASSNAME = "classname";

    public static final String ENGNAME = "engname";

    public static final String ACCINVENTORYID = "accinventoryid";

    public static final String ACCINVENTORYNAME = "accinventoryname";

    public static final String ACPURCHASEDNAME = "acpurchasedname";

    public static final String RETURNPURCHASENAME = "returnpurchasename";

    public static final String ACCSALEID = "accsaleid";

    public static final String ACCSALENAME = "accsalename";

    public static final String ACCSALECOSTID = "accsalecostid";

    public static final String ACCSALECOSTNAME = "accsalecostname";

    public static final String RETURNSALEID = "returnsaleid";

    public static final String RETURNSALENAME = "Returnsalename";

    public static final String GIFTEXPENSEID = "giftexpenseid";

    public static final String GIFTEXPENSENAME = "giftexpensename";

    public static final String OTHERINCOMEID = "otherincomeid";

    public static final String OTHERINCOMENAME = "otherincomename";

    public static final String OTHEREXPENSEID = "otherexpenseid";

    public static final String OTHEREXPENSENAME = "otherexpensename";

    public static final String OTHERCOSTID = "othercostid";

    public static final String OTHERCOSTNAME = "othercostname";

    public static final String MEMO = "memo";

    @Override
    protected Serializable pkVal() {
        return this.classid;
    }

}
