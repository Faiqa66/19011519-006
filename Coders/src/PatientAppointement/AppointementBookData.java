package PatientAppointement;

import java.util.*;
import java.io.*;

public class AppointementBookData {

	private static String csvFile = "C:\\Faiqa\\AppointementBookData.csv";

	public static String getCsvFile() {
		return csvFile;
	}

	public static void setCsvFile(String csvFile) {
		AppointementBookData.csvFile = csvFile;
	}
	
	public static List<AppointementBook> findAll()  {
		List<AppointementBook> books = new ArrayList<AppointementBook>();
		String line;
		
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferreader = new BufferedReader(new FileReader(AppointementBookData.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				AppointementBook book = new AppointementBook();
				
				String[] bookRow = line.split(",");
				book.setDEPATEMENT_ID(Integer.parseInt(bookRow[0]));
				book.setDEPARTEMENT_NAME(bookRow[1]);
				book.setAPPOINTEMENT_DATE(bookRow[2]);
				book.setAPPOINTEMENT_TIME(bookRow[3]);
				
				books.add(book);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}

	@SuppressWarnings("resource")
	public static AppointementBook findOne(int Departement_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(AppointementBookData.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				AppointementBook book = new AppointementBook();
				
				String[] bookRow = line.split(",");
				
				if (Integer.parseInt(bookRow[0]) == Departement_ID) {
					book.setDEPATEMENT_ID(Integer.parseInt(bookRow[0]));
					book.setDEPARTEMENT_NAME(bookRow[1]);
					book.setAPPOINTEMENT_DATE(bookRow[2]);
					book.setAPPOINTEMENT_TIME(bookRow[3]);
					
					return book;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@SuppressWarnings("resource")
	public static List<AppointementBook> search(String search)  {
		List<AppointementBook> books = new ArrayList<AppointementBook>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(AppointementBookData.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				AppointementBook book = new AppointementBook();
				String[] bookRow = line.split(",");
				
				
				if (bookRow[1].contains(search) == true) {
					book.setDEPATEMENT_ID(Integer.parseInt(bookRow[0]));
					book.setDEPARTEMENT_NAME(bookRow[1]);
					book.setAPPOINTEMENT_TIME(bookRow[2]);
					book.setAPPOINTEMENT_DATE(bookRow[3]);
					
					books.add(book);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}

	public static AppointementBook Add(AppointementBook book) {
		FileWriter filewriter;

		List<AppointementBook> books = AppointementBookData.findAll();

		try {
			filewriter = new FileWriter("C:\\Faiqa\\AppointementBookData.txt");

			for (int i=0; i<books.size(); i++) {
				filewriter.append(books.get(i).toString());
				filewriter.append("\n");
			}
			if (books.size()>0)
				book.setDEPATEMENT_ID(books.get(books.size()-1).getDEPATEMENT_ID()+1);
			else
				book.setDEPATEMENT_ID(1);
			filewriter.append(book.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return book;
	}
	
	public static AppointementBook DelOne(int AppointementBook_ID) {
		FileWriter fileWriter;
		List<AppointementBook> books=findAll();
		AppointementBook book=AppointementBookData.findOne(AppointementBook_ID);
		
		try {
			fileWriter=new FileWriter(AppointementBookData.getCsvFile());
			
			for(int i=0;i<books.size();i++) {
				if(books.get(i).getDEPATEMENT_ID()!=AppointementBook_ID) {
					fileWriter.append(books.get(i).toString());
					fileWriter.append("\n");
				}
		}
		
		books.add(book);
		fileWriter.flush();
		fileWriter.close();
		
		return book;
	}catch(Exception e) {
		e.printStackTrace();
	}
		return book;
}
	
	public static AppointementBook Update(int Previous_ID,AppointementBook NewObject) {
		DelOne(Previous_ID);
		Add(NewObject);
		System.out.println("Updated Successfully!");
		return NewObject;
	}
}


