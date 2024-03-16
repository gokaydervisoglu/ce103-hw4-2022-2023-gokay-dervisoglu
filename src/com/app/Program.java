package com.app;

import java.io.IOException;
import java.util.Scanner;

import com.JavaLib.CustomerFeature;
import com.JavaLib.FileOperations;
import com.JavaLib.MainFunctions;
import com.JavaLib.MedicineFeature;
import com.JavaLib.SupplierFeature;

//import java.io.File;

public class Program {

	public static int ID;
	public static String ID_Control;
	
	public static String Name;
	public static String City;
	
	public static int Contact_No;
	public static String Contact_No_C;
	
	public static String Email_ID;
	
	public static int Rack;
	public static String Rack_C;
	
	public static int Cabnit;
	public static String Cabnit_C;
	
	public static String Company;
	public static String Medicine;
	
	public static int Unit_Cost;
	public static String Unit_Cost_C;
	
	public static int Sale_Cost;
	public static String Sale_Cost_C;
	
	public static int Quantity;
	public static String Quantity_C;
	
	public static String Mgf_Date;
	public static String Exp_Date;
	
	/*
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.out.println("Hello");
	}
	*/
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
				while (true) 
				{
				// This function make print medical menu
					  System.out.print
						("|===============================================================================|\r\n"
						+ "|										|\r\n"	
						+ "|  	Supplier Info  Customer Info  Medicine  RReport  Bill  About  Exit	|\r\n"
						+ "|										|\r\n"	
						+ "|===============================================================================|\r\n"
						+ "|										|\r\n"
						+ "|  			   Welcome To Medical Store			        |\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|===============================================================================|\r\n");
						
				System.out.print("\t\t    Press First Character for further Menu =");
				////			  
				Scanner scanner2 = new Scanner(System.in);
				String furthermenu = scanner2.nextLine();
				
				// This function gets data from user 
				
				  if (furthermenu.equals("")) 
				  {
					  for (int i = 0; i < 4; i++)
					{
					System.out.print("\n");
					}
					  System.out.println("Plese Enter right character ONLY (S,C,M,R,B,A).");
				
				    continue;
				  }
				// This function leaves spaces between lines
				  
				  switch(furthermenu) 
				  {
				  
				  //
				  //SUPPLIER FUNCTION
				  //
			  
			    case "S":
			    case "s":
			    				
				for (int i = 0; i < 4; i++) 
				{
				System.out.print("\n");
				}
				System.out.print
				
				( "				---------------					\r\n"
				+ "		           	 Supplier MENU					\r\n"
				+ "				---------------					\r\n"	
				+ "|===============================================================================|\r\n"
				+ "|  				Add New Supplier				|\r\n"
				+ "|										|\r\n"
				+ "|				Update Supplier					|\r\n"
				+ "|										|\r\n"
				+ "|				Search Supplier					|\r\n"
				+ "|										|\r\n"
				+ "|				List of Existing Supplier			|\r\n"
				+ "|										|\r\n"
				+ "|				Main Menu					|\r\n"
				+ "|										|\r\n"
				+ "|										|\r\n"
				+ "|										|\r\n"
				+ "|										|\r\n"
				+ "|										|\r\n"
				+ "|										|\r\n"
				+ "|										|\r\n"
				+ "|===============================================================================|\r\n");
				
				
				System.out.print("\t\t    Press First Character for further Menu =");
							  
				Scanner scanner3 = new Scanner(System.in);
				String menu = scanner3.nextLine();
				
				// This function gets data from user

				if (menu.equals("")) 
				{
				  for (int i = 0; i < 4; i++)
				{
				System.out.print("\n");
				}
				  
				System.out.println("Plese Enter right character ONLY (A,U,S,L,M).");
				// This function leaves spaces between lines
				
			    continue;
				}
				
				switch(menu) 
				{

			    case "A":
			    case "a":
			    				
				for (int i = 0; i < 4; i++) //boşluk bırakır
				{
				System.out.print("\n");
				}


			    System.out.println("|===============================================================================|");
			    System.out.println("|										|");
			    System.out.println("|			|================================|       		|");
			    System.out.println("|		    	|        SUPPLIER ENTRY	         |		        |");
			    System.out.println("|			|================================|       		|");
			    System.out.println("|										|");
			    System.out.println("|										|");
			    System.out.println("|===============================================================================|");
			    
				System.out.print("|  SUPPLIER ID  :");
			    ID_Control = new Scanner(System.in).nextLine();
				ID = Integer.parseInt(ID_Control);
			    
			    System.out.print("|  SUPPLIER NAME:"); //title
			    Name = new Scanner(System.in).nextLine();
			    
			    System.out.print("|  CITY		:"); //
			    City = new Scanner(System.in).nextLine();
			    
			    System.out.print("|  CONTACT NO   :");
			    Contact_No_C = new Scanner(System.in).nextLine();
			    Contact_No = Integer.parseInt(Contact_No_C);
			        
			    System.out.print("|  EMAIL ID     :");
			    Email_ID = new Scanner(System.in).nextLine();
			  
				MainFunctions f = new MainFunctions();
			    f.AddSupplier(ID, Name, City, Contact_No, Email_ID,"supplier.dat");
			    
			    
				System.out.println("Supplier No:" + ID);
			
				System.out.println("Supplier Name:" + Name);
			
				System.out.println("Supplier City:" + City);

				System.out.println("Contact No:" + Contact_No);
			
				System.out.println("Supplier Email ID:" + Email_ID);
			    
			    System.out.println("|===============================================================================|");
			    
				System.out.print("\t\t    Press First Character for further Menu =");
				//			  
				Scanner scanner4 = new Scanner(System.in); 
				String menu2 = scanner4.nextLine();

				continue;
				
				//
				//UPDATE
				//
				
			    case "U":
			    case "u":
			    	
		    	//String.valueOf((new Scanner(System.in).nextLine()));
			    
			    System.out.println("|===============================================================================|");
			    System.out.println("|										|");
			    System.out.println("|			|================================|       		|");
			    System.out.println("|		    	|        SUPPLIER UPDATE	         |		        |");
			    System.out.println("|			|================================|       		|");
			    System.out.println("|										|");
			    System.out.println("|										|");
			    System.out.println("|										|");
			    
			    //// UPDATE DELETE
			    
			 
      		
			    System.out.print("|  Supplier ID:");
              Scanner scanner = new Scanner(System.in);
				int supplierUptadeId = scanner.nextInt();
				
      		try {
      			
              	for(int c =1 ; c<5 ;c++) 
          		{
              		
              		
              		byte[] supplierWrittenBytes = FileOperations.readBlock(c, SupplierFeature.Supplier_DATA_BLOCK_SIZE, "supplier.dat");
      				SupplierFeature supplierWrittenObject = SupplierFeature.ByteArrayBlockToSupplier(supplierWrittenBytes);
      			
          			
          			if(supplierUptadeId==supplierWrittenObject.getId()) {
  					
  					
          			System.out.println(" Supplier Num: " + supplierWrittenObject.getcontact_no());
      				System.out.println(" Supplier Name: " + supplierWrittenObject.getname_s());
      				System.out.println(" Suppliers City: " + supplierWrittenObject.getcity());
      				System.out.println(" Supplier Mail: " + supplierWrittenObject.getemail());
      				
      				MainFunctions a = new MainFunctions();
      				
      				if(c==1)
						{
							FileOperations.deleteBlock2(SupplierFeature.Supplier_DATA_BLOCK_SIZE, 0,"supplier.dat");
							
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
							
		                	System.out.print("|  Supplier ID:");
		                	ID = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	Name =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	Contact_No = (int) scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	City =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	Email_ID =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(ID);
		        			supplier.setcontact_no(Contact_No);
		        			supplier.setname_s(Name);
		        			supplier.setcity(City);
		        			supplier.setemail(Email_ID);
		        			

		        			byte[] supplierBytes = SupplierFeature.SupplierToByteArrayBlock(supplier);
		        			FileOperations.updateBlock(supplierBytes,0, SupplierFeature.Supplier_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	
		        		
							
							
							break;
							
						}
						if (c == 2)
						{
							FileOperations.deleteBlock2(SupplierFeature.Supplier_DATA_BLOCK_SIZE, 174,"supplier.dat");
							
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
							
		                	System.out.print("|  Supplier ID:");
		                	ID = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	Name =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	Contact_No = (int) scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	City =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	Email_ID =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(ID);
		        			supplier.setcontact_no(Contact_No);
		        			supplier.setname_s(Name);
		        			supplier.setcity(City);
		        			supplier.setemail(Email_ID);
		        			

		        			byte[] supplierBytes = SupplierFeature.SupplierToByteArrayBlock(supplier);
		        			
		        			FileOperations.updateBlock(supplierBytes,174, SupplierFeature.Supplier_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	
		        		
							
							
							break;
						}
						if (c == 3)
						{
							FileOperations.deleteBlock2(SupplierFeature.Supplier_DATA_BLOCK_SIZE, 348,"supplier.dat");
							
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
							
		                	System.out.print("|  Supplier ID:");
		                	ID = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	Name =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	Contact_No = (int) scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	City =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	Email_ID =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(ID);
		        			supplier.setcontact_no(Contact_No);
		        			supplier.setname_s(Name);
		        			supplier.setcity(City);
		        			supplier.setemail(Email_ID);
		        			

		        			byte[] supplierBytes = SupplierFeature.SupplierToByteArrayBlock(supplier);
		        			
		        			FileOperations.updateBlock(supplierBytes,348, SupplierFeature.Supplier_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	
		        		
							
							
							break;
						}
						if (c == 4)
						{
							FileOperations.deleteBlock2(SupplierFeature.Supplier_DATA_BLOCK_SIZE, 522,"supplier.dat");
							
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
							
		                	System.out.print("|  Supplier ID:");
		                	ID = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	Name =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	Contact_No = (int) scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	City =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	Email_ID =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(ID);
		        			supplier.setcontact_no(Contact_No);
		        			supplier.setname_s(Name);
		        			supplier.setcity(City);
		        			supplier.setemail(Email_ID);
		        			

		        			byte[] supplierBytes = SupplierFeature.SupplierToByteArrayBlock(supplier);
		        			
		        			FileOperations.updateBlock(supplierBytes,522, SupplierFeature.Supplier_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	
		        		
							
							
							break;
						}
						if (c == 5)
							
						{
							FileOperations.deleteBlock2(SupplierFeature.Supplier_DATA_BLOCK_SIZE, 696,"supplier.dat");
							
							for(int i=0;i<=1;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
							
		                	System.out.print("|  Supplier ID:");
		                	ID = scanner.nextInt();
		                	System.out.println("|                                                                                             |");
		                	
		                	System.out.print("|  Supplier Name:");
		        	    	Name =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		  
		                	System.out.print("|  Contact Number:");
		                	Contact_No = (int) scanner.nextLong();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  City Name:");
		        	    	City =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    	
		        	    	System.out.print("|  Email:");
		        	    	Email_ID =scanner.next();
		        	    	System.out.println("|                                                                                             |");
		        	    		
		        	    	SupplierFeature supplier = new SupplierFeature();

		        			supplier.setId(ID);
		        			supplier.setcontact_no(Contact_No);
		        			supplier.setname_s(Name);
		        			supplier.setcity(City);
		        			supplier.setemail(Email_ID);
		        			

		        			byte[] supplierBytes = SupplierFeature.SupplierToByteArrayBlock(supplier);
		        			
		        			FileOperations.updateBlock(supplierBytes,696, SupplierFeature.Supplier_DATA_BLOCK_SIZE ,"supplier.dat");
		        			
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		                	System.out.println("|                              Supplier Updated Successfully                                  |");
		                	
		        		
							
							
							break;
          		}
          	}
      	}
      		}
      		
      		catch(NullPointerException e)
      		{
      			
      		}
			    
			    
							
				
		    	//
				//LIST
				//
			    	
			    	
			    	
			    	
			    case "L":
			    case "l":
			    				
				for (int i = 0; i < 4; i++) //boşluk bırakır
				{
				System.out.print("\n");
				}
				
				System.out.print
				("|===============================================================================|\r\n"
				+ "|										|\r\n"
				+ "|			|================================|       		|\r\n"
				+ "|		    	|        SUPPLIER LIST	         |		        |\r\n"
				+ "|			|================================|       		|\r\n"
				+ "|										|\r\n"
				+ "|	ID.  SUPPLIER NAME.      PH.NO.     CITY.         EMAIL			|\r\n"	
				+ "|===============================================================================|\r\n"
				+ "|  										|\r\n");
		
				//Codes.menu.Sup_List(); //menu yapıştırır
				
				try 
				{	
				for(int c =1 ; c<5 ;c++)
				{
				SupplierFeature book1 = new SupplierFeature();
				
				book1.setId(ID);
				book1.setname_s(Name);
				book1.setcity(City);
				book1.setcontact_no(Contact_No);
				book1.setemail(Email_ID);

				byte[] MedicineWrittenBytes = FileOperations.readBlock(c, SupplierFeature.Supplier_DATA_BLOCK_SIZE, "supplier.dat");
				SupplierFeature MedicineWrittenObject = SupplierFeature.ByteArrayBlockToSupplier(MedicineWrittenBytes); 
				
				MedicineWrittenObject.getId();
				
				System.out.print
				 ("|\t" + MedicineWrittenObject.getId()
				 
				 + "   ||"
						
				 + "\t  " + MedicineWrittenObject.getname_s()
				 
				 + "   ||"
				 
				 + "\t  " + MedicineWrittenObject.getcontact_no()
				 
				 + "   ||"
				
				 + "\t  " + MedicineWrittenObject.getcity()
				 
				 + "   ||"
				
				 + "\t  " + MedicineWrittenObject.getemail()
				 
				 + ("\n")
				
				 + "|===============================================================================|\r\n");
				}
				}
				
				catch(NullPointerException e)
				{
					continue;			
				}
				
			
				
				System.out.print("\t\t    Press First Character for further Menu =");
				////			  
				String menu3 = new Scanner(System.in).nextLine();
				
				
				
				continue;
				
				
				///
				///SEARCH
				///
				
				
				
				
				
			    case "S":
			    case "s":
			    	
		    	for (int i = 0; i < 10; i++) //boşluk bırakır
				{
				System.out.print("\n");
				}
				
			    //Scanner input = new Scanner(System.in);
			    
			    
			    System.out.println("|===============================================================================|");
			    System.out.println("|										|");
			    System.out.println("|			|================================|       		|");
			    System.out.println("|		    	|        SUPPLIER SEARCH	         |		        |");
			    System.out.println("|			|================================|       		|");
			    System.out.println("|										|");
			    System.out.println("|										|");
			    System.out.println("|										|");
			    
			    
			    
			    System.out.println("Search by ID number\n" +"Search by Name :" );
			    System.out.println("Press First charecter for the operation :");
				Scanner scanner52 = new Scanner(System.in);
				String menu6 = scanner52.next();
			    
			    
			    switch(menu6) // search ids
				{
			    
			    case "I":
			    case "i":
			    
		    	for (int i = 0; i < 1; i++) //boşluk bırakır
				{
				System.out.print("\n");
				}
		    	
		    	
				
			    System.out.print("Enter The Id =");   //search id yeri
			    
				Scanner scanner51 = new Scanner(System.in);
				int searchId = scanner51.nextInt();
			    
				
					try {
			    
			    for (int c = 1; c < 4; c++)
			{
			    byte[] MedicineWrittenBytes = FileOperations.readBlock(c, SupplierFeature.Supplier_DATA_BLOCK_SIZE, "supplier.dat");
			    SupplierFeature MedicineWrittenObject = SupplierFeature.ByteArrayBlockToSupplier(MedicineWrittenBytes);
				
				
				MedicineWrittenObject.getId();
				
				if (MedicineWrittenObject.getId() == searchId)
				{

					System.out.println("|Supplier ID:" + MedicineWrittenObject.getId());
					
					System.out.println("|Supplier Name:" + MedicineWrittenObject.getname_s());
					
					System.out.println("|Suppliers City:" + MedicineWrittenObject.getcity());
				
					System.out.println("|Supplier Num:" + MedicineWrittenObject.getcontact_no());
				
					System.out.println("|Supplier Mail:" + MedicineWrittenObject.getemail());
					
					System.out.print("\t\t\t\t|\r\n");
					
					System.out.print("|===============================================================================|\r\n");

				}
			
				
			}
			    	}
				
				catch(NullPointerException e)
				{
					break;			
				}
					
			    case "N":
			    case "n":
			    	
			    	System.out.print("Please Enter Name:");
			    	
					Scanner scanner89 = new Scanner(System.in);
					String searchname = scanner89.next();
					
					//String searchname = new Scanner(System.in).nextLine();
					
					try {
						
					for (int c = 1; c < 4; c++)
				{
						
					byte[] MedicineWrittenBytes = FileOperations.readBlock(c, SupplierFeature.Supplier_DATA_BLOCK_SIZE, "supplier.dat");
					SupplierFeature MedicineWrittenObject = SupplierFeature.ByteArrayBlockToSupplier(MedicineWrittenBytes);
					
					
					//searchname searchname2 = new searchname.int
					
						
					if (searchname.equals(MedicineWrittenObject.getname_s()))
                  {
						
					System.out.println("|Supplier ID:" + MedicineWrittenObject.getId());
					
					System.out.println("|Supplier Name:" + MedicineWrittenObject.getname_s());
					
					System.out.println("|Suppliers City:" + MedicineWrittenObject.getcity());
					
					System.out.println("|Supplier Num:" + MedicineWrittenObject.getcontact_no());
					
					System.out.println("|Supplier Mail:" + MedicineWrittenObject.getemail());
					
					}
					
					
				}
					
					}
					catch(NullPointerException e)
					{
						
						System.out.println("Name not found");
						Thread.sleep(1750);
					}
					
					}// search id switch case
			    
			    
			    	continue;
				  
			    
			  		//break;
			    
			    	//
			    	//CUSTOMER
			    	//
			    	//
			    
			    
			  		
					} // menu switch case 
				
					case "C":
					case "c":
						
						for (int i = 0; i < 4; i++) //boşluk bırakır
						{
						System.out.print("\n");
						}
						
						//System.out.print(menu2);
						//Codes.menu.menu2(); //menu yapıştırır
						
						System.out.print
						
						( "				---------------					\r\n"
						+ "		           	 Customer MENU					\r\n"
						+ "				---------------					\r\n"	
						+ "|===============================================================================|\r\n"
						+ "|  				Add New Customer				|\r\n"
						+ "|										|\r\n"
						+ "|				Update Customer					|\r\n"
						+ "|										|\r\n"
						+ "|				Search Customer					|\r\n"
						+ "|										|\r\n"
						+ "|				List of Existing Customer			|\r\n"
						+ "|										|\r\n"
						+ "|				Main Menu					|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|===============================================================================|\r\n");
						
						
						System.out.print("\t\t    Press First Character for further Menu =");
						////			  
						
						String menu1 = new Scanner(System.in).next();

						if (menu1.equals("")) 
						{
						  for (int i = 0; i < 4; i++)
						{
						System.out.print("\n");
						
						System.out.println("Plese Enter right character ONLY (A,U,S,C,M).");
						}
						  
						continue;
						}
						
						
						
						switch(menu1) 
						{
						
						//
						//ADD
						//
						

					    case "A":
					    case "a":
					    				
						for (int i = 0; i < 4; i++) //boşluk bırakır
						{
						System.out.print("\n");
						}
						
					    //Scanner input = new Scanner(System.in);
					    //String.valueOf((new Scanner(System.in).nextLine()));

					    System.out.println("|===============================================================================|");
					    System.out.println("|										|");
					    System.out.println("|			|================================|       		|");
					    System.out.println("|		    	|        CUSTOMER ENTRY	         |		        |");
					    System.out.println("|			|================================|       		|");
					    System.out.println("|										|");
					    System.out.println("|										|");
					    System.out.println("|===============================================================================|");
					    
					    
					    
					    
					    CustomerFeature book3 = new CustomerFeature();
				
						System.out.print("|  CUSTOMER ID  :");
					    ID_Control = new Scanner(System.in).nextLine();
						ID = Integer.parseInt(ID_Control);
					    
					    System.out.print("|  CUSTOMER NAME:"); //title
					    Name = new Scanner(System.in).nextLine();
					    
					    System.out.print("|  CITY		:"); //
					    City = new Scanner(System.in).nextLine();
					     
					    System.out.print("|  CONTACT NO   :");
					    Contact_No_C = new Scanner(System.in).nextLine();
					    Contact_No = Integer.parseInt(Contact_No_C);
					    
					    System.out.print("|  EMAIL ID     :");
					    Email_ID = new Scanner(System.in).nextLine();
					    //
						book3.setId(ID);
						book3.setname_s(Name);
						book3.setcity(City);
						book3.setcontact_no(Contact_No);
						book3.setemail(Email_ID);
						
						byte[] bookBytes1 = CustomerFeature.CustomerToByteArrayBlock(book3); 
						FileOperations.appendBlock(bookBytes1, "customer.dat");
					    
					     
						

						System.out.println("Customer No:" + ID);
					
						System.out.println("Customer Name:" + Name);
					
						System.out.println("Customer City:" + City);

						System.out.println("Contact No:" + Contact_No);
					
						System.out.println("Customer Email ID:" + Email_ID);
					    
					    
					    
					    
					    System.out.println("|===============================================================================|");
					    
					    //mainscreen abcd = new mainscreen();
					    //abcd.AddBook(ID, Name, City, Contact_No, Email_ID,"../supplier.dat");
						
						System.out.print("\t\t    Press First Character for further Menu =");
						//			  
						Scanner scanner4 = new Scanner(System.in); // tekrar menu icin numara ister
						String menu2 = scanner4.nextLine();
						
						
						
						continue;
						
						//
						//UPDATE
						//
						
						
					    case "U":
					    case "u":
					    	
				    	//String.valueOf((new Scanner(System.in).nextLine()));
					    
					    System.out.println("|===============================================================================|");
					    System.out.println("|										|");
					    System.out.println("|			|================================|       		|");
					    System.out.println("|		    	|        CUSTOMER UPDATE	         |		        |");
					    System.out.println("|			|================================|       		|");
					    System.out.println("|										|");
					    System.out.println("|										|");
					    System.out.println("|										|");
					    
					    	
					    System.out.print("|  Supplier ID:");
		                Scanner scanner = new Scanner(System.in);
						int customerUptadeId = scanner.nextInt();
						
		        		try {
		        			
		        			//System.out.print("|  Supplier ID:");
			            	//supplierUptadeId = scanner.nextInt();
		        		
		                	for(int c =1 ; c<5 ;c++) 
		            		{
		                		
		                		
		                		byte[] CustomerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
		                		CustomerFeature customerWrittenObject = CustomerFeature.ByteArrayBlockToCustomer(CustomerWrittenBytes);
		        			
		            			
		            			if(customerUptadeId==customerWrittenObject.getId()) {
		    					
		    					
		            			System.out.println(" Customer Num: " + customerWrittenObject.getcontact_no());
		        				System.out.println(" Customer Name: " + customerWrittenObject.getname_s());
		        				System.out.println(" Customer City: " + customerWrittenObject.getcity());
		        				System.out.println(" Customer Mail: " + customerWrittenObject.getemail());
		        				
		        				MainFunctions a = new MainFunctions();
		        				
		        				if(c==1)
								{
									FileOperations.deleteBlock2(CustomerFeature.Customer_DATA_BLOCK_SIZE, 0,"customer.dat");
									
									for(int i=0;i<=1;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
									
				                	System.out.print("|  Customer ID:");
				                	ID = scanner.nextInt();
				                	System.out.println("|                                                                                             |");
				                	
				                	System.out.print("|  Customer Name:");
				        	    	Name =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				  
				                	System.out.print("|  Contact Number:");
				                	Contact_No = (int) scanner.nextLong();
				        	    	System.out.println("|                                                                                             |");
				        	    	
				        	    	System.out.print("|  City Name:");
				        	    	City =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    	
				        	    	System.out.print("|  Email:");
				        	    	Email_ID =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    		
				        	    	CustomerFeature customer = new CustomerFeature();

				        	    	customer.setId(ID);
				        	    	customer.setcontact_no(Contact_No);
				        	    	customer.setname_s(Name);
				        	    	customer.setcity(City);
				        	    	customer.setemail(Email_ID);
				        			

				        			byte[] customerBytes = CustomerFeature.CustomerToByteArrayBlock(customer);
				        			FileOperations.updateBlock(customerBytes,0, CustomerFeature.Customer_DATA_BLOCK_SIZE ,"customer.dat");
				        			
				        			
				    	    		for(int i=0;i<=2;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
				    	    		
				                	System.out.println("|                              Customer Updated Successfully                                  |");
				                	
				        		
									
									
									break;
									
								}
								if (c == 2)
								{
									FileOperations.deleteBlock2(CustomerFeature.Customer_DATA_BLOCK_SIZE, 174,"customer.dat");
									
									for(int i=0;i<=1;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
									
				                	System.out.print("|  Customer ID:");
				                	ID = scanner.nextInt();
				                	System.out.println("|                                                                                             |");
				                	
				                	System.out.print("|  Customer Name:");
				        	    	Name =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				  
				                	System.out.print("|  Contact Number:");
				                	Contact_No = (int) scanner.nextLong();
				        	    	System.out.println("|                                                                                             |");
				        	    	
				        	    	System.out.print("|  City Name:");
				        	    	City =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    	
				        	    	System.out.print("|  Email:");
				        	    	Email_ID =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    		
				        	    	CustomerFeature customer = new CustomerFeature();

				        	    	customer.setId(ID);
				        	    	customer.setcontact_no(Contact_No);
				        	    	customer.setname_s(Name);
				        	    	customer.setcity(City);
				        	    	customer.setemail(Email_ID);
				        			

				        			byte[] customerBytes = CustomerFeature.CustomerToByteArrayBlock(customer);
				        			FileOperations.updateBlock(customerBytes,174, CustomerFeature.Customer_DATA_BLOCK_SIZE ,"customer.dat");
				        			
				        			
				    	    		for(int i=0;i<=2;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
				    	    		
				                	System.out.println("|                              Customer Updated Successfully                                  |");
				                	
				        		
									
									
									break;
								}
								if (c == 3)
								{
									FileOperations.deleteBlock2(CustomerFeature.Customer_DATA_BLOCK_SIZE, 348,"customer.dat");
									
									for(int i=0;i<=1;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
									
				                	System.out.print("|  Customer ID:");
				                	ID = scanner.nextInt();
				                	System.out.println("|                                                                                             |");
				                	
				                	System.out.print("|  Customer Name:");
				        	    	Name =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				  
				                	System.out.print("|  Contact Number:");
				                	Contact_No = (int) scanner.nextLong();
				        	    	System.out.println("|                                                                                             |");
				        	    	 
				        	    	System.out.print("|  City Name:");
				        	    	City =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    	
				        	    	System.out.print("|  Email:");
				        	    	Email_ID =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    		
				        	    	CustomerFeature customer = new CustomerFeature();

				        	    	customer.setId(ID);
				        	    	customer.setcontact_no(Contact_No);
				        	    	customer.setname_s(Name);
				        	    	customer.setcity(City);
				        	    	customer.setemail(Email_ID);
				        			

				        			byte[] customerBytes = CustomerFeature.CustomerToByteArrayBlock(customer);
				        			FileOperations.updateBlock(customerBytes,348, CustomerFeature.Customer_DATA_BLOCK_SIZE ,"customer.dat");
				        			
				        			
				    	    		for(int i=0;i<=2;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
				    	    		
				                	System.out.println("|                              Customer Updated Successfully                                  |");
				                	
				        		
									
									
									break;
								}
								if (c == 4)
								{
	FileOperations.deleteBlock2(CustomerFeature.Customer_DATA_BLOCK_SIZE, 522,"customer.dat");
									
									for(int i=0;i<=1;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
									
				                	System.out.print("|  Customer ID:");
				                	ID = scanner.nextInt();
				                	System.out.println("|                                                                                             |");
				                	
				                	System.out.print("|  Customer Name:");
				        	    	Name =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				  
				                	System.out.print("|  Contact Number:");
				                	Contact_No = (int) scanner.nextLong();
				        	    	System.out.println("|                                                                                             |");
				        	    	
				        	    	System.out.print("|  City Name:");
				        	    	City =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    	
				        	    	System.out.print("|  Email:");
				        	    	Email_ID =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    		
				        	    	CustomerFeature customer = new CustomerFeature();

				        	    	customer.setId(ID);
				        	    	customer.setcontact_no(Contact_No);
				        	    	customer.setname_s(Name);
				        	    	customer.setcity(City);
				        	    	customer.setemail(Email_ID);
				        			

				        			byte[] customerBytes = CustomerFeature.CustomerToByteArrayBlock(customer);
				        			FileOperations.updateBlock(customerBytes,522, CustomerFeature.Customer_DATA_BLOCK_SIZE ,"customer.dat");
				        			
				        			
				    	    		for(int i=0;i<=2;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
				    	    		
				                	System.out.println("|                              Customer Updated Successfully                                  |");
				                	
				        		
									
									
									break;
								}
								if (c == 5)
									
								{
									FileOperations.deleteBlock2(CustomerFeature.Customer_DATA_BLOCK_SIZE, 696,"customer.dat");
									
									for(int i=0;i<=1;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
									
				                	System.out.print("|  Customer ID:");
				                	ID = scanner.nextInt();
				                	System.out.println("|                                                                                             |");
				                	
				                	System.out.print("|  Customer Name:");
				        	    	Name =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				  
				                	System.out.print("|  Contact Number:");
				                	Contact_No = (int) scanner.nextLong();
				        	    	System.out.println("|                                                                                             |");
				        	    	
				        	    	System.out.print("|  City Name:");
				        	    	City =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    	
				        	    	System.out.print("|  Email:");
				        	    	Email_ID =scanner.next();
				        	    	System.out.println("|                                                                                             |");
				        	    		
				        	    	CustomerFeature customer = new CustomerFeature();

				        	    	customer.setId(ID);
				        	    	customer.setcontact_no(Contact_No);
				        	    	customer.setname_s(Name);
				        	    	customer.setcity(City);
				        	    	customer.setemail(Email_ID);
				        			

				        			byte[] customerBytes = CustomerFeature.CustomerToByteArrayBlock(customer);
				        			FileOperations.updateBlock(customerBytes,696, CustomerFeature.Customer_DATA_BLOCK_SIZE ,"customer.dat");
				        			
				        			
				    	    		for(int i=0;i<=2;i++) {
				                		System.out.println("|                                                                                             |");
				                	}
				    	    		
				                	System.out.println("|                             -Customer Updated Successfully-                                  |");
				                	
				        		
									
									
									break;
		            		}
		            	}
		        	}
		        		}
		        		
		        		catch(NullPointerException e)
		        		{
		        			
		        		}
					    
						continue;				
						
				    	//
						//LIST
						//
					    	
					    	
					    	
					    	
					    case "L":
					    case "l":
					    				
						for (int i = 0; i < 4; i++) //boşluk bırakır
						{
						System.out.print("\n");
						}
						
						System.out.print
						("|===============================================================================|\r\n"
						+ "|										|\r\n"
						+ "|			|================================|       		|\r\n"
						+ "|		    	|        CUSTOMER LIST	         |		        |\r\n"
						+ "|			|================================|       		|\r\n"
						+ "|										|\r\n"
						+ "|	ID.  CUSTOMER NAME.      PH.NO.     CITY.         EMAIL			|\r\n"	
						+ "|===============================================================================|\r\n"
						+ "|  										|\r\n");
				
						//Codes.menu.Sup_List(); //menu yapıştırır
						
						try 
						{	
						for(int c =1 ; c<5 ;c++)
						{
						CustomerFeature book1 = new CustomerFeature();
						

						book1.setId(ID);
						book1.setname_s(Name);
						book1.setcity(City);
						book1.setcontact_no(Contact_No);
						book1.setemail(Email_ID);

						byte[] MedicineWrittenBytes = FileOperations.readBlock(c, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
						CustomerFeature MedicineWrittenObject = CustomerFeature.ByteArrayBlockToCustomer(MedicineWrittenBytes); 
						
						MedicineWrittenObject.getId();
						
						System.out.print
							("|\t" + MedicineWrittenObject.getId()
						 
						 + "   ||"
								
						 + "\t  " + MedicineWrittenObject.getname_s()
						 
						 + "   ||"
						 
						 + "\t  " + MedicineWrittenObject.getcontact_no()
						 
						 + "   ||"
						
						 + "\t  " + MedicineWrittenObject.getcity()
						 
						 + "   ||"
						
						 + "\t  " + MedicineWrittenObject.getemail()
						  
						 + ("\n")
						
						 + "|===============================================================================|\r\n");
						}
						}
						catch(NullPointerException e)
						{
							continue;			
						}
							
						System.out.print("\t\t    Press First Character for further Menu =");
						
						String menu3 = new Scanner(System.in).nextLine();
						
						if(furthermenu.equals("m"))
						{
							continue;
						}
						Thread.sleep(2000);
						
						///
						///SEARCH
						///
						
					    case "S":
					    case "s":
					    	
				    	for (int i = 0; i < 10; i++) //boşluk bırakır
						{
						System.out.print("\n");
						}
						
					    //Scanner input = new Scanner(System.in);
					    String.valueOf((new Scanner(System.in).nextLine()));
					    
					    System.out.println("|===============================================================================|");
					    System.out.println("|										|");
					    System.out.println("|			|================================|       		|");
					    System.out.println("|		    	|        CUSTOMER SEARCH	         |		        |");
					    System.out.println("|			|================================|       		|");
					    System.out.println("|										|");
					    System.out.println("|										|");
					    System.out.println("|										|");
					    
					    
					    
					    System.out.println("Search by ID number\n" +"Search by Name :" );
					    System.out.println("Press First charecter for the operation :");
						Scanner scanner52 = new Scanner(System.in);
						String menu6 = scanner52.next();
					    
					    
					    switch(menu6) // search ids
						{
					    
					    case "I":
					    case "i":
					    
				    	for (int i = 0; i < 4; i++) 
						{
						System.out.print("\n");
						}
				    	
				    	
						
					    System.out.print("Enter The Id =");   //search id 
						Scanner scanner51 = new Scanner(System.in);
						int searchId = scanner51.nextInt();
					    
						
							try {
					    
					    for (int c = 1; c < 4; c++)
					{
					    byte[] MedicineWrittenBytes = FileOperations.readBlock(c, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
					    CustomerFeature MedicineWrittenObject = CustomerFeature.ByteArrayBlockToCustomer(MedicineWrittenBytes);
						
						
						MedicineWrittenObject.getId();
						
						if (MedicineWrittenObject.getId() == searchId)
						{

							System.out.println("|Customer ID:" + MedicineWrittenObject.getId());
							
							System.out.println("|Customer Name:" + MedicineWrittenObject.getname_s());
							
							System.out.println("|Customer City:" + MedicineWrittenObject.getcity());
						
							System.out.println("|Customer Num:" + MedicineWrittenObject.getcontact_no());
						
							System.out.println("|Customer Mail:" + MedicineWrittenObject.getemail());
							
							System.out.print("\t\t\t\t|\r\n");
							
							System.out.print("|===============================================================================|\r\n");

						}
						
					}
					    	}
						
						catch(NullPointerException e) 
						{
							break;			
						}
							
					    case "N":
					    case "n":
					    	
					    	System.out.print("Please Enter Name:");
					    	
							Scanner scanner89 = new Scanner(System.in);
							String searchname = scanner89.next();
							
							try {
							for (int c = 1; c < 4; c++)
							{
								
							byte[] MedicineWrittenBytes = FileOperations.readBlock(c, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
							CustomerFeature MedicineWrittenObject = CustomerFeature.ByteArrayBlockToCustomer(MedicineWrittenBytes);
							
							MedicineWrittenObject.getname_s();
								
							if (MedicineWrittenObject.getname_s() == searchname)
		                    {
								
							System.out.println("|Customer ID:" + MedicineWrittenObject.getId());
							
							System.out.println("|Customer Name:" + MedicineWrittenObject.getname_s());
							
							System.out.println("|Customer City:" + MedicineWrittenObject.getcity());
							
							System.out.println("|Customer Num:" + MedicineWrittenObject.getcontact_no());
							
							System.out.println("|Customer Mail:" + MedicineWrittenObject.getemail());
							
							}
					    	
							}
							
							}
							catch(NullPointerException e)
							{
								
							}
							
						}// search id switch case
					    
				    	
 					    
				  		//break;
				    continue;
				    	
				    	
				    	//
				    	//Medicine
				    	//
				    	
				    	
				  		
						} // menu switch case 	
					continue;
					
					case "M":
					case "m":
					
					for (int i = 0; i < 4; i++) //boşluk bırakır
					{
					System.out.print("\n");
					}
					
					//System.out.print(menu2);
					//Codes.menu.menu2(); //menu yapıştırır
					
					System.out.print
					
					( "				---------------					\r\n"
					+ "		           	 Medicine MENU					\r\n"
					+ "				---------------					\r\n"	
					+ "|===============================================================================|\r\n"
					+ "|  				Purchase New Medicine(p)			|\r\n"
					+ "|										|\r\n"
					+ "|				Sale Medicine(a)				|\r\n"
					+ "|										|\r\n"
					+ "|				Stock of Medicine(c)	    	       		|\r\n"
					+ "|										|\r\n"
					+ "|				Search Medicine(s)		                |\r\n"
					+ "|										|\r\n"
					+ "|				Main Menu					|\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|===============================================================================|\r\n");
					
					
					System.out.print("\t\t    Press First Character for further Menu =");
					////			  

					String menu4 = new Scanner(System.in).next();
					
					if (menu4.equals("")) 
					{
					  for (int i = 0; i < 4; i++)
					{
					System.out.print("\n");
					
					System.out.println("Plese Enter right character ONLY (P,A,C,S,M).");
					}
					
				    continue;
				    
					}
					
				
					switch(menu4)
					{
					
					//
					//Purchase
					//
					
					case "P":
				    case "p":
				    				
					for (int i = 0; i < 4; i++) //boşluk bırakır
					{
					System.out.print("\n");
					}
					
					System.out.println("|===============================================================================|");
				    System.out.println("|										|");
				    System.out.println("|			|================================|       		|");
				    System.out.println("|		    	|        MEDICINE PURCHASE	         |		        |");
				    System.out.println("|			|================================|       		|");
				    System.out.println("|										|");
				    System.out.println("|										|");
				    System.out.println("|===============================================================================|");
					
				    
				    
				    MedicineFeature book3 = new MedicineFeature();
					
					System.out.print("|  MEDICINE ID  :");
				    ID_Control = new Scanner(System.in).nextLine();
					ID = Integer.parseInt(ID_Control);
				    
				    System.out.print("|  MEDICINE NAME:"); //title
				    Name = new Scanner(System.in).nextLine();
				    
				    System.out.print("|  ENTER RACK NO :"); //
				    Rack_C = new Scanner(System.in).nextLine();
					Rack = Integer.parseInt(ID_Control);
				    
				    System.out.print("|  CABNIT NO :"); //
				    Cabnit_C = new Scanner(System.in).nextLine();
					Cabnit = Integer.parseInt(ID_Control);
				    
				    System.out.print("|  COMPANY NAME   :");
				    Company = new Scanner(System.in).nextLine();
				    
				    System.out.print("|  SUPPLIER NAME  :");
				    Medicine = new Scanner(System.in).nextLine();
				    
				    System.out.print("|  UNIT COST   Rs.:");
				    Unit_Cost_C = new Scanner(System.in).nextLine();
				    Unit_Cost = Integer.parseInt(ID_Control);
				    
				    System.out.print("|  SALE COST   Rs.:");
				    Sale_Cost_C = new Scanner(System.in).nextLine();
				    Sale_Cost = Integer.parseInt(ID_Control);
				    
				    System.out.print("|  QUANTITY       :");
				    Quantity_C = new Scanner(System.in).nextLine();
				    Quantity = Integer.parseInt(ID_Control);

				    System.out.print("|  MFG.DATE(dd-mm-yyyy):");
				    Mgf_Date = new Scanner(System.in).nextLine();
				    
				    System.out.print("|  EXP.DATE(dd-mm-yyyy):");
				    Exp_Date = new Scanner(System.in).nextLine();
				    
				    
				    
				    //
					book3.setId(ID);
					book3.setname_s(Name);
					book3.setRack(Rack);
					book3.setCompany(Company);
					book3.setCabnit(Cabnit);
					book3.setMedicine(Medicine);
					book3.setUnitcost(Unit_Cost);
					book3.setSalecost(Sale_Cost);
					book3.setQuantity(Quantity);
					book3.setMgf_date(Mgf_Date);
					book3.setExp_date(Exp_Date);
	
					byte[] bookBytes1 = MedicineFeature.MedicineToByteArrayBlock(book3); 
					FileOperations.appendBlock(bookBytes1, "medicine.dat");
				    
					System.out.println("MEDICINE ID  :" + ID);
				
					System.out.println("MEDICINE NAME:" + Name);
				
					System.out.println("ENTER RACK NO :" + Rack);

					System.out.println("CABNIT NO :" + Cabnit);
				
					System.out.println("COMPANY NAME   :" + Company);
					
					System.out.println("SUPPLIER NAME :" + Medicine);
					
					System.out.println("UNIT COST   Rs.:" + Unit_Cost);
					
					System.out.println("SALE COST   Rs.:" + Sale_Cost);
					
					System.out.println("QUANTITY       :" + Quantity);
					
					System.out.println("MFG.DATE(dd-mm-yyyy):" + Mgf_Date);
					
					System.out.println("EXP.DATE(dd-mm-yyyy):" + Exp_Date);
				    
				    System.out.println("|===============================================================================|");
				    					
					System.out.print("\t\t    Press First Character for further Menu =");
					//			  
					Scanner scanner4 = new Scanner(System.in); // tekrar menu icin numara ister
					String menu2 = scanner4.nextLine();
					
					
					
					continue;
					
					
					//
					//Sale Medicine
					//
					
					
				    case "A":
				    case "a":
				    
				    	
			    	for (int i = 0; i < 4; i++) //boşluk bırakır
					{
					System.out.print("\n");
					}
					
					System.out.println("|===============================================================================|");
				    System.out.println("|										|");
				    System.out.println("|			|================================|       		|");
				    System.out.println("|		    	|        SALE MEDICINE 	         |		        |");
				    System.out.println("|			|================================|       		|");
				    System.out.println("|										|");
				    System.out.println("|										|");
				    System.out.println("|===============================================================================|");
				    
				    Scanner scanner = new Scanner(System.in);
				    
				    int medicineSaleId = 0;

	    	    	System.out.print("|  Medical ID:");
	    	    	medicineSaleId = scanner.nextInt();
	    	    	
	    	    	try {
				    for (int c = 1; c < 4; c++)
					{
				    	
				    	MedicineFeature book4 = new MedicineFeature();
						book4.setId(ID);

					    byte[] MedicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.Medicine_DATA_BLOCK_SIZE, "medicine.dat");
					    MedicineFeature MedicineWrittenObject = MedicineFeature.ByteArrayBlockToMedicine(MedicineWrittenBytes);
						int medicine_id = MedicineWrittenObject.getId();
						
						CustomerFeature book5 = new CustomerFeature();
						book5.setId(ID);
						
						byte[] CustomerWrittenBytes = FileOperations.readBlock(c, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
					    CustomerFeature CustomerWrittenObject = CustomerFeature.ByteArrayBlockToCustomer(CustomerWrittenBytes);
					    int customer_id = CustomerWrittenObject.getId();
					
  				    MainFunctions.AddSaleMedicine2(medicine_id,customer_id);
  				        				    
          			if(medicineSaleId==medicine_id) {
  					
      				if(c==1)
						{
      					FileOperations.deleteBlock2(MedicineFeature.Medicine_DATA_BLOCK_SIZE,0,"medicine.dat");
      					medicine_id = MedicineWrittenObject.getId(); 
							MedicineFeature medicine = new MedicineFeature();
						
							medicine.setId(medicineSaleId);
		        			byte[] medicineBytes = MedicineFeature.MedicineToByteArrayBlock(medicine);
		        			
		        			FileOperations.updateBlock(medicineBytes,0, MedicineFeature.Medicine_DATA_BLOCK_SIZE ,"medicine.dat");
		        			
		                	System.out.println("|                              Medicine Sale Successfully                                  |");

							break;
							
						}
						if (c == 2)
						{
							FileOperations.deleteBlock2(MedicineFeature.Medicine_DATA_BLOCK_SIZE, 174,"medicine.dat");
							medicine_id = MedicineWrittenObject.getId(); 
							
							MedicineFeature medicine = new MedicineFeature();
							medicine.setId(medicineSaleId);
								
		        			byte[] medicineBytes = MedicineFeature.MedicineToByteArrayBlock(medicine);
		        			FileOperations.updateBlock(medicineBytes,174, MedicineFeature.Medicine_DATA_BLOCK_SIZE ,"medicine.dat");
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		
		                	System.out.println("|                              Medicine Sale Successfully                                  |");

							break;
					
						}
						if (c == 3)
						{
							FileOperations.deleteBlock2(MedicineFeature.Medicine_DATA_BLOCK_SIZE, 348,"medicine.dat");
							medicine_id = MedicineWrittenObject.getId(); 
							
							MedicineFeature medicine = new MedicineFeature();
							medicine.setId(medicineSaleId);
											
		        			byte[] medicineBytes = MedicineFeature.MedicineToByteArrayBlock(medicine);
		        			FileOperations.updateBlock(medicineBytes,348, MedicineFeature.Medicine_DATA_BLOCK_SIZE ,"medicine.dat");
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		
		                	System.out.println("|                              Medicine Sale Successfully                                  |");

							break;
							
						}
						if (c == 4)
						{
							FileOperations.deleteBlock2(MedicineFeature.Medicine_DATA_BLOCK_SIZE, 522,"medicine.dat");
							medicine_id = MedicineWrittenObject.getId(); 
							
							MedicineFeature medicine = new MedicineFeature();
							medicine.setId(medicineSaleId);
									
		        			byte[] medicineBytes = MedicineFeature.MedicineToByteArrayBlock(medicine);
		        			FileOperations.updateBlock(medicineBytes,522, MedicineFeature.Medicine_DATA_BLOCK_SIZE ,"medicine.dat");
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		
		                	System.out.println("|                              Medicine Sale Successfully                                  |");

							break;
						}
						if (c == 5)	
						{
							FileOperations.deleteBlock2(MedicineFeature.Medicine_DATA_BLOCK_SIZE, 696,"medicine.dat");
							medicine_id = MedicineWrittenObject.getId(); 
							
							MedicineFeature medicine = new MedicineFeature();
							medicine.setId(medicineSaleId);
			
		        			byte[] medicineBytes = MedicineFeature.MedicineToByteArrayBlock(medicine);
		        			FileOperations.updateBlock(medicineBytes,696, MedicineFeature.Medicine_DATA_BLOCK_SIZE ,"medicine.dat");
		        			
		    	    		for(int i=0;i<=2;i++) {
		                		System.out.println("|                                                                                             |");
		                	}
		    	    		
		                	System.out.println("|                              Medicine Sale Successfully                                  |");

							break;
						}
						else
						{
							System.out.println("Not found file");
						}
          	}
      	}
				    
      		}
      		
      		catch(NullPointerException e)
      		{
      			System.out.println("File is Null");
      		}
			    
				   
				 continue;  
					//
					//Stock File Medicine
					//
					
				    case "C":
				    case "c":
				    	
			    	for (int i = 0; i < 4; i++) //boşluk bırakır
					{
					System.out.print("\n");
					}
					
					System.out.print
					("|===============================================================================|\r\n"
					+ "|										|\r\n"
					+ "|			|================================|       		|\r\n"
					+ "|		    	|        STOCK OF MEDICINE	 |		        |\r\n"
					+ "|			|================================|       		|\r\n"
					+ "|										|\r\n"
					+ "|	ID.  MEDICINE NAME.      QTY.     Supplier Name.         Exp.Date	|\r\n"	
					+ "|===============================================================================|\r\n"
					+ "|  										|\r\n");
			
					try 
					{	
					for(int c =1 ; c<5 ;c++)
					{
					MedicineFeature book4 = new MedicineFeature();
					
					book4.setId(ID);
					book4.setname_s(Name);
					book4.setMedicine(Medicine); 
					book4.setQuantity(Quantity);
					book4.setExp_date(Exp_Date);

					byte[] MedicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.Medicine_DATA_BLOCK_SIZE, "medicine.dat");
					MedicineFeature MedicineWrittenObject = MedicineFeature.ByteArrayBlockToMedicine(MedicineWrittenBytes); 
					
					MedicineWrittenObject.getId();
					
					System.out.print
					 ("|\t" + MedicineWrittenObject.getId()
					 
					 +"   ||"
							
					 + "\t  " + MedicineWrittenObject.getname_s()
					 
					 +"   ||"
					 
					  + "\t  " + MedicineWrittenObject.getQuantity() 
					 
					 +"   ||"
					 
					 + "\t  " + MedicineWrittenObject.getMedicine()  
					 
					 +"   ||"
					
					 + "\t  " + MedicineWrittenObject.getExp_date()						
					
					 + ("\n")
					
					 + "|===============================================================================|\r\n");
					}
					}
					
					catch(NullPointerException e)
					{
						continue;			
					}
					
					System.out.print("\t\t    Press First Character for further Menu =");
					////			  
					
					String menu3 = new Scanner(System.in).nextLine();
					
					
					
					///
					///SEARCH
					///
					
				    case "S":
				    case "s":
				    	
				    	
				    	for (int i = 0; i < 10; i++) //boşluk bırakır
						{
						System.out.print("\n");
						}
						
					    System.out.println("|===============================================================================|");
					    System.out.println("|										|");
					    System.out.println("|			|================================|       		|");
					    System.out.println("|		    	|        MEDICINE SEARCH	         |		        |");
					    System.out.println("|			|================================|       		|");
					    System.out.println("|										|");
					    System.out.println("|										|");
					    System.out.println("|										|");
					    
					    
					    
					    System.out.println("Search by Medicine ID number\n" +"Search by Medicine Name :" );
					    System.out.println("Press First charecter for the operation :");
						Scanner scanner52 = new Scanner(System.in);
						String menu6 = scanner52.next();
					    
					    
					    switch(menu6) // search ids
						{
					    
					    case "I":
					    case "i":
					    
				    	for (int i = 0; i < 1; i++) //boşluk bırakır
						{
						System.out.print("\n");
						}
				    	
				    	
						
					    System.out.print("Enter The Medicine Id =");   //search id yeri
					    
						Scanner scanner50 = new Scanner(System.in);
						int searchId = scanner50.nextInt();
					    
						
							try {
					    
					    for (int c = 1; c < 4; c++)
					{
					    byte[] MedicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.Medicine_DATA_BLOCK_SIZE, "medicine.dat");
					    MedicineFeature MedicineWrittenObject = MedicineFeature.ByteArrayBlockToMedicine(MedicineWrittenBytes);
						
						
						MedicineWrittenObject.getId();
						
						if (MedicineWrittenObject.getId() == searchId)
						{
							
							System.out.println("MEDICINE ID  :" + MedicineWrittenObject.getId());
							
							System.out.println("MEDICINE NAME:" + MedicineWrittenObject.getname_s());
						
							System.out.println("ENTER RACK NO :" + MedicineWrittenObject.getRack());

							System.out.println("CABNIT NO :" + MedicineWrittenObject.getCabnit());
						
							System.out.println("COMPANY NAME   :" + MedicineWrittenObject.getCompany());
							
							System.out.println("SUPPLIER NAME :" + MedicineWrittenObject.getMedicine());
							
							System.out.println("UNIT COST   Rs.:" + MedicineWrittenObject.getUnitcost());
							
							System.out.println("SALE COST   Rs.:" + MedicineWrittenObject.getSalecost());
							
							System.out.println("QUANTITY       :" + MedicineWrittenObject.getQuantity());
							
							System.out.println("MFG.DATE(dd-mm-yyyy):" + MedicineWrittenObject.getMgf_date());
							
							System.out.println("EXP.DATE(dd-mm-yyyy):" + MedicineWrittenObject.getExp_date());
							
							System.out.print("|===============================================================================|\r\n");

						}
					
						
					}
					    	}
						
						catch(NullPointerException e)
						{
							break;			
						}
							
					    case "N":
					    case "n":
					    	
				    	System.out.print("Please Medicine Enter Name:");
				    	
						Scanner scanner89 = new Scanner(System.in);
						String searchname = scanner89.next();
						
						try {
							
						for (int c = 1; c < 4; c++)
					{
							
						byte[] MedicineWrittenBytes = FileOperations.readBlock(c, MedicineFeature.Medicine_DATA_BLOCK_SIZE, "medicine.dat");
						MedicineFeature MedicineWrittenObject = MedicineFeature.ByteArrayBlockToMedicine(MedicineWrittenBytes);
							
						if (searchname.equals(MedicineWrittenObject.getname_s()))
	                    {
							
							System.out.println("MEDICINE ID  :" + MedicineWrittenObject.getId());
							
							System.out.println("MEDICINE NAME:" + MedicineWrittenObject.getname_s());
						
							System.out.println("ENTER RACK NO :" + MedicineWrittenObject.getRack());

							System.out.println("CABNIT NO :" + MedicineWrittenObject.getCabnit());
						
							System.out.println("COMPANY NAME   :" + MedicineWrittenObject.getCompany());
							
							System.out.println("SUPPLIER NAME :" + MedicineWrittenObject.getMedicine());
							
							System.out.println("UNIT COST   Rs.:" + MedicineWrittenObject.getUnitcost());
							
							System.out.println("SALE COST   Rs.:" + MedicineWrittenObject.getSalecost());
							
							System.out.println("QUANTITY       :" + MedicineWrittenObject.getQuantity());
							
							System.out.println("MFG.DATE(dd-mm-yyyy):" + MedicineWrittenObject.getMgf_date());
							
							System.out.println("EXP.DATE(dd-mm-yyyy):" + MedicineWrittenObject.getExp_date());
						
						}
						
						
					}
						
						}
						catch(NullPointerException e)
						{
							continue;
						}
						
						}// search id switch case	
			    	
					    continue;	
					}
					
					///
					///About
					///
					
					case "A":
					case "a":
					
						System.out.print
						("|===============================================================================|\r\n"
						+ "|										|\r\n"	
						+ "|  		             ***** MEDICAL STORE *****                          |\r\n"
						+ "|										|\r\n"	
						+ "|===============================================================================|\r\n"
						+ "|										|\r\n"
						+ "|  	=> This Project Is About Medical Store		      	                |\r\n"
						+ "|										|\r\n"
						+ "|       => In This Project we Can Add Medicine ,Customer,Supplier Details       |\r\n"
						+ "|										|\r\n"
						+ "|       => We Can Modifed & Delete Existing Record			        |\r\n"
						+ "|										|\r\n"
						+ "|	=> We Can Also Search Medicine ,Customer,Supplier Details      	        |\r\n"
						+ "|										|\r\n"
						+ "|	=> It's Helpfull For Display Stock Of Medicine 		             	|\r\n"
						+ "|										|\r\n"
						+ "|			<<<<-Press Enter for main menu->>>>		        |\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|										|\r\n"
						+ "|===============================================================================|\r\n");
					   //case "m":
					   //case "M":
					Scanner scanner7 = new Scanner(System.in);
					String menu9 = scanner7.nextLine();
					
					continue;
					
					
					///
					///REPORT
					///
					
					case "R":
					case "r":
						
					for (int i = 0; i < 4; i++) //boşluk bırakır
						{
						System.out.print("\n");
						}
					
					
					System.out.print
					
					( "				---------------					\r\n"
					+ "		           	 Report MENU					\r\n"
					+ "				---------------					\r\n"	
					+ "|===============================================================================|\r\n"
					+ "|  				Purchase Report				        |\r\n"
					+ "|										|\r\n"
					+ "|				Sale Report					|\r\n"
					+ "|										|\r\n"
					+ "|				Profit Report		    	                |\r\n"
					+ "|										|\r\n"
					+ "|				Daily Sale Report			        |\r\n"
					+ "|										|\r\n"
					+ "|				Daily Purchase Report		        	|\r\n"
					+ "|										|\r\n"
					+ "|				Main Menu			 	        |\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|										|\r\n"
					+ "|===============================================================================|\r\n");
					
					
					System.out.print("\t\t    Press First Character for further Menu =");
					////			  

					String menu8 = new Scanner(System.in).next();

					if (menu8.equals("")) 
					{
					  for (int i = 0; i < 4; i++)
					{
					System.out.print("\n");
					}

					System.out.println("Plese Enter right character ONLY (P,S,L,H,M).");
					}
					
					
					continue;
					
					///
					///Bill
					///
					
					case "B":
					case "b":
						
					for (int i = 0; i < 4; i++) //boşluk bırakır
						{
						System.out.print("\n");
						}
					
					
					System.out.print("Enter bill no : " + "dat kismi");
					System.out.print("\n");
					
					
					continue;
					
					///
					/// Exit
					///
					
				    case "E":
				    case "e":
				    	
			    	System.exit(0);
				
				

					default:
			    	// Girilen karakter geçerli değilse yapılacak işlemler
			    	break;
			    	
				    
				    //case "m":
				    //case "M":
			    	
		} // switch furhermenu
			  
			  
			  
			  
	} //while 1.
	} // main
	} // public class






