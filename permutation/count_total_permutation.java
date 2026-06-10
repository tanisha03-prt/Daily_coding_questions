package permutation;

public class count_total_permutation {
    static int count(String str)
    {
        if(str.length() == 0)
            return 1;

        int c = 0;
        for(int i=0;i<str.length();i++)
        {
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            c += count(left + right);
        }

        return c;
    }

    public static void main(String[] args)
    {
        System.out.println(count("ABC"));
    }
}
