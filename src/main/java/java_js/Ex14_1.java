package java_js;

@FunctionalInterface
interface MyFunctionA {
    void run();
}

public class Ex14_1 {

    static void execute( MyFunctionA f ){
        f.run();
    }

    static MyFunctionA getMyFunctionA() {
        //MyFunctionA f = () -> System.out.println("f3.run()");
        //return f;
        return () -> System.out.println("f3.run()");
    }

    public static void main(String[] args) {
        MyFunctionA f1 = () -> System.out.println("f1.run()");
        MyFunctionA f2 = new MyFunctionA() {
            public void run() {
                System.out.println("f2.run(");
            }
        };

        //MyFunctionA f3 = getMyFunctionA();
        MyFunctionA f3 = () -> System.out.println("f3.run()");
        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute( () -> System.out.println("run()"));
    }
}
