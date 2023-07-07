package bankproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bankproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     List<bank>users=new ArrayList<bank>();
     while(true)
     {
    	 System.out.println("1.to add");
    	 System.out.println("2.to show");
    	 System.out.println("3.to get details");
    	 System.out.println("4.deposit");
    	 System.out.println("5.withdrawl");
    	 System.out.println("6.delete");
    	 System.out.println("Enter the choice");
    	 int ch=sc.nextInt();
    	 if(ch==1)
    	 {
    		 bank b=new bank();
    		 System.out.println("Enter the actno");
    		 int acno=sc.nextInt();
    		 sc.nextLine();
    		 System.out.println("the name");
    		 String name=sc.nextLine();
    		 System.out.println("Enter the bal");
    		 double bal=sc.nextDouble();
    		 b.setAcNo(acno);
    		 b.setName(name);
    		 b.setBal(bal);
    		 users.add(b);
    	 }
    	 else if(ch==2)
    	 {
    		 System.out.println("showing details");
    		 for(bank i:users)
    		 {
    			 System.out.println(i.toString());
    		 }
    	 }
    	 else if(ch==3)
    	 {
    		 System.out.println("enter ac no");
    		 int ac=sc.nextInt();
    		 boolean f=false;
    		 for(bank i:users)
    		 {
    		 if(i.getAcNo()==ac)
    		 {
    		   System.out.println(i.toString());
    		  f=true;
    		 }
    		 }
    		 if(f==false)
    		 {
    			 System.out.println("notfound");
    		 }
    		 
    	 }
    	 else if(ch==4)
    	 {
    		 System.out.println("Enter the account no");
    		 int ac=sc.nextInt();
    		 boolean f=false;
    		 for(bank i:users)
    		 {
    			 if(i.getAcNo()==ac)
    			 {
    				System.out.println("current amount is"+i.getBal()); 
    				System.out.println("Enter the deposit amount"); 
    				int depositamt=sc.nextInt();
    				double balance=i.getBal()+depositamt;
    				i.setBal(balance);
    				System.out.println("your deposit amount is: "+depositamt);
    				System.out.println("your current amount is"+i.getBal());
    				f=true;
    			 }
    		 }
    			 if(f==false)
   			  {
   				  System.out.println("Enter correct act no");
   			  }
    		 
    	 }
    	 else if(ch==5)
    	 {
    	  System.out.println("Enter the account number");
    	  int ac=sc.nextInt();
    	  boolean f=false;
    	  for(bank i:users)
    	  {
    		  if(i.getAcNo()==ac)
    		  {
    			  f=true;
    			  System.out.println("current amount is"+i.getBal()); 
    			  System.out.println("Entet the withdraw amount");
    			  int withdraw=sc.nextInt();
    			  
    			  if(i.getBal()>withdraw)
    			  {
    			  double balance=i.getBal()-withdraw;
    			   i.setBal(balance);
    			   System.out.println("your withdraw amount is: "+withdraw);
    			   System.out.println("your current amount is: "+i.getBal());
    			  System.out.println(i.toString());
    			  
    			  } 
    			  else
    			  {
    				 System.out.println("insufficient amount"); 
    			  }
    			 
    		  }
    	  }
    		  if(f==false)
    		  {
    			  System.out.println("Enter correct actno");
    		  }
    	  
    	 }
    	 else if(ch==6)
    	 {
    		 System.out.println("Enter the account number");
       	  	 int ac=sc.nextInt();
       	  	  boolean f=false;
	       	  for(bank user:users)
	       	  {
	       		  if(user.getAcNo()==ac)
	       		  {
		       		   users.remove(user);
		       		   f=true;
	       		  }
	       		}
	       	  if(f==false)
	       	  {
	       		  System.out.println("not deleted");
	       	  }
       	 
    	 }
    	 
     }
	}
}	


