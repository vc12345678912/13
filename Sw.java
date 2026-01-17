import java.util.Scanner;
public class Sw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().trim().charAt(0);
        int ans;
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(c)
        {

            case '+' : ans=a+b;
                      System.out.println(ans);
                      break;
            case '-' : ans=a-b;
                       System.out.println(ans);
                       break;
                       
            default :
                    System.out.println("Enter valid one");
                
        }
        sc.close();
    }
}
