package ce103_hw4_medical_store_lib;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import org.junit.Test;









public class UnitTest {
	  
	  @Test
	    public void testControlFile() throws IOException {
		// Example filename
	        String FileName = "test.dat";

	     // Let's delete the file first
	        File file = new File(FileName);
	        if (file.exists()) {
	            file.delete();
	        }

	     // run the function
	        MainFunctions.ControlFile(FileName);

	     // Let's check if the file exists
	        file = new File(FileName);
	        assertTrue(file.exists());
	    }
	  
	 
	  		@SuppressWarnings("unused")
	  			@Test
			public void testPrintCustomers() throws IOException {
				// Let's delete the file first
				FileOperations.deleteBlock(1, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
		
				// Write the sample customer information to the file
				CustomerFeature customer1 = new CustomerFeature();
				customer1.setId(1);
				customer1.setname_s("John Smith");
				customer1.setcity("New York");
		
				customer1.setemail("john@example.com");
				byte[] customer1Bytes = CustomerFeature.CustomerToByteArrayBlock(customer1);
				FileOperations.updateBlock(customer1Bytes, 1, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
		
				CustomerFeature customer2 = new CustomerFeature();
				customer2.setId(2);
				customer2.setname_s("Jane Doe");
				customer2.setcity("LosAngeles");
		
				customer2.setemail("jane61");
				byte[] customer2Bytes = CustomerFeature.CustomerToByteArrayBlock(customer2);
				FileOperations.updateBlock(customer2Bytes, 2, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
		
				// Run the function and verify the printed customer information
				MainFunctions mainFunction = new MainFunctions();

	    } 
	  		@SuppressWarnings("unused")
	  		@Test
	  	    public void testMedicineToByteArrayBlock() {
	  	        // Create a MedicineFeature object with sample data
	  	        MedicineFeature book = new MedicineFeature();
	  	        book.setId(123);
	  	        book.setname_s("Aspirin");
	  	        book.setCompany("Acme Inc.");
	  	        book.setMedicine("Pain Relief");
	  	        book.setUnitcost(9);
	  	        book.setSalecost(14);
	  	        book.setQuantity(100);
	  	        book.setMgf_date("2022-01-01");
	  	        book.setExp_date("2024-01-01");
	  	        
	  	        // Convert the MedicineFeature object to a byte array
	  	        byte[] bookBytes = MedicineFeature.MedicineToByteArrayBlock(book);
	  	        
	  	    }
	  		
	  		 	@Test
	  		 	public void testAddSaleMedicine2() throws IOException {
	  	        // Set up test data
	  	        int medicineId = 123;
	  	        int customerId = 456;
	  	        int expectedQuantity = 95;
	  	        
	  	        // Create a MedicineFeature object with sample data
	  	        MedicineFeature book = new MedicineFeature();
	  	        book.setId(medicineId);
	  	        book.setname_s("Aspirin");
	  	        book.setRack(12);
	  	        book.setCompany("Acme Inc.");
	  	        book.setCabnit(12);
	  	        book.setMedicine("Pain Relief");
	  	        book.setUnitcost(9);
	  	        book.setSalecost(14);
	  	        book.setQuantity(100);
	  	        book.setMgf_date("2022-01-01");
	  	        book.setExp_date("2024-01-01");
	  	        
	  	        // Convert the MedicineFeature object to a byte array and write it to a file
	  	        byte[] bookBytes = MedicineFeature.MedicineToByteArrayBlock(book);
	  	        FileOperations.deleteBlock2(1, 0, "medicine.dat");
	  	        
	  	        // Call the AddSaleMedicine2 method
	  
	  		 	}
	  	        
	  	    
	  	    	@Test
	  	    	public void testCustomerAddition() throws IOException {
	  	        // Set up test data
	  	        int ID = 123;
	  	        String Name = "Gokay";
	  	        String City = "Trabzon";
	  	        int Contact_No = 12345;
	  	        String Email_ID = "john61";
	  	        
	  	        // Create a CustomerFeature object with sample data
	  	        CustomerFeature book = new CustomerFeature();
	  	        book.setId(ID);
	  	        book.setname_s(Name);
	  	        book.setcity(City);
	  	        book.setcontact_no(Contact_No);
	  	        book.setemail(Email_ID);
	  	        
	  	        // Convert the CustomerFeature object to a byte array and write it to a file
	  	        byte[] bookBytes = CustomerFeature.CustomerToByteArrayBlock(book);
	  	        FileOperations.appendBlock(bookBytes, "customer.dat");
	  	        
	  	        // Read the CustomerFeature object from the file
	  	      
	  	    }
	  	    	
	  	    	@Test
	  	      	public void testCustomerUpdate() throws IOException {
	  	        // Set up test data
	  	        int ID = 123;
	  	        String Name = "John Smith";
	  	        String City = "New York";
	  	        int Contact_No = 1213;
	  	        String Email_ID = "john.smith@example.com";
	  	        
	  	        // Create a CustomerFeature object with sample data
	  	        CustomerFeature customer = new CustomerFeature();
	  	        customer.setId(ID);
	  	        customer.setname_s(Name);
	  	        customer.setcity(City);
	  	        customer.setcontact_no(Contact_No);
	  	        customer.setemail(Email_ID);
	  	        
	  	        // Convert the CustomerFeature object to a byte array and write it to a file
	  	        byte[] customerBytes = CustomerFeature.CustomerToByteArrayBlock(customer);
	  	        FileOperations.updateBlock(customerBytes, 174, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
	  	        
	  	        // Read the CustomerFeature object from the file
	  	        byte[] updatedCustomerBytes = FileOperations.readBlock(174, CustomerFeature.Customer_DATA_BLOCK_SIZE, "customer.dat");
	  	        CustomerFeature updatedCustomer = CustomerFeature.ByteArrayBlockToCustomer(updatedCustomerBytes);
	  	        
	  	      
	  	    }
	  	    	
	  	    	

	
	     

	 
	  
	}

	
	
	
	
	
	
	
	
	
	



