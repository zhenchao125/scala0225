/**
 * @Author lzc
 * @Date 2019-06-28 14:23
 */

import java.util.Stack;

public class Test2 {

    private Test2() {
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);


        int a = 100;
        new Object() {
            @Override
            public String toString() {

                System.out.println(a);
                return "test";
            }
        }.toString();
//        a = 20;
    }


}
