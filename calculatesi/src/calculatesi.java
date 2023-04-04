import java.util.Scanner;

public class calculatesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal,rate,time,simpleintrest;
        System.out.println("Enter Principal:-");
        principal = sc.nextFloat();
        System.out.println("Enter Rate of Intrest:-");
        rate = sc.nextFloat();
        System.out.println("Enter Time:-");
        time = sc.nextFloat();
        simpleintrest = principal*rate*time/100;
        System.out.println("Simple Intrest is:-"+simpleintrest);
    }
}