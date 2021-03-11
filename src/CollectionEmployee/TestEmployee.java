package CollectionEmployee;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestEmployee {

	public static void main(String[] args) {
		//This is develop change
		Employee employeeArray[]=new Employee[10];
		
		for(int i=0;i<10;i++) {
			Employee employee=new Employee();
			employee.setEmpName("Name"+" "+i);
			employee.setEmpId(i);
			employeeArray[i]=employee;
		}
		
		for(int i=0;i<4;i++) {
			Employee employee3= employeeArray[i];
			System.out.println(employee3);
		}
		
		
		///Employeee List
		
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		
		for(int i=0;i<10;i++) {
			Employee employee2=new Employee();
			employee2.setEmpName("Name"+" "+i);
			employee2.setEmpId(i);
			employeeList.add(employee2);
		
	}

		for(int i=0;i<10;i++) {
			
			 Employee employee4=employeeList.get(i);
			System.out.println(employee4);
			System.out.println(employee4.getempId());
		}
		 System.out.println("linklist");
		
		LinkedList<Employee> employeelinklist=new LinkedList<Employee>();
		
		
		for(int i=0;i<10;i++) {
			Employee emp=new Employee();
			emp.setEmpName("Name"+" "+i);
			emp.setEmpId(i);
			employeelinklist.add(emp);
			
		}
		
		for(int i=0;i<10;i++) {
			
			 Employee emp4=employeeList.get(i);
			System.out.println(emp4);
			//System.out.println(employee4.getempId());
		}

		
		

}
}
