package ManagementSystem;

import java.util.*;
public class Hotel {

	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();

	private String HOTEL_NAME;
	
	private String COUNTRY_NAME;
	
	private int NUMBER_OF_ROOMS;
	
	private long PRICE_PER_ROOM;
	
	private int HOTEL_RATING[]=new int[n];

	public String getHOTEL_NAME() {
		return HOTEL_NAME;
	}

	public void setHOTEL_NAME(String hOTEL_NAME) {
		HOTEL_NAME = hOTEL_NAME;
	}

	public String getCOUNTRY_NAME() {
		return COUNTRY_NAME;
	}

	public void setCOUNTRY_NAME(String cOUNTRY_NAME) {
		COUNTRY_NAME = cOUNTRY_NAME;
	}

	public int getNUMBER_OF_ROOMS() {
		return NUMBER_OF_ROOMS;
	}

	public void setNUMBER_OF_ROOMS(int nUMBER_OF_ROOMS) {
		NUMBER_OF_ROOMS = nUMBER_OF_ROOMS;
	}

	public long getPRICE_PER_ROOM() {
		return PRICE_PER_ROOM;
	}

	public void setPRICE_PER_ROOM(long pRICE_PER_ROOM) {
		PRICE_PER_ROOM = pRICE_PER_ROOM;
	}

	public int[] getHOTEL_RATING() {
		return HOTEL_RATING;
	}

	public void setHOTEL_RATING(int[] hOTEL_RATING) {
		HOTEL_RATING = hOTEL_RATING;
	}
	
	void add() {
		System.out.println("Enter number of rooms available:");
		NUMBER_OF_ROOMS=scan.nextInt();
		System.out.println("Enter hotel name:");
		HOTEL_NAME=scan.nextLine();
		System.out.println("Enter your country name:");
		COUNTRY_NAME=scan.nextLine();
		
	}
	
	void Room() {
		System.out.println("Enter total number of rooms:");
		int total=scan.nextInt();
		if(NUMBER_OF_ROOMS<total) {
			
		}
	}
}
