public class Linear {
    public static void main(String[] args) {
        int[] a={1,6,8,9,99};
        int target=9;
        boolean ans=line(a,target);
        System.out.println(ans);
    }
    static boolean line(int[] a,int target)
    {
        if(a.length==0)
        {
            return false;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                return true;
            }
        }
        return false;
    }
}
