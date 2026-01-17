import java.util.Arrays;
public class Rev {
    public static void main(String[] args) {
        int a[]={1,3,5,7,9};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    static void reverse(int a[])
    {
        int s=0;
        int e=a.length-1;
        while(s<e)
        {
            swap(a,s,e);
            s++;
            e--;
        }

    }
    static void swap(int a[],int s,int e)
    {
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
    }

}
