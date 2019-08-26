package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@ApiModel(value="Stockapply对象", description="")
public class Stockapply extends Model<Stockapply> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "请购单编号")
    private String appid;

    @ApiModelProperty(value = "请购单日期")
    private LocalDate appdate;

    @ApiModelProperty(value = "请购采购类型")
    private String apptype;

    @ApiModelProperty(value = "默认0 未结案，1：已结案  2：无效")
    private Integer appcircs;

    @ApiModelProperty(value = "请购人员id")
    private Integer apppersonid;

    @ApiModelProperty(value = "请购部门id")
    private Integer appdeptid;

    @ApiModelProperty(value = "制单人员")
    private String appmaker;

    @ApiModelProperty(value = "复核人员")
    private String appauditingperson;

    @ApiModelProperty(value = "审核状态：未审核/已审核/无效")
    private String appauditing;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String APPID = "appid";

    public static final String APPDATE = "appdate";

    public static final String APPTYPE = "apptype";

    public static final String APPCIRCS = "appcircs";

    public static final String APPPERSONID = "apppersonid";

    public static final String APPDEPTID = "appdeptid";

    public static final String APPMAKER = "appmaker";

    public static final String APPAUDITINGPERSON = "appauditingperson";

    public static final String APPAUDITING = "appauditing";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.appid;
    }

}
