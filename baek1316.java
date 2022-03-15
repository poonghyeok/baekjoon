package baekjoon_part;

	import java.util.Scanner;
	
	public class baek1316 {
	
		
		public void mainProcess() {
			Scanner sc = new Scanner(System.in);
			int stringNum = sc.nextInt();
			int groupNum = 0;
			
			for(int i = 0; i < stringNum; i++) {
				String userInput = sc.next();
				StringBuffer sb = new StringBuffer(userInput);
				if(isGroup(sb)) {
					groupNum++;
				}
			}
			
			System.out.println(groupNum);
			
			sc.close();
		}
		
		public boolean isGroup(StringBuffer sb) {
			boolean result = false;
			int initNum = sb.length();
			for(int j = 0; j < initNum; j++) {
				if(sb.length() <= 1) {
					result = true;
					break;
				}
				String theChar = sb.substring(0,1);
				int startIndex = 0;
				int endIndex = startIndex+1;
				
				for(
						int k = endIndex; k < sb.length(); k++) {
					if(sb.charAt(k) == theChar.charAt(0)) {
						endIndex++;
					}else {
						break;
					}
				}
				
				sb.delete(startIndex, endIndex);
				
				if(sb.indexOf(theChar) > -1) {
					break;
				}
				
			}
			
			return result;
			
		}
		
		public static void main(String[] args) {
		
			baek1316 me = new baek1316();
			me.mainProcess();
			
		}
		
	}
