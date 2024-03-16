package com.JavaLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class MainFunctions
{
	
	public void controlFile(String path, String filename) throws IOException 
	{
		//This function edit information to program.
	    FileInputStream fileStream = null;
	    try {
	        fileStream = new FileInputStream(path); 
	        System.out.println("Dosya açıldı");
	    } catch (FileNotFoundException e) {
	        System.out.println("Dosya bulunamadı");
	    } finally {
	        if (fileStream != null) {
	            fileStream.close();
	        }
	    }
	}
	
	
	public final static void ControlFile(String FileName) throws IOException 
	{
		//This function edit information to program.
		File file =new File(FileName);
		
		if(!file.exists()) {
			file.createNewFile();
		}
	}
	
	
	public final static void AddSaleMedicine(int MedicineId,int CustomerId , int MedicineQuantity,String SaleDate) 
			throws IOException
	{
		
		//This function add salemedicine information to program.
		
		SaleMedicineFeature sale= new SaleMedicineFeature();

		sale.setCustomerId(CustomerId);
		sale.setMedicineId(MedicineId);
		sale.setMedicineQuantity(MedicineQuantity);
		sale.setSaleDate(SaleDate);
		
		byte[] saleMedicineBytes = SaleMedicineFeature.BookToByteArrayBlock(sale);
		
		ControlFile("sale.dat");
		FileOperations.appendBlock(saleMedicineBytes,"sale.dat");
		//FileOperations.DeleteBlock();

	}
	
	public final static void AddSaleMedicine2(int MedicineId,int CustomerId) 
			throws IOException
	{
		//This function add salemedicine information to program.
		
		SaleMedicineFeature sale= new SaleMedicineFeature();		
		sale.setCustomerId(CustomerId);
		sale.setMedicineId(MedicineId);
		
		byte[] saleMedicineBytes = SaleMedicineFeature.BookToByteArrayBlock(sale);
		
		ControlFile("sale.dat");

		FileOperations.appendBlock(saleMedicineBytes,"sale.dat");

	}
	
	public final void AddSupplier(int ID, String Name, String City, int Contact_No, String Email_ID, String path) 
			throws IOException
	{
		
		//This function add supplier information to program.
		
		
		SupplierFeature book3 = new SupplierFeature();
		
		book3.setId(ID); 
		book3.setname_s(Name);
		book3.setcity(City);
		book3.setcontact_no(Contact_No);
		book3.setemail(Email_ID);
		
		byte[] bookBytes1 = SupplierFeature.SupplierToByteArrayBlock(book3); 
		FileOperations.appendBlock(bookBytes1, path);
		
	}		
	
	

	public final void DecreaseBook(int amount) throws IOException
	{
		//This function help to delete information in program.


		byte[] bookWrittenBytes = FileOperations.readBlock(1, 4, "supplier.dat");
		SupplierFeature Id = new SupplierFeature();

	
		Id.setId(DataOperations.byteArrayToInteger(bookWrittenBytes));
		
		amount = Id.getId() - amount;
	
		bookWrittenBytes = DataOperations.integerToByteArray(amount);
		FileOperations.deleteBlock(1, 4, "supplier.dat");
		FileOperations.updateBlock(bookWrittenBytes, 1, 4, "supplier.dat");

	}
	
	public final int DecreaseBook2(int amount) throws IOException
	{
		//This function help to delete information in program.


		byte[] bookWrittenBytes = FileOperations.readBlock(1, 4, "supplier.dat");
		SupplierFeature Id = new SupplierFeature();

	
		Id.setId(DataOperations.byteArrayToInteger(bookWrittenBytes));
		
		if (Id.getId() == 0)
		{
			System.out.print("Id degeri 0");
			return amount;
		}
		amount = Id.getId() - amount;
	
		bookWrittenBytes = DataOperations.integerToByteArray(amount);
		FileOperations.deleteBlock(1, 4, "supplier.dat");
		FileOperations.updateBlock(bookWrittenBytes, 1, 4, "supplier.dat");

		return amount;
	}
	
	

}

