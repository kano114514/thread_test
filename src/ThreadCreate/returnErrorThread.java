package ThreadCreate;

import java.util.concurrent.Callable;

/**
 * @author wuhaoyu
 * @date 2024/9/13  下午11:19
 * @description:
 */
public class returnErrorThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        throw new RuntimeException();
    }
}
