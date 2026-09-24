import java.util.Scanner;

public class IFfeladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy egész számot");
        int num1 = sc.nextInt();
        System.out.println("Adjon meg még egy egész számot");
        int num2 = sc.nextInt();
        System.out.println("Adjon meg még egy egész számot");
        int num3 = sc.nextInt();
        if (num1>num2&&num1>num3) {
            System.out.println("az első szám a legnagyobb");
            if (num2>num3) {
                System.out.println("a második szám a középső");
                System.out.println("a harmadik szám a legkisebb");
            }
            else {
                System.out.println("a harmadik szám a középső");
                System.out.println("a második szám a legkisebb");
            }
        }
        else if (num2>num1&&num2>num3) {
            System.out.println("a második szám a legnagyobb");
            if (num1>num3) {
                System.out.println("az első szám a középső");
                System.out.println("a harmadik szám a legkisebb");
            }
            else {
                System.out.println("a harmadik szám a középső");
                System.out.println("az első szám a legkisebb");
            }
        }
        else {
            System.out.println("a harmadik szám a legnagyobb");
            if (num1>num2) {
                System.out.println("az első szám a középső");
                System.out.println("a második szám a legkisebb");
            }
            else {
                System.out.println("a második szám a középső");
                System.out.println("az első szám a legkisebb");
            }
        }
    }
    
}
