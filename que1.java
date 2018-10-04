import java.util.Scanner;
class palindd
{
	public boolean checkPal(String str, String rev)
	{
		return str.equals(rev);
	}
		
}
class Palindrome
{
   public static void main(String args[])
   {
      Check obj = new Check();
	  String str, rev = ""; 
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string: ");
      str = sc.next();
 
      int len = str.length();
 
      for(int i = len - 1;i>=0;i--)
	  {
         rev = rev + str.charAt(i);
	  }
	  
	  boolean res = obj.checkPal(str,rev);
	  System.out.println(res);
 
   }
}