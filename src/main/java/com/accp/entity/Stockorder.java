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
@ApiModel(value="Stockorder对象", description="")
public class Stockorder extends Model<Stockorder> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号")
    private String stoid;

    @ApiModelProperty(value = "日期")
    private LocalDate stodate;

    @ApiModelProperty(value = "供货商编号")
    private Integer stopeoid;

    @ApiModelProperty(value = "供货商地址")
    private String stopeoadress;

    @ApiModelProperty(value = "单价是否含税：1-含税，2-未税")
    private String stoistax;

    @ApiModelProperty(value = "单况：1-未结案，2-已结案，3-无效")
    private Integer stostate;

    @ApiModelProperty(value = "送货地址")
    private String stoadress;

    @ApiModelProperty(value = "采购人员")
    private Integer stopersonid;

    @ApiModelProperty(value = "部门id")
    private Integer stodeptid;

    @ApiModelProperty(value = "制单人员")
    private String stoempname;

    @ApiModelProperty(value = "复核人员")
    private String stoempcheck;

    @ApiModelProperty(value = "备注")
    private String stomark;

    @ApiModelProperty(value = "默认1未审核，0：审核")
    private Integer checkstate;

    @ApiModelProperty(value = "默认1不删除，0：删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String STOID = "stoid";

    public static final String STODATE = "stodate";

    public static final String STOPEOID = "stopeoid";

    public static final String STOPEOADRESS = "stopeoadress";

    public static final String STOISTAX = "stoistax";

    public static final String STOSTATE = "stostate";

    public static final String STOADRESS = "stoadress";

    public static final String STOPERSONID = "stopersonid";

    public static final String STODEPTID = "stodeptid";

    public static final String STOEMPNAME = "stoempname";

    public static final String STOEMPCHECK = "stoempcheck";

    public static final String STOMARK = "stomark";

    public static final String CHECKSTATE = "checkstate";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.stoid;
    }

}
