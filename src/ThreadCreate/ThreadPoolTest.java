package ThreadCreate;

import java.util.concurrent.*;

/**
 * @author wuhaoyu
 * @date 2024/9/13  下午11:12
 * @description:
 */
public class ThreadPoolTest {//threadPool在进行任务提交的时候，有execute和submit这两种方式，execute只能执行runnable，submit能执行runnable和callable。execute无法在调用者这里进行异常的捕捉，submit则可以。
    public static void main(String[] args) {
        ExecutorService executorService=new ThreadPoolExecutor(20,20,60L, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        Future<?> submit = executorService.submit(new returnSomethingThread());
        try {
            System.out.println(submit.get());
        }catch(Exception e) {
            System.out.println("小比崽子让我逮到了");
        }
    }
}
