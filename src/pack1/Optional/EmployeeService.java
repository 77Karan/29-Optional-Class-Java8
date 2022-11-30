package pack1.Optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EmployeeService 
{
	private Map<Integer,Employee> empMap = new HashMap<Integer,Employee>();
	
	public Optional<Employee> getEmpId(Integer id)
	{
		Employee emp = empMap.get(id);
		Optional<Employee> empOptional =Optional.ofNullable(emp);
		return empOptional;
		
	}

}
