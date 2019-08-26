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
@ApiModel(value="ProcurementinventoryDetaikstable对象", description="")
public class ProcurementinventoryDetaikstable extends Model<ProcurementinventoryDetaikstable> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "栏号")
    private Integer serno;

    @ApiModelProperty(value = "物料编号")
    private String prodid;

    @ApiModelProperty(value = "物料名称")
    private String prodname;

    @ApiModelProperty(value = "规格型号")
    private String prodsize;

    @ApiModelProperty(value = "单位编号")
    private Integer sunitid;

    @ApiModelProperty(value = "单位名称")
    private String sunit;

    @ApiModelProperty(value = "数量")
    private Integer squantity;

    @ApiModelProperty(value = "折扣前单价")
    private Double oldprice;

    @ApiModelProperty(value = "折数")
    private Integer discount;

    @ApiModelProperty(value = "单价")
    private Double sprice;

    @ApiModelProperty(value = "金额")
    private Double amount;

    @ApiModelProperty(value = "税率")
    private Integer taxrate;

    @ApiModelProperty(value = "税额")
    private Double taxamt;

    @ApiModelProperty(value = "含税金额")
    private Double amounttax;

    @ApiModelProperty(value = "批号")
    private Integer batchid;

    @ApiModelProperty(value = "是否赠品")
    private Integer isgift;

    @ApiModelProperty(value = "发票明细")
    private Integer hasinv;

    @ApiModelProperty(value = "未开票数量")
    private Integer notinvcount;

    @ApiModelProperty(value = "分录备注")
    private String itemremark;

    @ApiModelProperty(value = "来源单别")
    private String trantype;

    @ApiModelProperty(value = "来源单号")
    private String fromno;

    @ApiModelProperty(value = "分摊费用")
    private Double totalappfare;

    @ApiModelProperty(value = "数量合计")
    private Integer sumnum;

    @ApiModelProperty(value = "金额合计")
    private Double facttotal;

    @ApiModelProperty(value = "税额合计")
    private Double tax;

    @ApiModelProperty(value = "含税金额合计")
    private Double amounttaxtotal;

    @ApiModelProperty(value = "账款归属")
    private String dueto;

    @ApiModelProperty(value = "账款归属名称")
    private String duetoname;

    @ApiModelProperty(value = "付款条件")
    private Integer gatherstyle;

    @ApiModelProperty(value = "付款天数")
    private Integer gatherdelay;

    @ApiModelProperty(value = "账款月份")
    private LocalDate accmonth;

    @ApiModelProperty(value = "付款日期")
    private LocalDate prepayday;

    @ApiModelProperty(value = "自定义栏1")
    private String udef1;

    @ApiModelProperty(value = "自定义栏2")
    private String udef2;

    @ApiModelProperty(value = "备注")
    private String remark;


    public static final String SERNO = "serno";

    public static final String PRODID = "prodid";

    public static final String PRODNAME = "prodname";

    public static final String PRODSIZE = "prodsize";

    public static final String SUNITID = "sunitid";

    public static final String SUNIT = "sunit";

    public static final String SQUANTITY = "squantity";

    public static final String OLDPRICE = "oldprice";

    public static final String DISCOUNT = "discount";

    public static final String SPRICE = "sprice";

    public static final String AMOUNT = "amount";

    public static final String TAXRATE = "taxrate";

    public static final String TAXAMT = "taxamt";

    public static final String AMOUNTTAX = "amounttax";

    public static final String BATCHID = "batchid";

    public static final String ISGIFT = "isgift";

    public static final String HASINV = "hasinv";

    public static final String NOTINVCOUNT = "notinvcount";

    public static final String ITEMREMARK = "itemremark";

    public static final String TRANTYPE = "trantype";

    public static final String FROMNO = "fromno";

    public static final String TOTALAPPFARE = "totalappfare";

    public static final String SUMNUM = "sumnum";

    public static final String FACTTOTAL = "facttotal";

    public static final String TAX = "tax";

    public static final String AMOUNTTAXTOTAL = "amounttaxtotal";

    public static final String DUETO = "dueto";

    public static final String DUETONAME = "duetoname";

    public static final String GATHERSTYLE = "gatherstyle";

    public static final String GATHERDELAY = "gatherdelay";

    public static final String ACCMONTH = "accmonth";

    public static final String PREPAYDAY = "prepayday";

    public static final String UDEF1 = "udef1";

    public static final String UDEF2 = "udef2";

    public static final String REMARK = "remark";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
