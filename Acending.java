public class Acending {
    public static void main(String[] args)
    {
        String s="pavankalyan";
        String temp="";
        for(char ch='a';ch<='z';ch++)
        {
            for(int i=0;i<s.length();i++)
            {
                char str =s.charAt(i);
                if(ch==str)
                {
                    temp+=str;
                }


            }
        }
        System.out.println(temp);
    }
}
