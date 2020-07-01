package PatientAppointement;
import java.util.*;
import java.io.*;
public class PatientData {
	
	private static String csvFile = "C:\\Faiqa\\PatientData.csv";
	
	
	public static String getCsvFile() {
		return csvFile;
	}

	public static void setCsvFile(String csvFile) {
		PatientData.csvFile = csvFile;
	}

	@SuppressWarnings("resource")
	public static List<Patient> findAll()  {
		List<Patient> patients = new ArrayList<Patient>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(PatientData.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Patient patient = new Patient();
				String[] patientRow = line.split(",");
				
				patient.setPATIENT_ID(Integer.parseInt(patientRow[0]));
				patient.setPATIENT_NAME(patientRow[1]);
				
				patients.add(patient);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return patients;
	}

	@SuppressWarnings("resource")
	public static Patient findOne(int PATIENT_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(PatientData.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Patient patient = new Patient();
				
				String[] patientRow = line.split(",");
				
				if (Integer.parseInt(patientRow[0]) == PATIENT_ID) {
					
					patient.setPATIENT_ID(Integer.parseInt(patientRow[0]));
					patient.setPATIENT_NAME(patientRow[1]);
					
					return patient;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@SuppressWarnings("resource")
	public static List<Patient> search(String search)  {
		List<Patient> patients = new ArrayList<Patient>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(PatientData.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Patient patient = new Patient();
				
				String[] patientRow = line.split(",");
				
				if (patientRow[1].contains(search) == true) {
					patient.setPATIENT_ID(Integer.parseInt(patientRow[0]));
					patient.setPATIENT_NAME(patientRow[1]);
					
					patients.add(patient);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return patients;
	}

	public static Patient Add(Patient patient) {
		FileWriter filewriter;

		List<Patient> patients = PatientData.findAll();

		try {
			filewriter = new FileWriter("C:\\Faiqa\\PatientData.txt");

			for (int i=0; i<patients.size(); i++) {
				filewriter.append(patients.get(i).toString());
				filewriter.append("\n");
			}
			if (patients.size()>0)
				patient.setPATIENT_ID(patients.get(patients.size()-1).getPATIENT_ID()+1);
			else
				patient.setPATIENT_ID(1);
			filewriter.append(patient.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return patient;
	}
	
	public static Patient DelOne(int Patient_ID) {
		FileWriter fileWriter;
		List<Patient> patients=findAll();
		Patient patient=PatientData.findOne(Patient_ID);
		
		try {
			fileWriter=new FileWriter(PatientData.getCsvFile());
			
			for(int i=0;i<patients.size();i++) {
				if(patients.get(i).getPATIENT_ID()!=Patient_ID) {
					fileWriter.append(patients.get(i).toString());
					fileWriter.append("\n");
				}
		}
		
		patients.add(patient);
		fileWriter.flush();
		fileWriter.close();
		
		return patient;
	}catch(Exception e) {
		e.printStackTrace();
	}
		return patient;
}
	public static Patient update(int Previous_ID,Patient NewObject) {
		DelOne(Previous_ID);
	 Add(NewObject);
	
	 System.out.println("Updated successfully");
	return NewObject;
	 
	}
}
