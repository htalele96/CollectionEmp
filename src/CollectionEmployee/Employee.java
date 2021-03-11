package CollectionEmployee;

public class Employee {
	int empId;
	String empName;

	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public int getempId() {
		return empId;
	}
	public String getempName() {
		return empName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empName;
	}

}
