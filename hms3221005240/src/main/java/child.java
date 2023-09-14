class parent {
    protected  static int count =0;
    public  parent(){count++;}
}
public  class child extends parent
{
       public  child(){count++;}

    public static void main(String[] args) {
        child x=new child();
        System.out.println("count="+x.count);
    }
}
