package FooBar;

public class Baz extends Foo{
    public void method1(){
        System.out.println("Baz method1");
    }
    public void method2(){
        System.out.println("Baz method2");
        method1();
    }
}
