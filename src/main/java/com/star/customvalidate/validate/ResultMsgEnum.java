package com.star.customvalidate.validate;

import lombok.Getter;
import org.springframework.util.StringUtils;

import java.io.Serializable;

/**
 * @Author StarC
 * @Date 2021/11/26 10:41
 * @Description:
 */
@Getter
public enum ResultMsgEnum implements Serializable {
    SUCCESS("200","成功"),
    FAIL("404","失败");
    private String code;
    private String msg;

    ResultMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public String getMsgByCode(String code){
        for(ResultMsgEnum resultMsg: ResultMsgEnum.values()){
            if(StringUtils.pathEquals(resultMsg.getCode(),code)){
                return resultMsg.getMsg();
            }
        }
        return null;
    }
}
