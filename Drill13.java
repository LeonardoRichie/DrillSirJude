import java.util.Scanner;
import java.lang.Math;
public class Drill13 {
    public static void main(String[] args) {
        float Result;
        ///A
        Scanner ObjA = new Scanner(System.in);
        System.out.println("A: ");
        float VarA = ObjA.nextFloat();

        ///B
        Scanner ObjB = new Scanner(System.in);
        System.out.println("B: ");
        float VarB = ObjB.nextFloat();
        
        ///C
        Scanner ObjC = new Scanner(System.in);
        System.out.println("C: ");
        float VarC = ObjC.nextFloat();

        ///Result = -VarB + (float)Math.sqrt((float)Math.pow(VarB, 2) - 4 * VarA * VarC) / 2 * VarA;

        Result = (-VarB + (float)Math.sqrt((float)Math.pow(VarB, 2) - (4 * VarA * VarC))) / 2 * VarA;
        if (VarA == 0){
            System.out.println("Undefined");
        }
        else{
            System.out.println(Result);
    }
  }
}  