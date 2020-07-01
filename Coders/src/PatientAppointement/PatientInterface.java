package PatientAppointement;

import java.util.*;
public class PatientInterface {

	public static void RoomManu() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		
		while (choice!=6) {
			System.out.println("=====================================================");
			System.out.println("Patient Menu");
			System.out.println("=====================================================");
			System.out.println("1.   Insert");
			System.out.println("2.   Delete");
			System.out.println("3.   Show");
			System.out.println("4.   Show One Room Data");
			System.out.println("5.   Search");
			System.out.println("6.   Back");
			System.out.print("Enter Your Choice [1-6]: ");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("+++++++++++++++++++++++++++++++++");
				System.out.println("Add New Room");
				System.out.println("+++++++++++++++++++++++++++++++++");
				Patient patient = new Patient();
							
				System.out.println("Enter Patient Name: ");
				String patie = scan.nextLine();
				patie+=scan.nextLine();
				patient.setPATIENT_NAME(patie);
				
				
				patient= PatientData.Add(patient);
				System.out.println(patient.toString());
				
				System.out.println("---------------------------------\n");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Patient Data");
				System.out.println("---------------------------------");
				
				System.out.println("Enter Patient ID: ");
				int patient_ID = scan.nextInt();
				
				Patient patientdelete = PatientData.DelOne(patient_ID);
				System.out.println(patientdelete.toString());
				System.out.println("---------------------------------\n");
				break;
			case 3:
				System.out.println("--------------$$$$---------------");
				System.out.println("Show All Patient Data");
				System.out.println("--------------$$$$---------------");
				List<Patient> patients= PatientData.findAll();
				for (int i=0; i<patients.size(); i++) {
					System.out.println(patients.get(i).toString());
				}
				System.out.println("---------------------------------\n");
				break;
			case 4:
				System.out.println("-----------------$$$$-------------");
				System.out.println("Show One Room Data");
				System.out.println("-----------------$$$$--------------");
				Patient patient1=PatientData.findOne(1);
				System.out.println(patient1.toString());
				System.out.println("------------------------------------\n");
			    
				break;
			case 5:
				System.out.println("-----------********----------------");
				System.out.println("Search Patient Data");
				System.out.println("-----------********--------------");
				
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<Patient> patientsearch = PatientData.search(search);
				for (int i=0; i<patientsearch.size(); i++) {
					System.out.println(patientsearch.get(i).toString());
				}
				System.out.println("---------------------------------\n");
				
				break;
			
			case 6:
				break;
			}
		}
	}
}
