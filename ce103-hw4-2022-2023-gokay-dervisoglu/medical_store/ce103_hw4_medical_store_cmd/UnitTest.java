package ce103_hw4_library_cmd;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import org.junit.Test;


import ce103_hw4_library_lib.CustomerFeature;
import ce103_hw4_library_lib.DataOperations;
import ce103_hw4_library_lib.FileOperations;
import ce103_hw4_library_lib.MainFunctions;
import ce103_hw4_library_lib.MedicineFeature;
import ce103_hw4_library_lib.SupplierFeature;






public class UnitTest {

	@Test
	  	public void testSupplierCreationAndFileWriting() throws IOException {
	 
	    int id = 123;
	    String name = "gokay";
	    String city = "trabzon";
	    int contactNo = 1234567890;
	    String email = "gokay61";
	    
	   
	    SupplierFeature supplier = new SupplierFeature();
	    
	    supplier.setId(id);
	    supplier.setname_s(name);
	    supplier.setcity(city);
	    supplier.setcontact_no(contactNo);
	    supplier.setemail(email);
	    
	
	    byte[] supplierBytes = SupplierFeature.SupplierToByteArrayBlock(supplier);
	    FileOperations.appendBlock(supplierBytes, "supplier.dat");
	}
	
	
	@Test
	  	public void testSupplierCreation() throws IOException {
		
	    SupplierFeature book3 = new SupplierFeature();
	    
	    String ID_Control = "1";
	    int ID = Integer.parseInt(ID_Control);
	    
	    String Name = "gokay";
	    String City = "trabzon";
	    
	    String Contact_No_C = "1234567890"; 
	    int Contact_No = Integer.parseInt(Contact_No_C);
	    
	    String Email_ID = "gokay61";
	    
	    book3.setId(ID);
	    book3.setname_s(Name);
	    book3.setcity(City);
	    book3.setcontact_no(Contact_No);
	    book3.setemail(Email_ID);
	    
	    byte[] bookBytes1 = SupplierFeature.SupplierToByteArrayBlock(book3); 
	    FileOperations.appendBlock(bookBytes1, "supplier.dat");
	    
	    assertEquals(ID, book3.getId());
	    assertEquals(Name, book3.getname_s());
	    assertEquals(City, book3.getcity());
	    assertEquals(Contact_No, book3.getcontact_no());
	    assertEquals(Email_ID, book3.getemail());
	  }
	
	@Test
    public void testGetInt() {
        byte[] data1 = new byte[] {0, 0, 0, 1};
        byte[] data2 = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
       

        int offset1 = 0;
        int offset2 = 0;
        

        int length1 = 4;
        int length2 = 4;
      

        int expected1 = 1;
        int expected2 = 16909060;
       

        int result1 = DataOperations.GetInt(data1, offset1, length1);
        int result2 = DataOperations.GetInt(data2, offset2, length2);
       

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
       
    }
	
	  @Test
	  public void testSetAndGetId() {
	    CustomerFeature customer = new CustomerFeature();
	    customer.setId(12345);
	    assertEquals(12345, customer.getId());
	  }

	  @Test
	  public void testSetAndGetName() {
	    CustomerFeature customer = new CustomerFeature();
	    customer.setname_s("John Smith");
	    assertEquals("John Smith", customer.getname_s());
	  }
	  
	  
	  	    	

	
	     

	 
	  
	}

	
	
	
	
	
	
	
	
	
	



