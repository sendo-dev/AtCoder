import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        Integer intA = sc.nextInt();
        Integer intB = sc.nextInt();

        if (intA * intB % 2 == 1) {
            System.out.print("Odd");
        } else {
            System.out.print("Even");
        }
    }
}