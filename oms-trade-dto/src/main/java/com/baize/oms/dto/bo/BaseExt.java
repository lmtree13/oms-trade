package com.baize.oms.dto.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author quleiming
 * @version 1.0
 * @date 2021/7/26 11:07
 **/
@Data
public class BaseExt implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "0:未占用;1:已占用")
    private Integer preeOccupy;

}