import java.util.*;

class Solution
{
    public void agSequence(String sequence)
    {

        int count=0,result=0;
        for(int i=0;i<sequence.length();i++)
        {
            if(sequence.charAt(i)=='A')
            {
                count++;

            }
            if(sequence.charAt(i)=='G')
            {
                result+= count;
            }

        }
        System.out.println(result);

    }
}

class AGSequence
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String sequence =scanner.next();
        Solution solution =new Solution();
        solution.agSequence(sequence);
    }
}
