package pack1.Optional;

import java.util.Optional;

public class Main
{
	public static void main(String[] args)
	{
		EmployeeService es = new EmployeeService();
		Optional<Employee> opEmp =es.getEmpId(101);
		System.out.println(opEmp);
		
		if(opEmp.isPresent())
		{
			Employee emp =opEmp.get();
			System.out.println(emp.getName());
		}
		else
		{
			System.out.println("No employee found with that ID");
		}
	}

}
