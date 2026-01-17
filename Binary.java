public class Binary {
    public static void main(String[] args) {
        int a[]={2,3,4,5,66,7,7,88,99};
        int target=99;
        int ans=binary(a,target);
        System.out.println(ans);
        System.out.println(a.length);
    }
    public static int binary(int a[],int target)
    {
        int s=0;
        int e=a.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(target<a[mid])
            {
                e=mid-1;
            }
            else if(target>a[mid])
            {
                s=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
