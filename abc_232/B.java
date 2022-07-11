	import java.util.*;

	public class Main {
		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			
			String S = sc.next();
			String T = sc.next();

			String rtn = "Yes";

			int len = S.length();
			String targetS = "";
			int intValS = 0;
			String targetT = "";
			int intValT = 0;
			int difference = 0;
			for (int i = 0; i < len; i++) {
				targetS = S.substring(i, i+1);
				intValS = Byte.toUnsignedInt(targetS.getBytes()[0]);
				targetT = T.substring(i, i+1);
				intValT = Byte.toUnsignedInt(targetT.getBytes()[0]);
				if (i == 0) {
					difference = intValS - intValT;
				} else {
					intValT = intValT + difference;
					if (intValS != intValT) {
						if (intValS - intValT != 26 && intValT - intValS != 26) {
							rtn = "No";
							break;
						}

					}
				}
			}
			System.out.println(rtn);
		}
	}