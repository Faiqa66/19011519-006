import java.util.*;
public class Employee {
	public static void main(String[] args) {
	ArrayList<EInformation> myList=new ArrayList<EInformation>();
    EInformation e=new EInformation();
    {
    for(int n=0;n<3;n++) {
    	e.getInfor();
    	myList.add(e);
    }
    for(int i1=0;i1<=myList.size();i1++) {
    e.showInfor();	 
    }
}
}
}

