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
@ApiModel(value="Stockapplydetails对象", description="")
public class Stockapplydetails extends Model<Stockapplydetails> {

    private static final long serialVersionUID = 1L;

   

    @ApiModelProperty(value = "行号")
    private Integer apdrows;

    @ApiModelProperty(value = "请购单编号")
    private String appid;

    @ApiModelProperty(value = "物料编号")
    private String apdmateridlid;

    @ApiModelProperty(value = "物料名称")
    private String apdmateridlname;

    @ApiModelProperty(value = "规格型号")
    private String apdmodel;

    @ApiModelProperty(value = "单位名称")
    private String apdunit;

    @ApiModelProperty(value = "数量")
    private Integer apdnum;

    @ApiModelProperty(value = "标准进价")
    private Double apdstandardprice;

    @ApiModelProperty(value = "标准进价金额")
    private Double apdstandardmoney;

    @ApiModelProperty(value = "单价")
    private Double apdprice;

    @ApiModelProperty(value = "进价金额")
    private Double apdintomoney;

    @ApiModelProperty(value = "需求日期")
    private LocalDate apddemanddate;

    @ApiModelProperty(value = "建议采购日期")
    private LocalDate apdstockdate;

    @ApiModelProperty(value = "未采购数量")
    private Integer apdnotnum;

    @ApiModelProperty(value = "来源单别")
    private String apdoriginid;

    @ApiModelProperty(value = "来源单号")
    private String apdorigintype;

    @ApiModelProperty(value = "备注")
    private String apdremark;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    private String safetyone;

    private String safetytwo;
    
    


   

	public Integer getApdrows() {
		return apdrows;
	}

	public void setApdrows(Integer apdrows) {
		this.apdrows = apdrows;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getApdmateridlid() {
		return apdmateridlid;
	}

	public void setApdmateridlid(String apdmateridlid) {
		this.apdmateridlid = apdmateridlid;
	}

	public String getApdmateridlname() {
		return apdmateridlname;
	}

	public void setApdmateridlname(String apdmateridlname) {
		this.apdmateridlname = apdmateridlname;
	}

	public String getApdmodel() {
		return apdmodel;
	}

	public void setApdmodel(String apdmodel) {
		this.apdmodel = apdmodel;
	}

	public String getApdunit() {
		return apdunit;
	}

	public void setApdunit(String apdunit) {
		this.apdunit = apdunit;
	}

	public Integer getApdnum() {
		return apdnum;
	}

	public void setApdnum(Integer apdnum) {
		this.apdnum = apdnum;
	}

	public Double getApdstandardprice() {
		return apdstandardprice;
	}

	public void setApdstandardprice(Double apdstandardprice) {
		this.apdstandardprice = apdstandardprice;
	}

	public Double getApdstandardmoney() {
		return apdstandardmoney;
	}

	public void setApdstandardmoney(Double apdstandardmoney) {
		this.apdstandardmoney = apdstandardmoney;
	}

	public Double getApdprice() {
		return apdprice;
	}

	public void setApdprice(Double apdprice) {
		this.apdprice = apdprice;
	}

	public Double getApdintomoney() {
		return apdintomoney;
	}

	public void setApdintomoney(Double apdintomoney) {
		this.apdintomoney = apdintomoney;
	}

	public LocalDate getApddemanddate() {
		return apddemanddate;
	}

	public void setApddemanddate(LocalDate apddemanddate) {
		this.apddemanddate = apddemanddate;
	}

	public LocalDate getApdstockdate() {
		return apdstockdate;
	}

	public void setApdstockdate(LocalDate apdstockdate) {
		this.apdstockdate = apdstockdate;
	}

	public Integer getApdnotnum() {
		return apdnotnum;
	}

	public void setApdnotnum(Integer apdnotnum) {
		this.apdnotnum = apdnotnum;
	}

	public String getApdoriginid() {
		return apdoriginid;
	}

	public void setApdoriginid(String apdoriginid) {
		this.apdoriginid = apdoriginid;
	}

	public String getApdorigintype() {
		return apdorigintype;
	}

	public void setApdorigintype(String apdorigintype) {
		this.apdorigintype = apdorigintype;
	}

	public String getApdremark() {
		return apdremark;
	}

	public void setApdremark(String apdremark) {
		this.apdremark = apdremark;
	}

	public Integer getEnables() {
		return enables;
	}

	public void setEnables(Integer enables) {
		this.enables = enables;
	}

	public String getSafetyone() {
		return safetyone;
	}

	public void setSafetyone(String safetyone) {
		this.safetyone = safetyone;
	}

	public String getSafetytwo() {
		return safetytwo;
	}

	public void setSafetytwo(String safetytwo) {
		this.safetytwo = safetytwo;
	}

	public static final String ID = "id";

    public static final String APDROWS = "apdrows";

    public static final String APPID = "appid";

    public static final String APDMATERIDLID = "apdmateridlid";

    public static final String APDMATERIDLNAME = "apdmateridlname";

    public static final String APDMODEL = "apdmodel";

    public static final String APDUNIT = "apdunit";

    public static final String APDNUM = "apdnum";

    public static final String APDSTANDARDPRICE = "apdstandardprice";

    public static final String APDSTANDARDMONEY = "apdstandardmoney";

    public static final String APDPRICE = "apdprice";

    public static final String APDINTOMONEY = "apdintomoney";

    public static final String APDDEMANDDATE = "apddemanddate";

    public static final String APDSTOCKDATE = "apdstockdate";

    public static final String APDNOTNUM = "apdnotnum";

    public static final String APDORIGINID = "apdoriginid";

    public static final String APDORIGINTYPE = "apdorigintype";

    public static final String APDREMARK = "apdremark";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

   
}
