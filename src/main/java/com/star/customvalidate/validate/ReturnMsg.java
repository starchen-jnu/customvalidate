package com.star.customvalidate.validate;

import lombok.Data;

/**
 * @Author StarC
 * @Date 2021/11/26 10:45
 * @Description:
 */
@Data
public class ReturnMsg<T>{
    private ResultMsgEnum resultMsgEnum;
    private T data;

    public ReturnMsg(ResultMsgEnum resultMsgEnum, T data) {
        this.resultMsgEnum = resultMsgEnum;
        this.data = data;
    }

    public ReturnMsg(ResultMsgEnum resultMsgEnum) {
        this.resultMsgEnum = resultMsgEnum;
    }

    public static<T> ReturnMsg<T> build(ResultMsgEnum resultMsgEnum, T data){
        return new ReturnMsg<>(resultMsgEnum,data);

    }
    public static<T> ReturnMsg<T> build(ResultMsgEnum resultMsgEnum){
        return new ReturnMsg<>(resultMsgEnum);
    }

    public static<T> ReturnMsg<T> ok(){
        return new ReturnMsg<>(ResultMsgEnum.SUCCESS);
    }

    public static<T> ReturnMsg<T> fail(){
        return new ReturnMsg<>(ResultMsgEnum.FAIL);
    }

}
