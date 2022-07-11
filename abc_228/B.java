import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer N = sc.nextInt();
		Integer X = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        Integer rtn = 0;

        for (int i = 0; i < N; i++) {
		    list.add(sc.nextInt());
        }

        Integer target = X;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean loop = true;

        while (loop) {
            if (!map.containsKey(target)) {
                map.put(target, target);
                target = list.get(target-1);
                rtn++;
            } else {
                loop = false;
            }
        }

		System.out.println(rtn);
	}
}