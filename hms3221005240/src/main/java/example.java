class exSuper{
    public  void func(String p,String s)
    {
        System.out.println(p);
    }
}

public class example extends exSuper{
    @Override
    public void func(String p, String s) {
        System.out.println(p+":"+s);
    }
    static  public  void  main(String arg[]){
        exSuper e1=new exSuper();
        e1.func("hello1","hi1");
        exSuper e2=new example();
        e2.func("hello2","hi2");

    }
}
