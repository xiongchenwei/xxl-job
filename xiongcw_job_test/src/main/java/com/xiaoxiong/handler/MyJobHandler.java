package com.xiaoxiong.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHander;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author xiongcw
 * @description MyJobHandler
 * @create 2020-05-29 15:36
 */
@JobHander(value = "MyJobHandler")
@Service
public class MyJobHandler extends IJobHandler {

    @Value("${xxl.job.executor.port}")
    private String port;

    @Override
    public ReturnT<String> execute(String... params) throws Exception {
        System.out.println(">>>>>>>>我被执行了：" + port);
        return ReturnT.SUCCESS;
    }
}
