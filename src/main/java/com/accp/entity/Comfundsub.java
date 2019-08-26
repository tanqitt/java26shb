package com.accp.entity;

import java.math.BigDecimal;
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
 * 应付冲款单从表
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comfundsub对象", description="应付冲款单从表")
public class Comfundsub extends Model<Comfundsub> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "Pk，标记")
    @TableId("Flag")
    private Integer Flag;

    @ApiModelProperty(value = "Pk，单据编号")
    @TableField("FundBillNo")
    private String FundBillNo;

    @ApiModelProperty(value = "Pk，行号")
    @TableField("RowNo")
    private Integer RowNo;

    @ApiModelProperty(value = "栏号")
    @TableField("SerNo")
    private Integer SerNo;

    @ApiModelProperty(value = "系统别")
    @TableField("SysID")
    private Integer SysID;

    @ApiModelProperty(value = "单别")
    @TableField("OriginFlag")
    private Integer OriginFlag;

    @ApiModelProperty(value = "原单单号")
    @TableField("OriginBillNo")
    private String OriginBillNo;

    @ApiModelProperty(value = "折让绩效")
    @TableField("PerfCount")
    private Integer PerfCount;

    @ApiModelProperty(value = "冲款金额")
    @TableField("OffSet")
    private BigDecimal OffSet;

    @ApiModelProperty(value = "折让金额")
    @TableField("Discount")
    private BigDecimal Discount;

    @ApiModelProperty(value = "冲款金额本位币")
    @TableField("LocalOffSet")
    private BigDecimal LocalOffSet;

    @ApiModelProperty(value = "折让金额本位币")
    @TableField("LocalDiscount")
    private BigDecimal LocalDiscount;

    @ApiModelProperty(value = "未知")
    @TableField("AccFlag")
    private Boolean AccFlag;

    @ApiModelProperty(value = "币别")
    @TableField("CurrID")
    private String CurrID;

    @ApiModelProperty(value = "总数")
    @TableField("Total")
    private BigDecimal Total;

    @ApiModelProperty(value = "委员会")
    @TableField("Commission")
    private BigDecimal Commission;

    @ApiModelProperty(value = "冲抵金额")
    @TableField("OffSetMoney")
    private BigDecimal OffSetMoney;

    @ApiModelProperty(value = "汇率")
    @TableField("ExchRate")
    private Float ExchRate;

    @ApiModelProperty(value = "冲抵赢余")
    @TableField("LOffsetSurplus")
    private BigDecimal LOffsetSurplus;

    @ApiModelProperty(value = "部门编号")
    @TableField("DeptID")
    private String DeptID;


    public static final String FLAG = "Flag";

    public static final String FUNDBILLNO = "FundBillNo";

    public static final String ROWNO = "RowNo";

    public static final String SERNO = "SerNo";

    public static final String SYSID = "SysID";

    public static final String ORIGINFLAG = "OriginFlag";

    public static final String ORIGINBILLNO = "OriginBillNo";

    public static final String PERFCOUNT = "PerfCount";

    public static final String OFFSET = "OffSet";

    public static final String DISCOUNT = "Discount";

    public static final String LOCALOFFSET = "LocalOffSet";

    public static final String LOCALDISCOUNT = "LocalDiscount";

    public static final String ACCFLAG = "AccFlag";

    public static final String CURRID = "CurrID";

    public static final String TOTAL = "Total";

    public static final String COMMISSION = "Commission";

    public static final String OFFSETMONEY = "OffSetMoney";

    public static final String EXCHRATE = "ExchRate";

    public static final String LOFFSETSURPLUS = "LOffsetSurplus";

    public static final String DEPTID = "DeptID";

    @Override
    protected Serializable pkVal() {
        return this.Flag;
    }

}
