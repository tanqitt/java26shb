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
@ApiModel(value="PurchasereturnsDetaikstable对象", description="")
public class PurchasereturnsDetaikstable extends Model<PurchasereturnsDetaikstable> {

    private static final long serialVersionUID = 1L;

    private Integer serno;

    private String prodid;

    private String prodname;

    private String prodsize;

    private Integer sunitid;

    private String sunit;

    private Integer squantity;

    private Double oldprice;

    private Integer discount;

    private Double sprice;

    private Double amount;

    private Integer taxrate;

    private Double taxamt;

    private Double amounttax;

    private Integer batchid;

    private Integer isgift;

    private Integer hasinv;

    private Integer notinvcount;

    private String itemremark;

    private String trantype;

    private String fromno;

    private Integer sumnum;

    private Double facttotal;

    private Double tax;

    private Double amounttaxtotal;

    private String dueto;

    private String duetoname;

    private Integer gatherstyle;

    private Integer gatherdelay;

    private LocalDate accmonth;

    private LocalDate prepayday;

    private String udef1;

    private String udef2;

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
