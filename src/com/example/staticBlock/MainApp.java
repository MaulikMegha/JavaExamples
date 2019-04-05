package com.example.staticBlock;

public class MainApp {
    public void nonStatic(){
        System.out.println("Call this method through obj");
    }
    public static void main(String args[]) {
        Test test = new Test(10);

        System.out.println(test.x);
        System.out.println(test.y);
        System.out.println(test.z);

        MainApp obj = new MainApp();
        obj.nonStatic();
        test(obj);
    }

    public static void test(MainApp obj){
        System.out.println("this is a test method");
        //now call non-static method
        obj.nonStatic();
    }
}

class Test {
    static int x = 8;
    int y = 5;
    int z = 0;

    static int i = 0;

    Test(int z){
        this.z = z;
        System.out.println("3-constructor call");
    }

    {
        y = 10;
        i = 10; // we can define static var into nonStatic block, now i become 10.
        int j = 10; // this var scope only for this block, but we can't : static int j = 0;
        System.out.println("2-non static block call");
        // System.out.println("staticVar "+staticVar);
        // System.out.println("z "+z); // still z will print 0
    }

    static {
        x = 10;
        int staticVar = 0;
        // y = 10; // we can not define nonStatic variable in static block
        System.out.println("1-static block call");
        // System.out.println("j "+j);
    }


}