package Instance;
public class EmployeeInformation {
       String FirstName;
       String LastName;
       double Monthlysalary;
      
       
    EmployeeInformation(String Fname,String Lname,double salary){
    	this.FirstName=Fname;
    	this.LastName=Lname;
    	if(Monthlysalary>0) {
    	this.Monthlysalary=salary;
    	
    }
    }


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public double getMonthlysalary() {
		return Monthlysalary;
	}


	public void setMonthlysalary(double monthlysalary) {
		if(Monthlysalary>0) {
		Monthlysalary = monthlysalary;
	}
}
}

