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
@ApiModel(value="Stockapply对象", description="")
public class Stockapply extends Model<Stockapply> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "请购单编号")
    private String appid;

    @ApiModelProperty(value = "请购单日期")
    private LocalDate appdate;

    @ApiModelProperty(value = "请购采购类型")
    private String apptype;

    @ApiModelProperty(value = "默认0 未结案，1：已结案  2：无效")
    private Integer appcircs;

    @ApiModelProperty(value = "请购人员id")
    private Integer apppersonid;

    @ApiModelProperty(value = "请购部门id")
    private Integer appdeptid;

    @ApiModelProperty(value = "制单人员")
    private String appmaker;

    @ApiModelProperty(value = "复核人员")
    private String appauditingperson;

    @ApiModelProperty(value = "审核状态：未审核/已审核/无效")
    private String appauditing;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;

    
    

   
	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public LocalDate getAppdate() {
		return appdate;
	}

	public void setAppdate(LocalDate appdate) {
		this.appdate = appdate;
	}

	public String getApptype() {
		return apptype;
	}

	public void setApptype(String apptype) {
		this.apptype = apptype;
	}

	public Integer getAppcircs() {
		return appcircs;
	}

	public void setAppcircs(Integer appcircs) {
		this.appcircs = appcircs;
	}

	public Integer getApppersonid() {
		return apppersonid;
	}

	public void setApppersonid(Integer apppersonid) {
		this.apppersonid = apppersonid;
	}

	public Integer getAppdeptid() {
		return appdeptid;
	}

	public void setAppdeptid(Integer appdeptid) {
		this.appdeptid = appdeptid;
	}

	public String getAppmaker() {
		return appmaker;
	}

	public void setAppmaker(String appmaker) {
		this.appmaker = appmaker;
	}

	public String getAppauditingperson() {
		return appauditingperson;
	}

	public void setAppauditingperson(String appauditingperson) {
		this.appauditingperson = appauditingperson;
	}

	public String getAppauditing() {
		return appauditing;
	}

	public void setAppauditing(String appauditing) {
		this.appauditing = appauditing;
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

	public static final String APPID = "appid";

    public static final String APPDATE = "appdate";

    public static final String APPTYPE = "apptype";

    public static final String APPCIRCS = "appcircs";

    public static final String APPPERSONID = "apppersonid";

    public static final String APPDEPTID = "appdeptid";

    public static final String APPMAKER = "appmaker";

    public static final String APPAUDITINGPERSON = "appauditingperson";

    public static final String APPAUDITING = "appauditing";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.appid;
    }

}
