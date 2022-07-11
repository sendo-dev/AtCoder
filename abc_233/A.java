import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer X = sc.nextInt();
		Integer Y = sc.nextInt();

		Integer rtn = 0;

        if (X < Y) {
            if ((Y - X) % 10 == 0) {
                rtn = (Y - X) / 10;
            } else {
                rtn = (Y - X) / 10 + 1;
            }
        }

		System.out.println(rtn);
	}
}