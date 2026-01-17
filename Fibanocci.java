import java.util.Scanner;
public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(" "+a+" "+b);
        int i=1;
        while(i<=n)
        {
            int c=a+b;
            System.out.print(c);
            a=b;
            b=c;
            i++;
        }
    }
}
