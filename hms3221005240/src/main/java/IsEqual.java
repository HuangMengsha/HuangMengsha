public class IsEqual {
    int x;
    public  IsEqual(int x1){
        x=x1;
    }

    public static void main(String a[]) {
        IsEqual m1=new IsEqual(4);
        IsEqual m2=new IsEqual(4);
        IsEqual m3=m2;
        m3.x=6;
        System.out.println("m1=m2is"+(m1==m2));
        System.out.println("m2=m3is"+(m2==m3));
        System.out.println("m1.x=m2.xis"+(m1.x==m2.x));
        System.out.println("m1.equals(m2)="+m1.equals(m2));

    }
}
