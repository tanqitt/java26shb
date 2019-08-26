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
@ApiModel(value="Stockinquire对象", description="")
public class Stockinquire extends Model<Stockinquire> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "询价单编号")
    private String stoid;

    @ApiModelProperty(value = "供应商")
    private Integer stopid;

    @ApiModelProperty(value = "供应商地址")
    private String stopaddress;

    @ApiModelProperty(value = "单据日期")
    private LocalDate sotdate;

    @ApiModelProperty(value = "有效日期")
    private LocalDate stoavdate;

    @ApiModelProperty(value = "是否含税(含税/未含税)")
    private String stoistax;

    @ApiModelProperty(value = "送货地址")
    private String stodaddress;

    @ApiModelProperty(value = "制单人员")
    private String stomakeperson;

    @ApiModelProperty(value = "复核人员")
    private String stoauditingperson;

    @ApiModelProperty(value = "采购人员")
    private Integer stopersonid;

    @ApiModelProperty(value = "所属部门")
    private Integer stodeptid;

    @ApiModelProperty(value = "审核状态：未审核/已审核/无效")
    private String stoauditing;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String STOID = "stoid";

    public static final String STOPID = "stopid";

    public static final String STOPADDRESS = "stopaddress";

    public static final String SOTDATE = "sotdate";

    public static final String STOAVDATE = "stoavdate";

    public static final String STOISTAX = "stoistax";

    public static final String STODADDRESS = "stodaddress";

    public static final String STOMAKEPERSON = "stomakeperson";

    public static final String STOAUDITINGPERSON = "stoauditingperson";

    public static final String STOPERSONID = "stopersonid";

    public static final String STODEPTID = "stodeptid";

    public static final String STOAUDITING = "stoauditing";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.stoid;
    }

}
