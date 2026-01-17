import java.util.Scanner;
public class Simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        float r=sc.nextFloat();
        float si;
        si=p*t*r;
        System.out.println("The simple interest is"+si);
        sc.close();
    }
}
