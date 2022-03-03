import java.lang.Math;
public class Drill10 {
    public static void main(String[] args) {
      float x1, x2, x3;
      float Mean, Variance;
      Double StanDev;
      x1 = 9;
      x2 = 10;
      x3 = 6;
      Mean = (x1 + x2 + x3) / 3;
      Variance = ((float)(Math.pow(x1 - Mean, 2) + Math.pow(x2 - Mean, 2) + Math.pow(x3 - Mean, 2))) / 3;
      StanDev = Math.sqrt(Variance);
      System.out.println("Mean: " + Mean);
      System.out.println("Variance: " + Variance);
      System.out.println("Standard deviation: " + StanDev);
    }
  }
  