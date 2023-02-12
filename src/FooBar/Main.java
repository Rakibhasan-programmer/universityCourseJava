package FooBar;

public class Main {
    public static void main(String[] args) {
        Foo foo1 = new Bar();
        Foo foo2 = new Baz();
        Bar bar1 = new Bar();
        Baz baz1 = new Baz();
        Baz baz2 = new Mumble();
        Object obj = new Bar();

        foo1.method1(); // foo method1
        foo2.method1(); // Baz method1
        bar1.method1(); // foo method1
        baz1.method1(); // Baz method1
        baz2.method1(); // Baz method1 - mumble method1
        //obj.method1(); // compile time error - object does not have method1

        foo1.method2(); // Bar method2
        foo2.method2(); // Baz method2 - Baz method1
        bar1.method2(); // Bar method2
        baz1.method2(); // Baz method2 - Baz method1
        baz2.method2(); // Baz method2 - Baz method1 - mumble method1
        // ((Baz)obj).method2();; // runtime error





    }
}
