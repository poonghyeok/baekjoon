package baekjoon_part;

class components{
	public int num = 0;
	public int jaritsu = 0;
	public int[] numArr;
	public int childNum = 0;
	
	public components(int inputNum) {
		this.num = inputNum;
		this.jaritsu = getJaritsu();
		this.numArr = new int[jaritsu];
		alignElements();
		this.childNum = getChildNum();
	}
	
	public int getJaritsu() {
		int result = 0;
		for(int i = 0; i < 100; i++) {
			if(num / (int)(Math.pow(10,i)) > 0) {
				result = i+1;
			}else {
				break;
			}
		}
		
		return result;
	}
	
	public void alignElements() {
		int tempNum = num;
		for(int i = jaritsu-1; i >= 0; i--) {
			int mok = tempNum / (int)Math.pow(10,i); 
			numArr[i] = mok;
			tempNum -= mok * (int)Math.pow(10,i);
		}
	}
	
	public int getChildNum() {
		int sumElements = 0;
		for(int i = 0 ; i < jaritsu; i++) {
			sumElements += numArr[i];
		}
		return num + sumElements; 
	}
	
	public boolean isSelf() {
		boolean result = false;
		if(num == childNum) {
			result = true;
		}
		return result;
	}
	
}


public class baek4673 {
	public void mainProcess() {
		components[] compos = new components[10000];
		int[] notSelfnum = new int[10000];
		int numOfNot = 0;
		 
		for(int j = 1; j < 10000; j++) {
			compos[j] = new components(j);
			if(compos[j].num > 10000) {
				break;
			}
			if(compos[j].childNum < 10000) {
				notSelfnum[j] = compos[j].childNum;
				numOfNot++;
			}
		}
		
		for(int j = 0; j < 10000; j++) {
			boolean tmp = true;
			for(int k = 0; k < 10000; k++) {
				if(j == notSelfnum[k]) {
					tmp = false;
					break;
				}
			}
			if(tmp) {
				System.out.println(j);
			}
			
		}
	}
	
	public static void main(String args[]) {
		baek4673 mainfunc = new baek4673();
		mainfunc.mainProcess();
	}
}
