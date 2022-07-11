import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer N = sc.nextInt();

        // これを挟まないとカーソルが改行しない（？）
        sc.nextLine();

		List<String> strArray = new ArrayList<String>(Arrays.asList(sc.nextLine().split("\\s")));

        // Arrays.sort(strArray, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder(strArray);

        sb.reverse();

		System.out.println(strArray);
	}
}