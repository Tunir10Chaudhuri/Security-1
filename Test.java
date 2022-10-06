import java.util.*;
class Test
{
    static String protect(String s)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x=(int)ch;
            t=t+x;
        }
        return t;
    }
    static String enc1(String s, int n)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x=(int)(ch+n);
            t=t+x;
        }
        return t;
    }
    static String enc2(String s, int a, int b)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x=(int)((ch+a)*b);
            t=t+x;
        }
        return t;
    }
	public static void main(String args[]) 
	{
	    Scanner sc=new Scanner(System.in);
	    String f="abc123";
            String s="xyz456";
            int c=0,f1=0,z=0;
            ///*
            while(true)
		{
		   ///* 
                    if(c>=3)
		    {
                      break;
                    }
                   //*/
		    System.out.println("Hello user, enter your first password");
		    String first=sc.nextLine();
		    if((enc1(first,c)).equals((protect(f))))
		    {
		      f1=1;  
		      break;
		    }
		    else
		    {
		      System.out.println("Wrong password, please try again");
                      z++;
                      if(z>1)
		      c++;
		    }
		}
		if(f1==0 || c>1)
		{
		    System.out.println("Hacker detected");
		    System.exit(0);
		}
                //*/
		System.out.println("Please enter your second password (you have only one chance)");
		String second=sc.nextLine();
		if((enc2(second,c,f1)).equals((protect(s))))
		{
		    System.out.println("Welcome user");
		}
		else
		{
		    System.out.println("Hacker detected");
		    System.exit(0);
		}
	}
}
