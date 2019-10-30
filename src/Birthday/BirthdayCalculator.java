package Birthday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BirthdayCalculator {

	public static void main(String[] args) throws IOException {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		int userage = 0;
		int myage;
		int currentmonthnum = 0;
		int birthmonthnum = 0;
		int bmonthnum = 0;
		int cmonthnum = 0;
		int bday = 0;
		String birthyear;
		String birthmonth = null;
		String currentMonth = null;
		int cday = 0;
		int cyear = 0;
		int birth = 0;
		boolean stoplooping = false;
		System.out.println("Welcome to the Birthday Calculator \n ");
		do {

			boolean future = false;
			while (!future) {
				System.out.println("Please, enter the current month (1-12) ");
				 currentMonth = month();

				System.out.println("Please, enter the current day ");

				cday = day(currentMonth);

				System.out.println("Please enter the current year");
				String currentyear = readRacer.readLine();
				cyear = Integer.parseInt(currentyear);
				future = true;

				// currentmonthnum = num(currentmonth);
				// birthmonthnum = num(birthmonth);

				boolean validbirthyear = false;
				while (!validbirthyear) {
					System.out.println("Please enter your birth year");
					birthyear = readRacer.readLine();
					birth = Integer.parseInt(birthyear);
					if (birth <= cyear) {
						validbirthyear = true;
					} else {
						System.out.println("enter a valid year");
					}
				}
				boolean validbmonth = false;
				while (!validbmonth) {

					System.out.println("Please enter your birth month");
					birthmonth = month();
					cmonthnum = num(currentMonth);
					bmonthnum = num(birthmonth);
					if (birth == cyear && bmonthnum > cmonthnum) {
						validbmonth = false;

						System.out.println("Invalid");
						validbmonth = false;
					} else if (birth == cyear && bmonthnum <= cmonthnum) {
	
						validbmonth = true;
						;
					} else {
						validbmonth = true;
					}
				}
				// month = Integer.parseInt(currentmonth);

				boolean validbday = false;
				while (!validbday) {
					System.out.println("Please, enter your birth day");
					bday = day(birthmonth);
					if (bday <= cday && cyear == birth && cmonthnum == bmonthnum) {
						validbday = true;
					} else if (cyear != birth && bday >= cday || bday <= cday) {
						validbday = true;
					} else {
						validbday = false;
						System.out.println("Invalid");
					}

				}

				/* cday = day(month); */

				// if (birth == cyear) {
				// if (birthmonth == currentmonth)
				// if (bday == cday)
				// future = true;
				// }
				//// else if (birthmonth <= currentmonth) {
				//// future = true;
				//// }
				// if (birth < cyear) {
				// future = true;
				// }
				// }

				System.out.println("The current date is" + " " + currentMonth + " " + cday + " " + cyear);

				System.out.println("Your birthday is" + " " + birthmonth + " " + bday + " " + birth);
			}
			userage = cyear - birth;

			
			if (birth == cyear && bday == cday) {
				
				System.out.println("Birthday");
			}
//			if (currentmonthnum > birthmonthnum) {
//				userage++;

			if(cyear != birth && cmonthnum < bmonthnum ){
				userage--;
				
			}
			if(cyear != birth && cmonthnum == bmonthnum && bday > cday){
				
			}
			 if (cyear != birth &&currentmonthnum == birthmonthnum && cday == bday) {
				 
			 } if(cyear != birth &&currentmonthnum == birthmonthnum && cday < bday){
			 
//			 }if(cyear != birth &&currentmonthnum == birthmonthnum && cday > bday){
//				 userage--;
			 } if(cyear == birth && cday > bday){
			 
			 }

				 
//				if (cday > bday) {
//					userage--;
//
//				}else if(cday == bday){
//				userage++;
//				}
//				userage--;
			

			myage = 18;

			System.out.println("You are " + userage + " " + "years old \n");
			if (userage > myage) {
				System.out.println("You are older than the creator \n");
			} else if (userage == myage) {
				System.out.println("You are the same age as the creator \n");
			} else {
				System.out.println("You are younger than the creator \n");
			}
			System.out.println("Would you like to enter new information. \n" + "Press 1 to continue or 2 to exit");
			String menu = readRacer.readLine();
			int option = Integer.parseInt(menu);
			if (option == 2) {
				System.out.println("Exit");
				stoplooping = true;
			}

		} while (!stoplooping);
	}

	public static String month() throws IOException {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = false;
		String input = "";
		int months;
		while (!valid) {
			input = readRacer.readLine();
			months = Integer.parseInt(input);
			switch (months) {
			case 1:
				input = "January";

				valid = true;
				break;
			case 2:
				input = "February";

				valid = true;
				break;
			case 3:
				input = "March";

				valid = true;
				break;
			case 4:
				input = "April";

				valid = true;
				break;
			case 5:
				input = "May";

				valid = true;
				break;
			case 6:
				input = "June";
				valid = true;
				break;
			case 7:
				input = "July";
				valid = true;

				break;
			case 8:
				input = "August";
				valid = true;
				break;
			case 9:
				input = "September";
				valid = true;
				break;
			case 10:
				input = "October";
				valid = true;
				break;
			case 11:
				input = "November";
				valid = true;
				break;
			case 12:
				input = "December";
				valid = true;
				break;
			default:
				System.out.println("Enter a valid month");
				break;
			}
		}
		return input;
	}

	public static int day(String months) throws IOException {
		BufferedReader initReader = new BufferedReader(new InputStreamReader(System.in));

		int day = 0;
		switch (months) {
		case "January":
			day = 31;
			break;
		case "February":
			day = 29;
			break;
		case "March":
			day = 31;
			break;
		case "April":
			day = 30;
			break;
		case "May":
			day = 31;
			break;
		case "June":
			day = 30;
			break;
		case "July":
			day = 31;
			break;
		case "August":
			day = 31;
			break;
		case "September":
			day = 30;
			break;
		case "October":
			day = 31;
			break;
		case "November":
			day = 30;
			break;
		case "December":
			day = 31;
			break;

		}
		boolean valid = false;
		int num = 0;
		String nums;
		while (!valid) {
			nums = initReader.readLine();
			num = Integer.parseInt(nums);

			if (num > 0 && num <= day) {
				valid = true;

			} else {
				System.out.println("Enter a valid day");
			}
		}
		return num;
	}

	public static int num(String nums) {
		int monthvalue = 0;
		switch (nums) {
		case "January":
			monthvalue = 1;
			break;
		case "February":
			monthvalue = 2;
			break;
		case "March":
			monthvalue = 3;
			break;
		case "April":
			monthvalue = 4;
			break;
		case "May":
			monthvalue = 5;
			break;
		case "June":
			monthvalue = 6;
			break;
		case "July":
			monthvalue = 7;
			break;
		case "August":
			monthvalue = 8;
			break;
		case "September":
			monthvalue = 9;
			break;
		case "October":
			monthvalue = 10;
			break;
		case "November":
			monthvalue = 11;
			break;
		case "December":
			monthvalue = 12;
			break;
		}
		return monthvalue;
	}
}
