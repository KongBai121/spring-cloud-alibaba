package xyz.kongbai121.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import xyz.kongbai121.springcloud.entities.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult handlerException1(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global  handlerException-----1");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global  handlerException-----2");
    }
}
