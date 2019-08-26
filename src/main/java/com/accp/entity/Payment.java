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
@ApiModel(value="Payment对象", description="")
public class Payment extends Model<Payment> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "应付冲款单单号")
    private String payid;

    @ApiModelProperty(value = "单据日期")
    private LocalDate paydate;

    @ApiModelProperty(value = "供应商ID")
    private String purveyid;

    @ApiModelProperty(value = "供应商名称")
    private String purveyname;

    @ApiModelProperty(value = "结算方式一")
    private String paystrikeone;

    @ApiModelProperty(value = "结算方式二")
    private String paystriketwo;

    @ApiModelProperty(value = "结算方式三")
    private String paystrikethree;

    @ApiModelProperty(value = "结算方式一金额")
    private Float paymoneyone;

    @ApiModelProperty(value = "结算方式二金额")
    private Float paymoneytwo;

    @ApiModelProperty(value = "结算方式三金额")
    private Float paymoneythree;

    @ApiModelProperty(value = "制单人员")
    private String paymakeing;

    @ApiModelProperty(value = "制单人所属部门")
    private String paydept;

    @ApiModelProperty(value = "部门ID （伪ID）")
    private String stodeptid;

    @ApiModelProperty(value = "审核人员")
    private String paycheckman;

    @ApiModelProperty(value = "备注")
    private String payremark;

    @ApiModelProperty(value = "是否审核")
    private Integer isaditing;

    @ApiModelProperty(value = "保留字段一")
    private String safetyone;

    @ApiModelProperty(value = "保留字段二")
    private String safetytwo;


    public static final String PAYID = "payid";

    public static final String PAYDATE = "paydate";

    public static final String PURVEYID = "purveyid";

    public static final String PURVEYNAME = "purveyname";

    public static final String PAYSTRIKEONE = "paystrikeone";

    public static final String PAYSTRIKETWO = "paystriketwo";

    public static final String PAYSTRIKETHREE = "paystrikethree";

    public static final String PAYMONEYONE = "paymoneyone";

    public static final String PAYMONEYTWO = "paymoneytwo";

    public static final String PAYMONEYTHREE = "paymoneythree";

    public static final String PAYMAKEING = "paymakeing";

    public static final String PAYDEPT = "paydept";

    public static final String STODEPTID = "stodeptid";

    public static final String PAYCHECKMAN = "paycheckman";

    public static final String PAYREMARK = "payremark";

    public static final String ISADITING = "isaditing";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.payid;
    }

}
