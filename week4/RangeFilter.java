public class RangeFilter
{
  public static void main(String[] args)
  {  // Filter out numbers between lo and hi.
    int lo = Integer.parseInt(args[0]);
    int hi = Integer.parseInt(args[1]);
    while (!StdIn.isEmpty())
    {  // Process one number.
      int value = StdIn.readInt();
      if (value >= lo && value <= hi)
        StdOut.print(value + " ");
    }
    StdOut.println();
  }
}
 
