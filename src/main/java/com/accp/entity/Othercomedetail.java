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
@ApiModel(value="Othercomedetail对象", description="")
public class Othercomedetail extends Model<Othercomedetail> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "其它入库主表id")
    @TableId("billNO")
    private String billNO;

    @ApiModelProperty(value = "栏号")
    @TableField("SerNo")
    private String SerNo;

    @ApiModelProperty(value = "物料编号")
    @TableField("ProdID")
    private String ProdID;

    @ApiModelProperty(value = "物料名称")
    @TableField("ProdName")
    private String ProdName;

    @ApiModelProperty(value = "规格型号")
    @TableField("ProdSize")
    private String ProdSize;

    @ApiModelProperty(value = "单位")
    @TableField("StuUnitName")
    private String StuUnitName;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "备注")
    @TableField("itemRemark")
    private String itemRemark;

    @ApiModelProperty(value = "是否废码")
    private Integer clitrash;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String BILLNO = "billNO";

    public static final String SERNO = "SerNo";

    public static final String PRODID = "ProdID";

    public static final String PRODNAME = "ProdName";

    public static final String PRODSIZE = "ProdSize";

    public static final String STUUNITNAME = "StuUnitName";

    public static final String QUANTITY = "quantity";

    public static final String ITEMREMARK = "itemRemark";

    public static final String CLITRASH = "clitrash";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billNO;
    }

}
