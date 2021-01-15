package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Test{
	static boolean continueLooping = true;
	static int getMoreCustomers = 1;
    public static void main(String []args) throws IOException{
    	InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);    
    	Queue<Customer> customers = new LinkedList<Customer>();
 
    	while(continueLooping) {
    		System.out.println("Enter new customer:");
        	System.out.println("Enter customer name:");
        	String name = br.readLine();
        	System.out.println("Enter customer age:");
        	int age = Integer.parseInt(br.readLine());
        	
        	customers.add(new Customer(name,age));
        	
        	System.out.println("Do you want to add more customer?\n"
        			+ "Press 1 to add more \n"
        			+ "Press 2 to cancel");
        	
        	getMoreCustomers = Integer.parseInt(br.readLine());
        	
        	if(getMoreCustomers==2) {
        		break;
        	}
    	}
    	
    	
    	
      
    	for(Customer c : customers) {
    		System.out.println(c.name);
    	}
    	
    	customers.remove();
      	for(Customer c : customers) {
    		System.out.println(c.name);
    	}
    }
}