public class Min {
    public static void main(String[] args) {
        int a[]={1,0,9,88};
        System.out.println(min(a));
    }
    public static int min(int a[])
    {
        int fval=a[0];
         for(int h:a)
         {
            if(h<fval)
            {
                fval=h;
            }
         }
        return fval;
    }
}
