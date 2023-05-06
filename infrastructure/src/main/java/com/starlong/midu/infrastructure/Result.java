package com.starlong.midu.infrastructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    /**
     * 是否成功
     */
    private  Boolean isSuccess;
    /**
     * 错误信息
     */
    private String errorConfig;
    /**
     * 请求状态 200-成功 400-失败
     */
    private Integer status;
    /**
     * 当前时间戳
     */
    private Long timestamp;
    /**
     * 返回结果
     */
    private Object data;

    public static Result OK(){
        return new Result(true,null,200,System.currentTimeMillis(),null);
    }

    public static Result OK(Object data){
        return new Result(true,null,200,System.currentTimeMillis(),data);
    }

    public static Result OK(List<?> data){
        return new Result(true,null,200,System.currentTimeMillis(),data);
    }

    public static Result OK(String errorConfig){
        return new Result(true,errorConfig,400,System.currentTimeMillis(),null);
    }
}
