import java.util.Arrays;
public class N {
    public static void main(String[] args) {
        int a[]={1,23,33};
        change(a);
        System.out.println(Arrays.toString(a));
    }
    public static void change(int a[])
    {
        a[0]=99;
    }
}
