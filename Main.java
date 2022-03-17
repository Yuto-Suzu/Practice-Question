import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double Sintyo , Taiju , BMI;

        System.out.print("Please tell me your height. (Unit is m.) -> ");
        Sintyo = scan.nextDouble();
        System.out.println();

        System.out.print("Please tell me your body weight. (Unit is kg.) -> ");
        Taiju = scan.nextDouble();
        System.out.println();

        Sintyo = Sintyo * Sintyo;
        BMI = Taiju / Sintyo;

        System.out.println("Your BMI is " + ((Math.ceil(BMI * 100)) / 100));
    }
}