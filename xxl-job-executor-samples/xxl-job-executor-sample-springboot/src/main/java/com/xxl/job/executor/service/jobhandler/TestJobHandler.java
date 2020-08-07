package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHander;
import org.springframework.stereotype.Service;

@JobHander("testJobHandler")
@Service
public class TestJobHandler extends IJobHandler {


    @Override
    public ReturnT<String> execute(String... params) throws Exception {
        System.out.println("我是一个被XXL任务调度平台执行的代码！——8887");
        return ReturnT.SUCCESS;
    }
}
