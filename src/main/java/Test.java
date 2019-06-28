import java.io.IOException;

/**
 * @Author lzc
 * @Date 2019-06-26 15:15
 */
public class Test {
    public static void main(String[] args) {
        add(new int[]{1,2,3});


        try {
            throw new IOException();   // 受检异常
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException|RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void add(int ...a){
        for (int i : a) {
            System.out.println(i);
        }
    }
}
