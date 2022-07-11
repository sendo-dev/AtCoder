import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		int num = sc.nextInt();
        int[] numList = new int[num];
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            numList[i] = sc.nextInt();
        }

        boolean end = false;
        while (end == false) {
            for (int i = 0; i < num; i++) {
                if (numList[i] % 2 == 0) {
                    numList[i] = numList[i] / 2; 
                } else {
                    end = true;
                    break;
                }
            }
            if (end == false) {
                cnt++;
            }
        }
        System.out.print(cnt);
	}
}