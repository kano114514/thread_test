package CompletableFuture;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

/**
 * @author wuhaoyu
 * @date 2024/8/24  下午4:03
 * @description:
 */
public class tesat {
    public static void main(String[] args) {
        try {
             Scanner sc = new Scanner(System.in);
              CompletableFuture<Integer>future=CompletableFuture.supplyAsync(()->{
                  Exception Exception = new Exception();
                  try {
                      Integer s=sc.nextInt();
                      return s;
                  } catch (java.lang.Exception e) {
                      throw new RuntimeException(e);
                  }
              }).handle((s,e)->{
                  if(e!=null){
                      System.out.println(e.getMessage());
                      return null;
                  }
                  else{
                      return  s;
                  }
              });
              future.get();
//            CompletableFuture<Void> future = CompletableFuture.completedFuture("hello!")
//                    .thenApply(s -> s + "world!").thenRun(()-> System.out.println("fuck"));
//            System.out.println(future.get());
//            CompletableFuture<String> newFuture=future.thenApply(s -> s + "nice!");
//            System.out.println(newFuture.get());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
