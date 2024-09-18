package ThreadCreate;

/**
 * @author wuhaoyu
 * @date 2024/8/24  下午4:43
 * @description:
 */
public class VirtualThread {
    public static void main(String[] args) {
        MultiplyThread mt = new MultiplyThread();
        Thread.ofVirtual().start(mt);
    }
}
