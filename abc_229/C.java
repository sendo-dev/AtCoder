import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int W = sc.nextInt();
        int A;
        int B;
        int g = 0;
        int rtn = 0;
        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        // 取得
        for (int i=0; i < N; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            if (map.containsKey(A)) {
                map.put(A, map.get(A)+B);
            } else {
                map.put(A, B);
            }
            g += B;
        }

        // 100g未満の場合
        if (g <= W) {
            for(Map.Entry<Integer, Integer> s : map.entrySet()) {
                rtn += s.getKey() * s.getValue();
            }
        // 比較が必要な場合
        } else {
            boolean end = false;
            boolean check = false;
          	int gg = 0;
            while (!end) {
                check = false;
                for(Map.Entry<Integer, Integer> s : map.entrySet()) {
                    if ((s.getValue() > 0) && (gg < W)) {
                        if ((W - gg) >= s.getValue()) {
                            rtn += s.getKey() * s.getValue();
                            s.setValue(0);
                            gg += s.getValue();
                            check = true;
                            break;
                        } else {
                            rtn += s.getKey() * (W - gg);
                            s.setValue(s.getValue()-(W - gg));
                            gg = W;
                            check = true;
                            break;
                        }
                    }
                }
                if (!check) {
                    end = true;
                }
            }
        }
		System.out.println(rtn);
    }
}