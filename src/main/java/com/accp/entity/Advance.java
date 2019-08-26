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
@ApiModel(value="Advance对象", description="")
public class Advance extends Model<Advance> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "预付单单号")
    private String advid;

    @ApiModelProperty(value = "单据日期")
    private LocalDate advdate;

    @ApiModelProperty(value = "供应商ID")
    private String purveyid;

    @ApiModelProperty(value = "供应商名称")
    private String purveyname;

    @ApiModelProperty(value = "结算方式一")
    private String advstrikeone;

    @ApiModelProperty(value = "结算方式二")
    private String advstriketwo;

    @ApiModelProperty(value = "结算方式三")
    private String advstrikethree;

    @ApiModelProperty(value = "结算方式一金额")
    private Float advmoneyone;

    @ApiModelProperty(value = "结算方式二金额")
    private Float advmoneytwo;

    @ApiModelProperty(value = "结算方式三金额")
    private Float advmoneythree;

    @ApiModelProperty(value = "制单人员")
    private String advmakeing;

    @ApiModelProperty(value = "制单人所属部门")
    private String stodept;

    @ApiModelProperty(value = "部门ID")
    private String stodeptid;

    @ApiModelProperty(value = "复核人员")
    private String advcheckman;

    @ApiModelProperty(value = "备注")
    private String advremark;

    @ApiModelProperty(value = "是否审核")
    private Integer isaditing;

    @ApiModelProperty(value = "保留字段一")
    private String safetyone;

    @ApiModelProperty(value = "保留字段二")
    private String safetytwo;


    public static final String ADVID = "advid";

    public static final String ADVDATE = "advdate";

    public static final String PURVEYID = "purveyid";

    public static final String PURVEYNAME = "purveyname";

    public static final String ADVSTRIKEONE = "advstrikeone";

    public static final String ADVSTRIKETWO = "advstriketwo";

    public static final String ADVSTRIKETHREE = "advstrikethree";

    public static final String ADVMONEYONE = "advmoneyone";

    public static final String ADVMONEYTWO = "advmoneytwo";

    public static final String ADVMONEYTHREE = "advmoneythree";

    public static final String ADVMAKEING = "advmakeing";

    public static final String STODEPT = "stodept";

    public static final String STODEPTID = "stodeptid";

    public static final String ADVCHECKMAN = "advcheckman";

    public static final String ADVREMARK = "advremark";

    public static final String ISADITING = "isaditing";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.advid;
    }

}
