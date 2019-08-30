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
@ApiModel(value="Employee对象", description="")
public class Employee extends Model<Employee> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "人员编号")
    private String empid;

    @ApiModelProperty(value = "人员姓名")
    private String empname;

    @ApiModelProperty(value = "英文姓名")
    private String empename;

    @ApiModelProperty(value = "部门编号id")
    private String depid;

    @ApiModelProperty(value = "性别（默认男）")
    private String empsex;

    @ApiModelProperty(value = "身份证号")
    private String empcard;

    @ApiModelProperty(value = "就职状态id")
    private String empstate;

    @ApiModelProperty(value = "职务（改字段名）")
    private String empduty;

    @ApiModelProperty(value = "联系电话一")
    private String empphoneone;

    @ApiModelProperty(value = "联系电话二")
    private String empphonetwo;

    @ApiModelProperty(value = "联系电话三")
    private String empphonethree;

    @ApiModelProperty(value = "银行账号")
    private String empbankaccounts;

    @ApiModelProperty(value = "出生日期(修改数据类型)")
    private LocalDate empbirthday;

    @ApiModelProperty(value = "岗位")
    private String empjob;

    @ApiModelProperty(value = "电子邮件（一个邮箱）")
    @TableField("Empemail")
    private String Empemail;

    @ApiModelProperty(value = "网址")
    private String empweb;

    @ApiModelProperty(value = "传真号码")
    private String empfaxes;

    @ApiModelProperty(value = "开户银行")
    private String empopenbank;

    @ApiModelProperty(value = "最高学历")
    private String emptop;

    @ApiModelProperty(value = "学位")
    private String empdegree;

    @ApiModelProperty(value = "到期日期")
    private String empgotime;

    @ApiModelProperty(value = "毕业学校")
    private String empgraduatetime;

    @ApiModelProperty(value = "合同起始日期")
    private LocalDate emppactstarttime;

    @ApiModelProperty(value = "合同终止日期")
    private LocalDate emppactendtime;

    @ApiModelProperty(value = "现邮编")
    private String empnowmailid;

    @ApiModelProperty(value = "家庭电话")
    private String empfamilyphone;

    @ApiModelProperty(value = "家庭住址")
    private String empfamilyplace;

    @ApiModelProperty(value = "现电话")
    private String empnowphone;

    @ApiModelProperty(value = "现住址")
    private String empnowplace;

    @ApiModelProperty(value = "紧急联系人")
    private String empexigenceman;

    @ApiModelProperty(value = "家庭邮编")
    private String empfamilymailid;

    @ApiModelProperty(value = "备注")
    private String empremark;

    @ApiModelProperty(value = "是否废码")
    private String emptrash;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;
    
    
    
  

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpename() {
		return empename;
	}

	public void setEmpename(String empename) {
		this.empename = empename;
	}

	public String getDepid() {
		return depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public String getEmpsex() {
		return empsex;
	}

	public void setEmpsex(String empsex) {
		this.empsex = empsex;
	}

	public String getEmpcard() {
		return empcard;
	}

	public void setEmpcard(String empcard) {
		this.empcard = empcard;
	}

	public String getEmpstate() {
		return empstate;
	}

	public void setEmpstate(String empstate) {
		this.empstate = empstate;
	}

	public String getEmpduty() {
		return empduty;
	}

	public void setEmpduty(String empduty) {
		this.empduty = empduty;
	}

	public String getEmpphoneone() {
		return empphoneone;
	}

	public void setEmpphoneone(String empphoneone) {
		this.empphoneone = empphoneone;
	}

	public String getEmpphonetwo() {
		return empphonetwo;
	}

	public void setEmpphonetwo(String empphonetwo) {
		this.empphonetwo = empphonetwo;
	}

	public String getEmpphonethree() {
		return empphonethree;
	}

	public void setEmpphonethree(String empphonethree) {
		this.empphonethree = empphonethree;
	}

	public String getEmpbankaccounts() {
		return empbankaccounts;
	}

	public void setEmpbankaccounts(String empbankaccounts) {
		this.empbankaccounts = empbankaccounts;
	}

	public LocalDate getEmpbirthday() {
		return empbirthday;
	}

	public void setEmpbirthday(LocalDate empbirthday) {
		this.empbirthday = empbirthday;
	}

	public String getEmpjob() {
		return empjob;
	}

	public void setEmpjob(String empjob) {
		this.empjob = empjob;
	}

	public String getEmpemail() {
		return Empemail;
	}

	public void setEmpemail(String empemail) {
		Empemail = empemail;
	}

	public String getEmpweb() {
		return empweb;
	}

	public void setEmpweb(String empweb) {
		this.empweb = empweb;
	}

	public String getEmpfaxes() {
		return empfaxes;
	}

	public void setEmpfaxes(String empfaxes) {
		this.empfaxes = empfaxes;
	}

	public String getEmpopenbank() {
		return empopenbank;
	}

	public void setEmpopenbank(String empopenbank) {
		this.empopenbank = empopenbank;
	}

	public String getEmptop() {
		return emptop;
	}

	public void setEmptop(String emptop) {
		this.emptop = emptop;
	}

	public String getEmpdegree() {
		return empdegree;
	}

	public void setEmpdegree(String empdegree) {
		this.empdegree = empdegree;
	}

	public String getEmpgotime() {
		return empgotime;
	}

	public void setEmpgotime(String empgotime) {
		this.empgotime = empgotime;
	}

	public String getEmpgraduatetime() {
		return empgraduatetime;
	}

	public void setEmpgraduatetime(String empgraduatetime) {
		this.empgraduatetime = empgraduatetime;
	}

	public LocalDate getEmppactstarttime() {
		return emppactstarttime;
	}

	public void setEmppactstarttime(LocalDate emppactstarttime) {
		this.emppactstarttime = emppactstarttime;
	}

	public LocalDate getEmppactendtime() {
		return emppactendtime;
	}

	public void setEmppactendtime(LocalDate emppactendtime) {
		this.emppactendtime = emppactendtime;
	}

	public String getEmpnowmailid() {
		return empnowmailid;
	}

	public void setEmpnowmailid(String empnowmailid) {
		this.empnowmailid = empnowmailid;
	}

	public String getEmpfamilyphone() {
		return empfamilyphone;
	}

	public void setEmpfamilyphone(String empfamilyphone) {
		this.empfamilyphone = empfamilyphone;
	}

	public String getEmpfamilyplace() {
		return empfamilyplace;
	}

	public void setEmpfamilyplace(String empfamilyplace) {
		this.empfamilyplace = empfamilyplace;
	}

	public String getEmpnowphone() {
		return empnowphone;
	}

	public void setEmpnowphone(String empnowphone) {
		this.empnowphone = empnowphone;
	}

	public String getEmpnowplace() {
		return empnowplace;
	}

	public void setEmpnowplace(String empnowplace) {
		this.empnowplace = empnowplace;
	}

	public String getEmpexigenceman() {
		return empexigenceman;
	}

	public void setEmpexigenceman(String empexigenceman) {
		this.empexigenceman = empexigenceman;
	}

	public String getEmpfamilymailid() {
		return empfamilymailid;
	}

	public void setEmpfamilymailid(String empfamilymailid) {
		this.empfamilymailid = empfamilymailid;
	}

	public String getEmpremark() {
		return empremark;
	}

	public void setEmpremark(String empremark) {
		this.empremark = empremark;
	}

	public String getEmptrash() {
		return emptrash;
	}

	public void setEmptrash(String emptrash) {
		this.emptrash = emptrash;
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

	public Integer getEnables() {
		return enables;
	}

	public void setEnables(Integer enables) {
		this.enables = enables;
	}

	public static final String EMPID = "empid";

    public static final String EMPNAME = "empname";

    public static final String EMPENAME = "empename";

    public static final String DEPID = "depid";

    public static final String EMPSEX = "empsex";

    public static final String EMPCARD = "empcard";

    public static final String EMPSTATE = "empstate";

    public static final String EMPDUTY = "empduty";

    public static final String EMPPHONEONE = "empphoneone";

    public static final String EMPPHONETWO = "empphonetwo";

    public static final String EMPPHONETHREE = "empphonethree";

    public static final String EMPBANKACCOUNTS = "empbankaccounts";

    public static final String EMPBIRTHDAY = "empbirthday";

    public static final String EMPJOB = "empjob";

    public static final String EMPEMAIL = "Empemail";

    public static final String EMPWEB = "empweb";

    public static final String EMPFAXES = "empfaxes";

    public static final String EMPOPENBANK = "empopenbank";

    public static final String EMPTOP = "emptop";

    public static final String EMPDEGREE = "empdegree";

    public static final String EMPGOTIME = "empgotime";

    public static final String EMPGRADUATETIME = "empgraduatetime";

    public static final String EMPPACTSTARTTIME = "emppactstarttime";

    public static final String EMPPACTENDTIME = "emppactendtime";

    public static final String EMPNOWMAILID = "empnowmailid";

    public static final String EMPFAMILYPHONE = "empfamilyphone";

    public static final String EMPFAMILYPLACE = "empfamilyplace";

    public static final String EMPNOWPHONE = "empnowphone";

    public static final String EMPNOWPLACE = "empnowplace";

    public static final String EMPEXIGENCEMAN = "empexigenceman";

    public static final String EMPFAMILYMAILID = "empfamilymailid";

    public static final String EMPREMARK = "empremark";

    public static final String EMPTRASH = "emptrash";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
