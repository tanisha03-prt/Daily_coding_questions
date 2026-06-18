package recursion;

public class count_total_subsequence {
    static int count(String str, int i)
    {
        if(i == str.length())
            return 1;

        return count(str, i + 1)
             + count(str, i + 1);
    }

    public static void main(String[] args)
    {
        System.out.println(count("ABC",0));
    }

    
}
