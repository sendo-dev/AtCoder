import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        
		String argStr = sc.next();

        int startIndex = argStr.indexOf(".") + 1;

        String targetNum = argStr.substring(startIndex, startIndex + 1);

        int resultNum = Integer.parseInt(argStr.substring(0, startIndex - 1));

        if (Integer.parseInt(targetNum) > 4) {
            resultNum++;
        }

		System.out.print(resultNum);
	}
}