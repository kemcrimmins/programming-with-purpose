public class RightTriangle
{
  public static void main(String[] args)
  {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]); 

    if ((a <= 0) || (b <= 0) || (c <= 0)) // Check for negative integers
      System.out.println(false); 
    else
     { 
       // Make sure that c is the largest integer
       int temp;
       if (a > b) 
       {
         temp = a;
         a = b;
         b = temp;
       }
       if (b > c) 
       {
         temp = b;
         b = c;
         c = temp;
       }
       // test for right triangle 
       System.out.println((a*a+b*b==c*c)); 
     }
  }
}
 
