package ThreadCreate;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wuhaoyu
 * @date 2024/8/23  下午2:51
 * @description:
 */
public class MultiplyThread implements Runnable {
    @Override
    public void run() {
//        try {
//            if(Integer.parseInt(Thread.currentThread().getName())<3){
//                Thread.sleep(1000);
//            }
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        String fileName = "example.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is a sample text file.");
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
