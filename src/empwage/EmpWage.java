package empwage;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		// TODO Auto-generated method stub
		int employeePresent = 1;
		int isPresent = (int) (Math.floor(Math.random() * 10) % 2);
		if (isPresent == employeePresent)
			System.out.println("Empolyee is Present");
		else
			System.out.println("Employee is Absent");
			
	}

}
