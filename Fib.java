
class Fib
{
    public static void main(String[] args) {
        int n=6;
        int a=0;
        int b=1;
        int s=0;
        for(int i=2;i<=n;i++)
        {
            s=a+b;
            a=b;
            b=s;
        }
        System.out.println(s);
        
    }
}