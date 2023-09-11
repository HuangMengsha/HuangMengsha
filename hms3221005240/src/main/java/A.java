public class A {
    protected  void test(float x){
        System.out.println("test(float):"+x);
    }
    protected void test(Object obj){
        System.out.println("test(Object):"+obj);
    }
    protected  void test(String str){
        System.out.println("test(String)"+str);
    }

    public static void main(String[] args) {
        A a1 =new A();
        a1.test("hello");
        a1.test(5);
    }
}
