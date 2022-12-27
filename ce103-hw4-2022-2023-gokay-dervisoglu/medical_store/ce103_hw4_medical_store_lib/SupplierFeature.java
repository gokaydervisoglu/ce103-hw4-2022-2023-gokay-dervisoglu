package ce103_hw4_library_lib;

import java.io.IOException;


public class SupplierFeature
{

	public static final int ID_LENGTH = 4; //id

	public static final int name_s_MAX_LENGTH = 50; //name

	public static final int city_MAX_LENGTH = 50; 

	public static final int contact_no_NAME_MAX_LENGTH = 20;

	public static final int email_NAME_MAX_LENGTH = 50;

	public static final int Supplier_DATA_BLOCK_SIZE = ID_LENGTH + city_MAX_LENGTH + contact_no_NAME_MAX_LENGTH + name_s_MAX_LENGTH + email_NAME_MAX_LENGTH;

	public static final int Name_Lenght = 30;

	public static final int Return_Date_Lenght = 20;

	public static final int Date_Lenght = 30;

	public static final int Borrow_Data_Block_Size = Name_Lenght + Return_Date_Lenght + Date_Lenght + ID_LENGTH;


	private int _id; //id
	private String _name_s; //name
	private String _city; //city
	private int _contact_no; //contact_no
	private String _email; //email
	
	
	//private String _name;
	//private String _return_date;
	//private String _date;


	public final int getId()
	{
		return _id;
	}
	public final void setId(int value)
	{
		_id = value;
	}
	public final String getname_s()
	{
		return _name_s;
	}
	public final void setname_s(String value)
	{
		_name_s = value;
	}
	public final String getcity()
	{
		return _city;
	}
	public final void setcity(String value)
	{
		_city = value;
	}
	
	public final int getcontact_no()
	{
		return _contact_no;
	}
	public final void setcontact_no(int value)
	{
		_contact_no = value;
	}
	
	public final String getemail()
	{
		return _email;
	}
	public final void setemail(String value)
	{
		_email = value;
	}
/*
	public final String getName()
	{
		return _name;
	}
	public final void setName(String value)
	{
		_name = value;
	}
	public final String getReturnDate()
	{
		return _return_date;
	}
	public final void setReturnDate(String value)
	{
		_return_date = value;
	}
	public final String getDate()
	{
		return _date;
	}
	public final void setDate(String value)
	{
		_date = value;
	}

*/
	/*
	public static byte[] SupplierToByteArrayBlockBorrow(SupplierFeature Supplier)
	{

		int index = 0;


		byte[] dataBuffer = new byte[Borrow_Data_Block_Size];

		byte[] idBytes = DataOperations.integerToByteArray(Supplier.getId());
		System.arraycopy(idBytes, 0, dataBuffer, index, idBytes.length);
		index += SupplierFeature.ID_LENGTH;

		byte[] nameBytes = DataOperations.StringToByteArray(Supplier.getName());
		System.arraycopy(nameBytes, 0, dataBuffer, index, nameBytes.length);
		index += SupplierFeature.Name_Lenght;

		byte[] returnDateBytes = DataOperations.StringToByteArray(Supplier.getReturnDate());
		System.arraycopy(returnDateBytes, 0, dataBuffer, index, returnDateBytes.length);
		index += SupplierFeature.Return_Date_Lenght;

		byte[] DateBytes = DataOperations.StringToByteArray(Supplier.getDate());
		System.arraycopy(DateBytes, 0, dataBuffer, index, DateBytes.length);
		index += SupplierFeature.Date_Lenght;

		if (index != dataBuffer.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		return dataBuffer;

	}
	*/
	/*
	public static SupplierFeature ByteArrayBlockToBorrow(byte[] byteArray)
	{
		SupplierFeature Supplier = new SupplierFeature();

		if (byteArray.length != Borrow_Data_Block_Size)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}


		int index = 0;


		byte[] idBytes = new byte[SupplierFeature.ID_LENGTH];
		System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
		Supplier.setId(DataOperations.byteArrayToInteger(idBytes));
		index += SupplierFeature.ID_LENGTH;

		byte[] nameBytes = new byte[SupplierFeature.Name_Lenght];
		System.arraycopy(byteArray, index, nameBytes, 0, nameBytes.length);
		Supplier.setName(DataOperations.byteArrayToString(nameBytes));
		index += SupplierFeature.Name_Lenght;

		byte[] returnDateBytes = new byte[SupplierFeature.Return_Date_Lenght];
		System.arraycopy(byteArray, index, returnDateBytes, 0, returnDateBytes.length);
		Supplier.setReturnDate(DataOperations.byteArrayToString(returnDateBytes));
		index += SupplierFeature.Return_Date_Lenght;

		byte[] dateBytes = new byte[SupplierFeature.Date_Lenght];
		System.arraycopy(byteArray, index, dateBytes, 0, dateBytes.length);
		Supplier.setDate(DataOperations.byteArrayToString(dateBytes));
		index += SupplierFeature.Date_Lenght;



		if (index != byteArray.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		if (Supplier.getId() == 0)
		{
			return null;
		}
		else
		{
			return Supplier;
		}

	}
	 */
	public static byte[] SupplierToByteArrayBlock(SupplierFeature Supplier)
	{
		int index = 0;

		byte[] dataBuffer = new byte[Supplier_DATA_BLOCK_SIZE];


		byte[] idBytes = DataOperations.integerToByteArray(Supplier.getId());
		System.arraycopy(idBytes, 0, dataBuffer, index, idBytes.length);
		index += SupplierFeature.ID_LENGTH;

		byte[] name_sBytes = DataOperations.StringToByteArray(Supplier.getname_s());
		System.arraycopy(name_sBytes, 0, dataBuffer, index, name_sBytes.length);
		index += SupplierFeature.name_s_MAX_LENGTH;

		byte[] descBytes = DataOperations.StringToByteArray(Supplier.getcity());
		System.arraycopy(descBytes, 0, dataBuffer, index, descBytes.length);
		index += SupplierFeature.city_MAX_LENGTH;

		byte[] authorBytes = DataOperations.integerToByteArray(Supplier.getcontact_no());
		System.arraycopy(authorBytes, 0, dataBuffer, index, authorBytes.length);
		index += SupplierFeature.contact_no_NAME_MAX_LENGTH;

		byte[] emailBytes = DataOperations.StringToByteArray(Supplier.getemail());
		System.arraycopy(emailBytes, 0, dataBuffer, index, emailBytes.length);
		index += SupplierFeature.email_NAME_MAX_LENGTH;



		if (index != dataBuffer.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		return dataBuffer;
	}
	
	
	

	public static SupplierFeature ByteArrayBlockToSupplierCounter(byte[] byteArray) 
			throws IOException
	{

		SupplierFeature Supplier = new SupplierFeature();

		if (byteArray.length != ID_LENGTH)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}


		int index = 0;
		//byte[] dataBuffer = new byte[Supplier_DATA_BLOCK_SIZE];


		byte[] idBytes = new byte[SupplierFeature.ID_LENGTH];
		System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
		Supplier.setId(DataOperations.byteArrayToInteger(idBytes));
		index += SupplierFeature.ID_LENGTH;
		//Console.WriteLine(Supplier.Id);
		Supplier.setId(Supplier.getId() + 1);
		//Console.WriteLine(Supplier.Id);
		idBytes = DataOperations.integerToByteArray(Supplier.getId());
		
		FileOperations.deleteBlock(1, 5, "supplier.dat");
		FileOperations.appendBlockCounter(idBytes, "supplier.dat");
		return null;

		

	}
	
	
	
	public static SupplierFeature ByteArrayBlockToSupplier(byte[] byteArray)
	{

		SupplierFeature Supplier = new SupplierFeature();

		if (byteArray.length != Supplier_DATA_BLOCK_SIZE)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}

		int index = 0;

		//byte[] dataBuffer = new byte[Supplier_DATA_BLOCK_SIZE];

		byte[] idBytes = new byte[SupplierFeature.ID_LENGTH];
		System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
		Supplier.setId(DataOperations.byteArrayToInteger(idBytes));

		index += SupplierFeature.ID_LENGTH;

		byte[] name_sBytes = new byte[SupplierFeature.name_s_MAX_LENGTH];
		System.arraycopy(byteArray, index, name_sBytes, 0, name_sBytes.length);
		Supplier.setname_s(DataOperations.byteArrayToString(name_sBytes));

		index += SupplierFeature.name_s_MAX_LENGTH;

		byte[] descBytes = new byte[SupplierFeature.city_MAX_LENGTH];
		System.arraycopy(byteArray, index, descBytes, 0, descBytes.length);
		Supplier.setcity(DataOperations.byteArrayToString(descBytes));

		index += SupplierFeature.city_MAX_LENGTH;

		byte[] authorBytes = new byte[SupplierFeature.contact_no_NAME_MAX_LENGTH];
		System.arraycopy(byteArray, index, authorBytes, 0, authorBytes.length);
		Supplier.setcontact_no(DataOperations.byteArrayToInteger(authorBytes));

		index += SupplierFeature.contact_no_NAME_MAX_LENGTH;


		byte[] emailBytes = new byte[SupplierFeature.email_NAME_MAX_LENGTH];

		System.arraycopy(byteArray, index, emailBytes, 0, emailBytes.length);

		Supplier.setemail(DataOperations.byteArrayToString(emailBytes));

		index += SupplierFeature.email_NAME_MAX_LENGTH;




		if (index != byteArray.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		if (Supplier.getId() == 0)
		{
			return null;
		}
		else
		{
			return Supplier;
		}


	}

}