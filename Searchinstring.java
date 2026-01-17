import java.util.*;
public class Searchinstring {
    public static void main(String[] args) {
        String name="varsha";
        char target='h';
        boolean ans=search(name,target);
        System.out.println(ans);
    }
    public static boolean search(String name,char target)
    {
        if(name.length()==0)
            return false;
        for(char c:name.toCharArray())
        {
            if (c==target)
                return true;
        }
        return false;
    }
}
