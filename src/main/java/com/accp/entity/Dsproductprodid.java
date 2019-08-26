package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@ApiModel(value="Dsproductprodid对象", description="")
public class Dsproductprodid extends Model<Dsproductprodid> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "物料编号")
    private String prodid;

    @ApiModelProperty(value = "物料类别")
    private String classid;

    @ApiModelProperty(value = "类别名称")
    private String classname;

    @ApiModelProperty(value = "条形码编号")
    private String barcodeid;

    @ApiModelProperty(value = "物料名称")
    private String prodname;

    @ApiModelProperty(value = "规格型号")
    private String prodsizi;

    @ApiModelProperty(value = "英文品名")
    private String engname;

    @ApiModelProperty(value = "使用币别")
    private String currid;

    @ApiModelProperty(value = "币别名称")
    private String currname;

    @ApiModelProperty(value = "建议售价")
    private String suggestprice;

    @ApiModelProperty(value = "售价A")
    @TableField("salespriceA")
    private String salespriceA;

    @ApiModelProperty(value = "售价B")
    @TableField("salespriceB")
    private String salespriceB;

    @ApiModelProperty(value = "售价C")
    @TableField("salespriceC")
    private String salespriceC;

    @ApiModelProperty(value = "售价D")
    @TableField("salespriceD")
    private String salespriceD;

    @ApiModelProperty(value = "售价E")
    @TableField("salespriceE")
    private String salespriceE;

    @ApiModelProperty(value = "标准进价")
    private String stdprice;

    @ApiModelProperty(value = "税率")
    private String busitaxrate;

    @ApiModelProperty(value = "使用批号管理")
    private String batchused;

    @ApiModelProperty(value = "使用出厂日期")
    private LocalDate effectdateused;

    @ApiModelProperty(value = "使用有效日期")
    private LocalDate validdateused;

    @ApiModelProperty(value = "有效天数")
    private String defvalidday;

    @ApiModelProperty(value = "物料说明")
    private String proddesc;

    @ApiModelProperty(value = "物料形态")
    private String prodform;

    @ApiModelProperty(value = "采购提前期")
    private String advancedays;

    @ApiModelProperty(value = "主供应商")
    private String majorsupplier;

    @ApiModelProperty(value = "供应商名称")
    private String majorsuppliername;

    @ApiModelProperty(value = "最初出库日")
    private LocalDate boutstockday;

    @ApiModelProperty(value = "最初入库日")
    private LocalDate binstockday;

    @ApiModelProperty(value = "呆滞起记天数")
    private String sluggishdays;

    @ApiModelProperty(value = "停用日期")
    private LocalDate invaliddate;

    @ApiModelProperty(value = "安全存量")
    private String safeqty;

    @ApiModelProperty(value = "20CY")
    private String cy20;

    @ApiModelProperty(value = "40CY")
    private String cy40;

    @ApiModelProperty(value = "40HQ")
    private String hq40;

    @ApiModelProperty(value = "45CY")
    private String cy45;

    @ApiModelProperty(value = "内包装容量")
    private String inpackamt;

    @ApiModelProperty(value = "外包装容量")
    private String outpackamt;

    @ApiModelProperty(value = "材积单位")
    private String volumeunit;

    @ApiModelProperty(value = "Measm’t")
    private String volume;

    @ApiModelProperty(value = "N.W")
    private String netweight;

    @ApiModelProperty(value = "G.W")
    private String grossweigh;

    @ApiModelProperty(value = "标准成本")
    private String bstdcost;

    @ApiModelProperty(value = "平均成本")
    private String bavgcost;

    @ApiModelProperty(value = "现行平均成本")
    private String cavgcost;

    @ApiModelProperty(value = "物料总成本")
    private String ctotalcost;

    @ApiModelProperty(value = "自定义栏一")
    private String udef1;

    @ApiModelProperty(value = "自定义栏二")
    private String udef2;

    @ApiModelProperty(value = "单价是否含税")
    private String priceoftax;

    @ApiModelProperty(value = "期初总成本")
    private String btotalcost;

    @ApiModelProperty(value = "计量单位")
    private String stdunitid;

    @ApiModelProperty(value = "单位名称")
    private String stdunitname;

    @ApiModelProperty(value = "英文单位")
    private String stdunitengname;

    @ApiModelProperty(value = "现有总数量")
    private String callamt;

    @ApiModelProperty(value = "单位净重")
    private String nweight;

    @ApiModelProperty(value = "包装物重量")
    private String gweight;

    @ApiModelProperty(value = "长")
    private String longdu;

    @ApiModelProperty(value = "长度单位")
    private String lunit;

    @ApiModelProperty(value = "宽")
    private String width;

    @ApiModelProperty(value = "高")
    private String higth;

    @ApiModelProperty(value = "Measm’t")
    private String mvolume;

    @ApiModelProperty(value = "产品打雷")
    private String probigtype;

    @ApiModelProperty(value = "退税率%")
    private String backtaxrate;

    @ApiModelProperty(value = "税目")
    private String taxitemsid;

    @ApiModelProperty(value = "期初总数量")
    private String ballamt;

    @ApiModelProperty(value = "实际在库存")
    private String bcurrstock;

    @ApiModelProperty(value = "安全总存量")
    private String bsafeallstk;

    @ApiModelProperty(value = "低于安全存量")
    private String csafeallstk;

    @ApiModelProperty(value = "实际在库量")
    private String ccurrstock;

    @ApiModelProperty(value = "标准总成本")
    private String cstdcost;


    public static final String PRODID = "prodid";

    public static final String CLASSID = "classid";

    public static final String CLASSNAME = "classname";

    public static final String BARCODEID = "barcodeid";

    public static final String PRODNAME = "prodname";

    public static final String PRODSIZI = "prodsizi";

    public static final String ENGNAME = "engname";

    public static final String CURRID = "currid";

    public static final String CURRNAME = "currname";

    public static final String SUGGESTPRICE = "suggestprice";

    public static final String SALESPRICEA = "salespriceA";

    public static final String SALESPRICEB = "salespriceB";

    public static final String SALESPRICEC = "salespriceC";

    public static final String SALESPRICED = "salespriceD";

    public static final String SALESPRICEE = "salespriceE";

    public static final String STDPRICE = "stdprice";

    public static final String BUSITAXRATE = "busitaxrate";

    public static final String BATCHUSED = "batchused";

    public static final String EFFECTDATEUSED = "effectdateused";

    public static final String VALIDDATEUSED = "validdateused";

    public static final String DEFVALIDDAY = "defvalidday";

    public static final String PRODDESC = "proddesc";

    public static final String PRODFORM = "prodform";

    public static final String ADVANCEDAYS = "advancedays";

    public static final String MAJORSUPPLIER = "majorsupplier";

    public static final String MAJORSUPPLIERNAME = "majorsuppliername";

    public static final String BOUTSTOCKDAY = "boutstockday";

    public static final String BINSTOCKDAY = "binstockday";

    public static final String SLUGGISHDAYS = "sluggishdays";

    public static final String INVALIDDATE = "invaliddate";

    public static final String SAFEQTY = "safeqty";

    public static final String CY20 = "cy20";

    public static final String CY40 = "cy40";

    public static final String HQ40 = "hq40";

    public static final String CY45 = "cy45";

    public static final String INPACKAMT = "inpackamt";

    public static final String OUTPACKAMT = "outpackamt";

    public static final String VOLUMEUNIT = "volumeunit";

    public static final String VOLUME = "volume";

    public static final String NETWEIGHT = "netweight";

    public static final String GROSSWEIGH = "grossweigh";

    public static final String BSTDCOST = "bstdcost";

    public static final String BAVGCOST = "bavgcost";

    public static final String CAVGCOST = "cavgcost";

    public static final String CTOTALCOST = "ctotalcost";

    public static final String UDEF1 = "udef1";

    public static final String UDEF2 = "udef2";

    public static final String PRICEOFTAX = "priceoftax";

    public static final String BTOTALCOST = "btotalcost";

    public static final String STDUNITID = "stdunitid";

    public static final String STDUNITNAME = "stdunitname";

    public static final String STDUNITENGNAME = "stdunitengname";

    public static final String CALLAMT = "callamt";

    public static final String NWEIGHT = "nweight";

    public static final String GWEIGHT = "gweight";

    public static final String LONGDU = "longdu";

    public static final String LUNIT = "lunit";

    public static final String WIDTH = "width";

    public static final String HIGTH = "higth";

    public static final String MVOLUME = "mvolume";

    public static final String PROBIGTYPE = "probigtype";

    public static final String BACKTAXRATE = "backtaxrate";

    public static final String TAXITEMSID = "taxitemsid";

    public static final String BALLAMT = "ballamt";

    public static final String BCURRSTOCK = "bcurrstock";

    public static final String BSAFEALLSTK = "bsafeallstk";

    public static final String CSAFEALLSTK = "csafeallstk";

    public static final String CCURRSTOCK = "ccurrstock";

    public static final String CSTDCOST = "cstdcost";

    @Override
    protected Serializable pkVal() {
        return this.prodid;
    }

}
