
public class Pretest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double unit = 315, sum = 0, ft = 24.44, monthly = 40.90, vat;
		
		System.out.println("Enter number of unit : " + unit);
		
		if(unit <= 150) {
			sum = unit * 1.8047;
		}else if(unit <= 400 || unit > 150) {
			sum = (150 * 1.8047) + ((unit - 150) * 2.7781);
		}else {
			sum = (150 * 1.8047) + (250 * 2.7781) + ((unit - 400) * 2.9780);
		}
		
		ft = (ft * unit) / 100;
		sum = sum + monthly + ft;
		vat = sum * 0.07;
		sum = sum + vat;
		System.out.println("Electrical Unit Expense : " + sum + " baht");
	}
	
}
