import java.util.*;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		long K = Long.parseLong(sc.next());

		String two = "2";
		String zero = "0";
		String rtn = "";

		if (K % 2 == 0) {
        	rtn = String.join("", Stream.generate(() -> two).limit(K/2).collect(Collectors.toList()));
			rtn += zero;
		} else {
			K++;
        	rtn = String.join("", Stream.generate(() -> two).limit(K/2).collect(Collectors.toList()));
		}

		System.out.println(rtn);
	}
}