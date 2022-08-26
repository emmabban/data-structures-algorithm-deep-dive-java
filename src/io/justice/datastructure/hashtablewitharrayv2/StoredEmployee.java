package io.justice.datastructure.hashtablewitharrayv2;

public class StoredEmployee {
	private Employee employee;
	private String key;
	public Employee getEmployee() {
		return employee;
	}
	
	
	
	public StoredEmployee( String key ,Employee employee) {
		super();
		this.employee = employee;
		this.key = key;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		String empString = this.employee == null ? null: this.employee.toString();
		return "StoredEmployee [key= " + key + " employee = " + empString+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoredEmployee other = (StoredEmployee) obj;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
