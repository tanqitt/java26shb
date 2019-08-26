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
@ApiModel(value="PurchasereturnsMaintable对象", description="")
public class PurchasereturnsMaintable extends Model<PurchasereturnsMaintable> {

    private static final long serialVersionUID = 1L;

    private Integer purchasereturnsid;

    private Integer custid;

    private String custshorname;

    private String custaddress;

    private LocalDate billdate;

    private Integer billno;

    private Integer isdaduct;

    private Integer wareid;

    private String warename;

    private Integer priceoftax;

    private Integer currid;

    private String currencyname;

    private Integer exchrate;

    private Integer hasforeigntrade;

    private Integer salesid;

    private String salesname;

    private Integer deparid;

    private String deparname;

    private Integer projectid;

    private String projectname;

    private String maker;

    private String permitter;

    private Integer estate;


    public static final String PURCHASERETURNSID = "purchasereturnsid";

    public static final String CUSTID = "custid";

    public static final String CUSTSHORNAME = "custshorname";

    public static final String CUSTADDRESS = "custaddress";

    public static final String BILLDATE = "billdate";

    public static final String BILLNO = "billno";

    public static final String ISDADUCT = "isdaduct";

    public static final String WAREID = "wareid";

    public static final String WARENAME = "warename";

    public static final String PRICEOFTAX = "priceoftax";

    public static final String CURRID = "currid";

    public static final String CURRENCYNAME = "currencyname";

    public static final String EXCHRATE = "exchrate";

    public static final String HASFOREIGNTRADE = "hasforeigntrade";

    public static final String SALESID = "salesid";

    public static final String SALESNAME = "salesname";

    public static final String DEPARID = "deparid";

    public static final String DEPARNAME = "deparname";

    public static final String PROJECTID = "projectid";

    public static final String PROJECTNAME = "projectname";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String ESTATE = "estate";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
