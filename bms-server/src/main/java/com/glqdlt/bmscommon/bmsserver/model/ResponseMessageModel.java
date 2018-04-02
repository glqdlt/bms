package com.glqdlt.bmscommon.bmsserver.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created By iw.jhun
 * On 2018-04-02 , 오후 4:17
 */

@Accessors(chain = true)
@ToString
@Data
public class ResponseMessageModel implements Serializable{

    private String message;
    private Integer status;

}
