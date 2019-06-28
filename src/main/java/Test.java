import java.io.IOException;

/**
 * @Author lzc
 * @Date 2019-06-26 15:15
 */
public class Test {
    static {

    }
    {

    }


    public static void main(String[] args) {
        A a = new B();
        B b = (B)a;
        System.out.println(a.getA());
        System.out.println(b.getA());

        System.out.println(a.a);  //
        System.out.println(b.a);
    }
}

class A{

    public int a = 10;

    public int getA() {
        return this.a;
    }
}

class B extends A{
    public int a = 20;

   @Override
    public int getA() {
        return a;
    }

}
/*
在java中, 属性没有多态, 方法才有多态
 */