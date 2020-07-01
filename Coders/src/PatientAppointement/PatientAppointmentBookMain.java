package PatientAppointement;

import java.util.List;

public class PatientAppointmentBookMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		
		System.out.println("Going to show you Patient Data and Appointement Data\n");
		
		
		System.out.println("================================");
		System.out.println("\t\tPatient Data\t\t\n");
		System.out.println("===============================");
		PatientData patientdata=new PatientData();
		
		System.out.println("\t\tFind One\t\t");
		Patient patients=PatientData.findOne(1);
		System.out.println(patients.toString());
		
		System.out.println("\n\t\tFind All\t\t\n");
		
		List<Patient> patient=PatientData.findAll();
		for(int i=0;i<patient.size();i++) {
			System.out.println(patient.get(i).toString());
			
		}
		
		System.out.println("\t\tSearch\t\t\n");
		
		patient=PatientData.search("Shahzad");
		for(int i=0;i<patient.size();i++) {
			System.out.println(patient.get(i).toString());
		}
		
		System.out.println("\t\tAdd\t\t\n");
		patients.setPATIENT_ID(1);
		patients.setPATIENT_NAME("Hamid Ali");
		patients=PatientData.Add(patients);
		System.out.println(patients.toString());
        
		System.out.println("\t\tDel One\t\t");
		patients.setPATIENT_ID(3);
		patients.setPATIENT_NAME("Hira Munir");
		patients=PatientData.DelOne(3);
		System.out.println(patients.toString());
		
		
		System.out.println("================================");
		System.out.println("\t\tAppointement Book Data\t\t\n");
		System.out.println("===============================");
		AppointementBookData bookdata=new AppointementBookData();
		
		System.out.println("\t\tFind One\t\t");
		AppointementBook books=AppointementBookData.findOne(1);
		System.out.println(patients.toString());
		
		System.out.println("\n\t\tFind All\t\t\n");
		
		List<AppointementBook> book=AppointementBookData.findAll();
		for(int i=0;i<book.size();i++) {
			System.out.println(book.get(i).toString());
			
		}
		
		System.out.println("\t\tSearch\t\t\n");
		
		book=bookdata.search("");
		for(int i=0;i<book.size();i++) {
			System.out.println(book.get(i).toString());
		}
		
		System.out.println("\t\tAdd\t\t\n");
		books.setDEPATEMENT_ID(1);
		books.setDEPARTEMENT_NAME("Cardiology");
		books.setAPPOINTEMENT_TIME("Morning and Evening");
		books.setAPPOINTEMENT_DATE("12/3/2020");
		books=AppointementBookData.Add(books);
		System.out.println(books.toString());

	System.out.println("\t\tDel One\t\t");
		books.setDEPATEMENT_ID(3);
		books.setDEPARTEMENT_NAME("Health&Safety");
		books.setAPPOINTEMENT_TIME("Morning and Evenin");
		books.setAPPOINTEMENT_DATE("20/3/2020");
		books=AppointementBookData.DelOne(3);
		System.out.println(books.toString());
		
		
}
}
