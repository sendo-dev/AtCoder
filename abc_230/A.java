import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer argInt = sc.nextInt();

        String result = "AGC0";

        if (argInt >= 42) {
            argInt++;
        }
        if (argInt > 9) {
            result += String.valueOf(argInt);
        } else {
            result += "0" + String.valueOf(argInt);
        }

		System.out.println(result);
	}
}