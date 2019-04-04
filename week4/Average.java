public class Average
{
  public static void main(String [] args)
    {  // Average the unbers on standard input.
      double sum = 0.0;
      int n = 0;
      while (!StdIn.isEmpty())
        {  // Read a number from standard input and add to sum.
           double value = StdIn.readDouble();
           sum += value;
           n++;
        }
      double average = sum / n;
      StdOut.println("Average is " + average);
  }
}

