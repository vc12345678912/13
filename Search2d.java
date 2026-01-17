import java.util.Arrays;
public class Search2d {
    public static void main(String[] args) {
        int [][] a=new int[][]{};
        
        int target=900;
        int ab[]=search(a,target);
        System.out.println(Arrays.toString(ab));
    }
    public static int[] search(int[][] a,int target)
    {
        if (a.length==0)
        {
            return new int[]{-1,-1};
        }
        for(int r=0;r<a.length;r++)
        {
            for(int c=0;c<a[r].length;c++)
            {
                if(a[r][c]==target)
                {
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
