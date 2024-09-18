package ThreadCreate;

/**
 * @author wuhaoyu
 * @date 2024/8/22  下午4:29
 * @description:
 */

public class Singleton {
    private volatile static Singleton instance;
    private  String name;
    private Singleton(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static Singleton getInstance() {
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton(Thread.currentThread().getName());
                }
            }
        }
        return instance;
    }

    public static void main(String[]args){
        Thread out1=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("out1"+i);
                }
            }
        });
        Thread out2=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("out2"+i);
                }
            }
        });
        out1.start();
        out2.start();
    }
}
