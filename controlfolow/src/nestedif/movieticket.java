package nestedif;
import java.util.*;

public class movieticket {
	public static void main(String []args) {
		
		
		System.out.println("wlecome to online movie ticket booking app");
		System.out.println("\n 1.Chava");
		System.out.println(" 2. Sikandar");
		System.out.println(" 3.saiyyara");
		System.out.println(" 4.natsmarth");
		System.out.println(" 5.sairath");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n choice the number ");
		int chioce= sc.nextInt();
		int ticketprice=250;
		double amount;
		
		
		
		if(chioce==1) 
		{		
			System.out.println("Please enter number of ticket for Chavva movie");
			int ticket=sc.nextInt();
			 int totalprice=ticketprice*ticket;
			 System.out.println("total amount of ticket  ::"+totalprice);
			 
			 if(ticket>=10)
			 {
				 System.out.println("you gte 10% dicount  ::");
				  amount= totalprice*0.10;
				 
				 totalprice-=amount;
				 System.out.println("after gating discount total money to pay:: "+totalprice);
				
				 
			 }
			
			
			System.out.println("\nPlease select the time slot  9,12,6");
			long time=sc.nextLong(); 
			
			if(time==9||time==12||time==6) //check time slot is avilble or not
			{
				
				System.out.println("your ticket are booked and time slot is  ::"+time);
				
			}
			else {
				System.out.println("time slot is not avilable");
			}
			
			
		
			
		}
		if(chioce==2) 
		{		
			System.out.println("Please enter number of ticket for sikandar movie");
			int ticket=sc.nextInt();
			 int totalprice=ticketprice*ticket;
			 System.out.println("total amount of ticket  ::"+totalprice);
			 
			 if(ticket>=10)
			 {
				 System.out.println("you gte 10% dicount  ::");
				  amount= totalprice*0.10;
				 
				 totalprice-=amount;
				 System.out.println("after gating discount total money to pay:: "+totalprice);
				
				 
			 }
			
			
			System.out.println("\nPlease select the time slot 9,12,6");
			long time=sc.nextLong(); 
			
			if(time==9||time==12||time==6) //check time slot is avilble or not
			{
				
				System.out.println("your ticket is booked and time slot is  ::"+time);
				
				
			}
			else {
				System.out.println("time slot is not avilable");
			}
			
			
		
			
		}
		if(chioce==3)
			
		{
			System.out.println("Please enter number of ticket for sikandar movie");
			int ticket=sc.nextInt();
			
			
			
		}
		  
		
		
		
		
	}

}
