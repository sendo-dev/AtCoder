import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		Integer t = sc.nextInt();

		System.out.println(kansuu(kansuu(kansuu(t) + t) + kansuu(kansuu(t))));
	}

    public static Integer kansuu(Integer x) {
        return x*x + 2*x + 3;
    }
}