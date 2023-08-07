
public class AverageMarks {

	public static void main(String[] args) {
		int mark1 = 45;
		int  mark2 = 55;
		int mark3 = 25;
		int mark4 = 30;
		
		double average= (mark1+mark2+mark3+mark4)/4;
		
		System.out.println("Average marks:"+ average);
		
		if(average>50) {
			System.out.println("Result:Pass");}
			else {
				System.out.println("Result:Fail");
			}
		
		
	}

}
