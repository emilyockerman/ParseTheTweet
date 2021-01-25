/*
* parseTheTweet.java
* 
* Author: Emily Ockerman
* 
* Submission Date: September 6, 2018
*
* Purpose: If a tweet is entered in the correct order, this program will
* output the type, detail, location, latitude, and longitude of that tweet
* in a readable structure that makes the information contained in the
* tweet more understandable.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
CSCI 1301: Project 1 Page 3
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

import java.util.Scanner;


public class parseTheTweet {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
		//prompting user input
		String tweet = input.nextLine();
		int start = tweet.indexOf('#');
		int finish = tweet.indexOf(';');
		String type = tweet.substring(start + 5, finish).trim();
		System.out.println("Type:\t\t\t" + type.toUpperCase());
		
		//drawing out substring for detail
		int start2 = finish + 6;
		String newString = tweet.replace(',','-').substring(start2).trim();
		int finish2 = newString.indexOf(';');
		String detail = newString.substring(0, finish2);
		System.out.println("Detail:\t\t\t" + detail);
		
		//drawing out substring for location
		int start3 = finish2 + 6;
		String newString2 = newString.replace(',','-').substring(start3).trim();
		int finish3 = newString2.indexOf(';');
		String location = newString2.substring(0, finish3).trim();
		System.out.println("Location:\t\t" + location);

		//drawing out substring for latitude
		int start4 = finish3 + 6;
		String newString3 = newString2.substring(start4).trim();
		int finish4 = newString3.indexOf(';');		
		String latitude = newString3.substring(0, finish4).trim();
		System.out.println("Latitude:\t\t" + latitude);
		
		//drawing out substring for longitude
		int start5 = finish4 + 6;
		String newString4 = newString3.substring(start5).trim();
		int finish5 = newString4.indexOf(';');
		String longitude = newString4.substring(0, finish5).trim();
		System.out.println("Longitude:\t\t" + longitude);
	
		
		
	}
	
	
	
	
	
}
