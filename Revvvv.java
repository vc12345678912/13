import java.util.*;
public class Revvvv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the elements for array;");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        rev(a);
        System.out.println(Arrays.toString(a));
    }
    static void rev(int a[])
    {
        int s=0;
        int end=a.length-1;
        while(s<end)
        {
            replace(a,s,end);
            s++;
            end--;
        }

    }
    static void replace(int a[],int s,int e)
    {
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
    }
}
