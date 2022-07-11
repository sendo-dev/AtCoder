import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer tmptar = 0;
        
        //　正解のリストを作成
        for (int j = 1;j <= 142;j++) {
            for (int k = 1;k <= j;k++) {
                tmptar = (4 * j * k) + (3 * j) + (3 * k);
                if (tmptar > 1000) {
                    break;
                }
                if (!map.containsKey(tmptar)) {
                    map.put(tmptar, tmptar);
                }
            }
        }

        int N = sc.nextInt();
        int rtn = 0;

        for (int i = 0;i < N;i++) {
            int target = sc.nextInt();
            if (!map.containsKey(target)) {
                rtn++;
            }
            System.out.println("target: " + target);
        }
		System.out.println(rtn);
	}
}