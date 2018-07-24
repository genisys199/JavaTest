
public class CalNumber {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.out.println("Nattapon Chatsuwan");
		int x = 9, y = 3, sum = 0;
		sum = ++x - y--;
		System.out.println("Sum 1: " + sum);
		
		if(sum > 0) {
			sum += ++y;
		}else {
			sum -= --y;
		}
		System.out.println("Sum 2: " + sum);
		
		/*For Loop*/
		for(int i=1; i<7; i++) {
			System.out.println("Your Name " + i);
		}
		
		int i = 7;
		while(i <= 10) {
			System.out.println("Your Name " + i);
			i++;
		}
	}
	
}
