package ThreadCreate;

import java.util.concurrent.Callable;

/**
 * @author wuhaoyu
 * @date 2024/9/13  下午11:18
 * @description:
 */
public class returnSomethingThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "睿智！";
    }
}
