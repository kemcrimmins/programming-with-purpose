public class StdRandom
{
  public static int uniform(int n)
  {  return (int) (Math.random() * n); }

  public static double uniform(double lo, double hi)
  {  return lo + Math.random() * (hi - lo); }

  public static boolean bernoulli(double p)
  {  return Math.random() < p; }

  public static double gaussian()
  {  /* See Exercise 2.2.17 */ }

  public static double gaussian(double mu, double sigma)
  { return mu + sigma * gaussian(); }

  public static int discrete(double[] probabilities)
  {
