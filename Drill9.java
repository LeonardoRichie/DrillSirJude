import java.util.Scanner;
public class Drill9 {
    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter a Degree:");
      float Degree = myObj.nextFloat();
      float Fahrenheit = Degree / 5 * 9 + 32;
      System.out.println("Fahrenheit= "+ Fahrenheit + " Degrees");
    }
  }
  