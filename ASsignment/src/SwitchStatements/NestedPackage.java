package SwitchStatements;

public class NestedPackage {
public static void main(String... args) {
	char branch='C';
	int collegeYear=2;
	
	switch(collegeYear) {
	case 1:
		 System.out.println("English, Maths, Science");  
		 break;
	case 2:
	{
	  switch(branch) {
	  case 'C':
		  System.out.println("Operating System, Java, Data Structure");  
		  break;
	  case 'D':
		  System.out.println("Micro Processor,Logic Switching Theory");
		  break;
	  case 'E':
		  System.out.println("Drawing,Manufecturing machine");
	  }
	  break;
	}
	  case 3:
	  {
		  switch(branch) {
		  case 'C':
			  System.out.println("Computer Organization, MultiMedia");  
              break;  
          case 'E':  
              System.out.println("Fundamentals of Logic Design, Microelectronics");  
              break;  
          case 'M':  
              System.out.println("Internal Combustion Engines, Mechanical Vibration");  
		  }
		  break;
	  }	 	  
	}
}
}

