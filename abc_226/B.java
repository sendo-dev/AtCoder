import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

        HashMap<String, String> mp = new HashMap<String, String>();

		Integer loopNum = sc.nextInt();

        String key = "";
        Integer count = 0;
        Integer sizeNum = 0;

        for (int i = 0; i <= loopNum; i++) {

            key += sc.nextLine();

            if (i > 0) {
                if (!mp.containsKey(key)) {
                    mp.put(key, key);
                    count++;
                }
            }
            key = "";
        }
		System.out.println(count);
	}
}