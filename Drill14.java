import java.util.Scanner;
import java.lang.Math;
public class Drill14 {
    public static void main(String[] args) {
        int Hour, Min, Sec;
        Scanner ObjA = new Scanner(System.in);
        System.out.println("Enter number of Seconds");
        int VarTime = ObjA.nextInt();
        ///Conversion
        Hour = VarTime / 3600;
        Min = (VarTime % 3600)/60;
        Sec = (VarTime % 3600) % 60;
        System.out.println(Hour + " Hours " + Min + " Minutes " + Sec + " Seconds ");
  }
}