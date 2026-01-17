import java.util.Scanner;
public class EX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0;
        while(true)
        {
            String value=sc.next();
            if (value.equalsIgnoreCase("x"))
            {
                break;
            }
            try{
                int num=Integer.parseInt(value);
                s=s+num;
            }
            catch(NumberFormatException e)
            {
                System.out.print("It is not number or x");
            }
        }
        System.out.println("sum is "+s);
    }
}
