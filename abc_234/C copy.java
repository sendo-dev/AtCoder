import java.util.*;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		long K = Long.parseLong(sc.next());

		String two = "2";
		String one = "1";
		String rtn = "";

		rtn = Long.toBinaryString(K).replace(one, two);

		System.out.println(rtn);
	}
}