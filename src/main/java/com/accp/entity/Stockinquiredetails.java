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
@ApiModel(value="Stockinquiredetails对象", description="")
public class Stockinquiredetails extends Model<Stockinquiredetails> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty(value = "询价单编号")
    private String stoid;

    @ApiModelProperty(value = "行号")
    private Integer sdarows;

    @ApiModelProperty(value = "物料编号")
    private String sdamaterielid;

    @ApiModelProperty(value = "物料名称")
    private String sdamateridlname;

    @ApiModelProperty(value = "规格型号")
    private String sdamodel;

    @ApiModelProperty(value = "单位名称")
    private String sdaunit;

    @ApiModelProperty(value = "数量")
    private Integer sdanum;

    @ApiModelProperty(value = "折前单价")
    @TableField("Sdaagioes")
    private Double Sdaagioes;

    @ApiModelProperty(value = "折数(%)")
    private Integer sdaagiocess;

    @ApiModelProperty(value = "单价")
    private Double sdaprice;

    @ApiModelProperty(value = "金额")
    private Double sdamoney;

    @ApiModelProperty(value = "税率(%)")
    private Integer sdacess;

    @ApiModelProperty(value = "税额")
    private Double sdataxmoney;

    @ApiModelProperty(value = "含税金额")
    private Double sdataxmoneys;

    @ApiModelProperty(value = "赠品：是/否")
    private Integer sdaislargess;

    @ApiModelProperty(value = "来源单号")
    private String sdaoriginid;

    @ApiModelProperty(value = "来源单别")
    private String sdaorigintype;

    @ApiModelProperty(value = "备注")
    private String sdaremark;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String ID = "id";

    public static final String STOID = "stoid";

    public static final String SDAROWS = "sdarows";

    public static final String SDAMATERIELID = "sdamaterielid";

    public static final String SDAMATERIDLNAME = "sdamateridlname";

    public static final String SDAMODEL = "sdamodel";

    public static final String SDAUNIT = "sdaunit";

    public static final String SDANUM = "sdanum";

    public static final String SDAAGIOES = "Sdaagioes";

    public static final String SDAAGIOCESS = "sdaagiocess";

    public static final String SDAPRICE = "sdaprice";

    public static final String SDAMONEY = "sdamoney";

    public static final String SDACESS = "sdacess";

    public static final String SDATAXMONEY = "sdataxmoney";

    public static final String SDATAXMONEYS = "sdataxmoneys";

    public static final String SDAISLARGESS = "sdaislargess";

    public static final String SDAORIGINID = "sdaoriginid";

    public static final String SDAORIGINTYPE = "sdaorigintype";

    public static final String SDAREMARK = "sdaremark";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
