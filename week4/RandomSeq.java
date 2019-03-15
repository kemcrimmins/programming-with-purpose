public class RandomSeq
{
  public static void main(String[] args)
  {//Print a raondom sequence of n real vallues in [0, 1)
    int n = Integer.parseInt(args[0]);
    for (int i = 0; i < n; i++)
      System.out.println(Math.random());
  }
}

  
