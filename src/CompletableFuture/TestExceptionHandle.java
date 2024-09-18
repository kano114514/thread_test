package CompletableFuture;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author wuhaoyu
 * @date 2024/9/18  下午9:41
 * @description: 这是用来在CompletableFuture执行异步任务发生异常时，进行异常捕获的测试。
 */
public class TestExceptionHandle {

    public static void main(String[] args) {
        CompletableFuture<Object> future=CompletableFuture.supplyAsync(()->{
            throw new RuntimeException();
        }).exceptionally(ex->{
            System.out.println("完蛋咯");
            return null;
        });

//
//
//        whenComplete((s,ex)->{
//            if(ex!=null){
//                System.out.println(ex.getMessage());
//                System.out.println("你好");
//            }
//        })

//        handle((s,ex)->{
//            if(ex!=null){
//                System.out.println("oh baby!");
//                return "你妈妈说我老土";
//            }
//            else{
//                return (String) s;
//            }
//        }) handle是一定会被执行的，无论是抛出异常还是返回了正常结果，其实可以把它当作一个类似于Spring AOP的后处理方法去使用。

//        try {
//            System.out.println(future.get());
//        }
//        catch (RuntimeException | InterruptedException | ExecutionException e){
//            System.out.println("你妈妈说我老土");
//        }
    }
}
