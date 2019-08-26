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
@ApiModel(value="Dsdscust2对象", description="")
public class Dsdscust2 extends Model<Dsdscust2> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "地址编号")
    private String addrid;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "邮政编码")
    private String zipcode;

    @ApiModelProperty(value = "联系人")
    private String linkman;

    @ApiModelProperty(value = "联系电话")
    private String telephone;

    @ApiModelProperty(value = "传真号码")
    private String faxno;

    @ApiModelProperty(value = "行走路线")
    private String walkaddr;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "联系人职称")
    private String linkmanprof;


    public static final String ADDRID = "addrid";

    public static final String ADDRESS = "address";

    public static final String ZIPCODE = "zipcode";

    public static final String LINKMAN = "linkman";

    public static final String TELEPHONE = "telephone";

    public static final String FAXNO = "faxno";

    public static final String WALKADDR = "walkaddr";

    public static final String MEMO = "memo";

    public static final String LINKMANPROF = "linkmanprof";

    @Override
    protected Serializable pkVal() {
        return this.addrid;
    }

}
