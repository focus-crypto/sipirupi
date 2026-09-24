import java.util.Scanner;

public class IFfeladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy egész számot");
        int num1 = sc.nextInt();
        System.out.println("Adjon meg még egy egész számot");
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("Az első szám a nagyobb");
        }
        else if (num2>num1){
            System.out.println("A második szám a nagyobb");
        }
        else {
            System.out.println("A két szám egyenlő");
        }
    }
}
