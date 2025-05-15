
public class EmpDetails 
{
	int empid;
	String name,address,dept;
	int salary;
	
	public static void main(String[] args)
	{
		EmpDetails e=new EmpDetails();
		e.empid=1;
		e.name="Suresh";
		e.address="Karve";
		e.dept="QA";
		e.salary=50000;
		
		System.out.println("Employee ID: "+e.empid);
		System.out.println("Name of the Employee: "+e.name);
		System.out.println("Address of the Employee: "+e.address);
		System.out.println("Department of the Employee: "+e.dept);
		System.out.println("Salary of the Employee: "+e.salary);
		
		EmpDetails e1=new EmpDetails();
		e1.empid=2;
		e1.name="Prajakta";
		e1.address="Ichalkaranji";
		e1.dept="Developer";
		e1.salary=75000;
		
		System.out.println("Employee ID: "+e1.empid);
		System.out.println("Name of the Employee: "+e1.name);
		System.out.println("Address of the Employee: "+e1.address);
		System.out.println("Department of the Employee: "+e1.dept);
		System.out.println("Salary of the Employee: "+e1.salary);
	}
}
