import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

        Integer loopNum = sc.nextInt();

        for (int i = 0; i <= loopNum; i++) {
            Technique tmp = new Technique();
            tmp.setTime(sc.nextInt);
        }


		System.out.println();
	}

    public static int get() {
        return 1;
    }

    public class Technique {
        // かかる時間
        private Integer time;
        // 必要な技
        private Integer[] must;
    }
}