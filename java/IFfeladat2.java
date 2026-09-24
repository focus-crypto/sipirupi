import java.util.Scanner;

public class IFfeladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a magasságát");
        int num1 = sc.nextInt();
        if (num1>=150 && num1<=165) {
            System.out.println("Ön S méretű");
        }
        else if (num1>=166 && num1<=175) {
            System.out.println("Ön M méretű");
        }
        else if (num1>=176 && num1<=185) {
            System.out.println("Ön L méretű");
        }
        else if (num1>=186 && num1<=195) {
            System.out.println("Ön XL méretű");
        }
        else{
            System.out.println("NO SIZE");
        }
    }
}
