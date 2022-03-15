package baekjoon_part;

	import java.util.Scanner;
	
	public class baek1712 {
	
		public	double a,b,c;
		public int breakPoint;
		
		public void mainProcess() {
			Scanner sc = new Scanner(System.in);
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			if((int)b >= (int)c) {
				breakPoint = -1;
			}else {
				double minVal = (a/(c-b));
				double rest = minVal - (int)minVal;
				if (rest > 0.0) {
					minVal = Math.ceil(minVal);
					breakPoint = (int)minVal;
				}else if(rest == 0.0){
					breakPoint = (int)minVal + 1;
				}
				
			}
			System.out.println(breakPoint);
			
			
			sc.close();
		}
		
		public static void main(String[] args) {
			baek1712 me = new baek1712();
			me.mainProcess();
		
		}
	}
