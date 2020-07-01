package PatientAppointement;

import java.util.List;
import java.util.Scanner;

public class AppointementBookInterface {
	public static void RoomManu() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		
		while (choice!=6) {
			System.out.println("=====================================================");
			System.out.println("Appointement Book Menu");
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
				AppointementBook book = new AppointementBook();
							
				System.out.println("Enter Departement Name: ");
				String depname = scan.nextLine();
				depname+=scan.nextLine();
				book.setDEPARTEMENT_NAME(depname);
				
				System.out.println("Add New Appointement Date");
				String appdate=scan.nextLine();
				appdate+=scan.nextLine();
				book.setAPPOINTEMENT_DATE(appdate);
				
				System.out.println("Add New Appointement Time");
				String appTime=scan.nextLine();
				appTime+=scan.nextLine();
				book.setAPPOINTEMENT_TIME(appTime);
				
				book= AppointementBookData.Add(book);
				System.out.println(book.toString());
				
				System.out.println("---------------------------------\n");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Delete Appointement ID");
				System.out.println("---------------------------------");
				System.out.println("Enter Appointement ID: ");
				int app_ID = scan.nextInt();
				
				AppointementBook appdelete = AppointementBookData.DelOne(app_ID);
				System.out.println(appdelete.toString());
				System.out.println("---------------------------------\n");
				break;
			case 3:
				System.out.println("--------------$$$$---------------");
				System.out.println("Show All Appointement Book Data");
				System.out.println("--------------$$$$---------------");
				List<AppointementBook> books = AppointementBookData.findAll();
				for (int i=0; i<books.size(); i++) {
					System.out.println(books.get(i).toString());
				}
				System.out.println("---------------------------------\n");
				break;
			case 4:
				System.out.println("-----------------$$$$-------------");
				System.out.println("Show One Appointement Book Data");
				System.out.println("-----------------$$$$--------------");
				AppointementBook app1=AppointementBookData.findOne(1);
				System.out.println(app1.toString());
				System.out.println("------------------------------------\n");
			    
				break;
			case 5:
				System.out.println("-----------********----------------");
				System.out.println("Search Appointement Book Data");
				System.out.println("-----------********--------------");
				System.out.println("Enter search: ");
				String search = scan.nextLine();
				search+=scan.nextLine();
				List<AppointementBook> booksearch = AppointementBookData.search(search);
				for (int i=0; i<booksearch.size(); i++) {
					System.out.println(booksearch.get(i).toString());
				}
				System.out.println("---------------------------------\n");
				
				break;
			
			case 6:
				break;
			}
		}
	}
}
