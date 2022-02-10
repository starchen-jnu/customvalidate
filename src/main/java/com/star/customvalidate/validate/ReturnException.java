package com.star.customvalidate.validate;

/**
 * @Author StarC
 * @Date 2021/11/26 10:45
 * @Description:
 */
public class ReturnException extends RuntimeException {

    private ResultMsgEnum resultMsgEnum;
    public ReturnException(ResultMsgEnum resultMsgEnum){
        super(resultMsgEnum.getMsg());
        this.resultMsgEnum = resultMsgEnum;
    }
    public ReturnException(ResultMsgEnum resultMsgEnum,Throwable throwable){
        super(resultMsgEnum.getMsg(),throwable);
        this.resultMsgEnum = resultMsgEnum;
    }
    public ResultMsgEnum ReturnException(){
        return resultMsgEnum;
    }

    public ReturnException build(ResultMsgEnum resultMsgEnum){
        return new ReturnException(resultMsgEnum);

    }

    public ReturnException build(ResultMsgEnum resultMsgEnum,Throwable throwable){
        return new ReturnException(resultMsgEnum,throwable);

    }
}
