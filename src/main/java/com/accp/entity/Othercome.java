package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@ApiModel(value="Othercome对象", description="")
public class Othercome extends Model<Othercome> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billNO")
    private String billNO;

    @ApiModelProperty(value = "单据日期")
    @TableField("adJustDate")
    private LocalDate adJustDate;

    @ApiModelProperty(value = "入库类型")
    @TableField("billStyleID")
    private String billStyleID;

    @ApiModelProperty(value = "仓库")
    @TableField("WareID")
    private String WareID;

    @ApiModelProperty(value = "入库人员")
    @TableField("salesName")
    private String salesName;

    @ApiModelProperty(value = "所属部门")
    @TableField("departID")
    private String departID;

    @ApiModelProperty(value = "制单人员")
    private String marke;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "是否废码")
    private Integer clitrash;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String BILLNO = "billNO";

    public static final String ADJUSTDATE = "adJustDate";

    public static final String BILLSTYLEID = "billStyleID";

    public static final String WAREID = "WareID";

    public static final String SALESNAME = "salesName";

    public static final String DEPARTID = "departID";

    public static final String MARKE = "marke";

    public static final String PERMITTER = "permitter";

    public static final String CLITRASH = "clitrash";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billNO;
    }

}
