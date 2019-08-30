package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="Depttab对象", description="")
public class Depttab extends Model<Depttab> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "部门编号")
    private String depid;

    @ApiModelProperty(value = "部门名称")
    private String depname;

    @ApiModelProperty(value = "备注")
    private String depremark;

    @ApiModelProperty(value = "是否废码")
    private String deptrash;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;
    
    


    public String getDepid() {
		return depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getDepremark() {
		return depremark;
	}

	public void setDepremark(String depremark) {
		this.depremark = depremark;
	}

	public String getDeptrash() {
		return deptrash;
	}

	public void setDeptrash(String deptrash) {
		this.deptrash = deptrash;
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

	public static final String DEPID = "depid";

    public static final String DEPNAME = "depname";

    public static final String DEPREMARK = "depremark";

    public static final String DEPTRASH = "deptrash";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.depid;
    }

}
