/**
 * @Author lzc
 * @Date 2019-06-28 14:23
 */

import java.util.Stack;

public class Test2 {

    private Test2() {
    }

    public static void main(String[] args) {

        System.out.println(sum(1, 100, 0));
    }


    public static long sum(long from, long to, long acc) {
        if (from == to) throw new RuntimeException();
        else return sum(from + 1, to, from + acc);
    }

}
