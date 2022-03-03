import java.lang.Math;
public class Drill12 {
    public static void main(String[] args) {
        System.out.println("number" + "\t" + "square" + "\t" + "cube");
        for (int i = 0; i < 9; i++){
            System.out.println(i + "\t" + (int)Math.pow(i,2) + "\t" + (int)Math.pow(i,3));
        }
    }
  }
  