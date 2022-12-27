package ce103_hw4_library_lib;

import java.io.IOException;

public class CustomerFeature
{

	public static final int ID_LENGTH = 4; //id

	public static final int name_s_MAX_LENGTH = 50; //name

	public static final int city_MAX_LENGTH = 50; 

	public static final int contact_no_NAME_MAX_LENGTH = 20;

	public static final int email_NAME_MAX_LENGTH = 50;

	public static final int Customer_DATA_BLOCK_SIZE = ID_LENGTH + city_MAX_LENGTH + contact_no_NAME_MAX_LENGTH + name_s_MAX_LENGTH + email_NAME_MAX_LENGTH;

	//public static final int Name_Lenght = 30;

	//public static final int Return_Date_Lenght = 20;

	//public static final int Date_Lenght = 30;

	//public static final int Borrow_Data_Block_Size = Name_Lenght + Return_Date_Lenght + Date_Lenght + ID_LENGTH;


	private int _id; //id
	private String _name_s; //name
	private String _city; //city
	private int _contact_no; //contact_no
	private String _email; //email
	
	
	private String _name;
	private String _return_date;
	private String _date;


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


	/*
	public static byte[] CustomerToByteArrayBlockBorrow(CustomerFeature Customer)
	{

		int index = 0;


		byte[] dataBuffer = new byte[Borrow_Data_Block_Size];

		byte[] idBytes = DataOperations.integerToByteArray(Customer.getId());
		System.arraycopy(idBytes, 0, dataBuffer, index, idBytes.length);
		index += CustomerFeature.ID_LENGTH;

		byte[] nameBytes = DataOperations.StringToByteArray(Customer.getName());
		System.arraycopy(nameBytes, 0, dataBuffer, index, nameBytes.length);
		index += CustomerFeature.Name_Lenght;

		byte[] returnDateBytes = DataOperations.StringToByteArray(Customer.getReturnDate());
		System.arraycopy(returnDateBytes, 0, dataBuffer, index, returnDateBytes.length);
		index += CustomerFeature.Return_Date_Lenght;

		byte[] DateBytes = DataOperations.StringToByteArray(Customer.getDate());
		System.arraycopy(DateBytes, 0, dataBuffer, index, DateBytes.length);
		index += CustomerFeature.Date_Lenght;

		if (index != dataBuffer.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		return dataBuffer;

	}
	*/

	/*
	public static CustomerFeature ByteArrayBlockToBorrow(byte[] byteArray)
	{
		CustomerFeature Customer = new CustomerFeature();

		if (byteArray.length != Borrow_Data_Block_Size)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}


		int index = 0;


		byte[] idBytes = new byte[CustomerFeature.ID_LENGTH];
		System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
		Customer.setId(DataOperations.byteArrayToInteger(idBytes));
		index += CustomerFeature.ID_LENGTH;

		byte[] nameBytes = new byte[CustomerFeature.Name_Lenght];
		System.arraycopy(byteArray, index, nameBytes, 0, nameBytes.length);
		Customer.setName(DataOperations.byteArrayToString(nameBytes));
		index += CustomerFeature.Name_Lenght;

		byte[] returnDateBytes = new byte[CustomerFeature.Return_Date_Lenght];
		System.arraycopy(byteArray, index, returnDateBytes, 0, returnDateBytes.length);
		Customer.setReturnDate(DataOperations.byteArrayToString(returnDateBytes));
		index += CustomerFeature.Return_Date_Lenght;

		byte[] dateBytes = new byte[CustomerFeature.Date_Lenght];
		System.arraycopy(byteArray, index, dateBytes, 0, dateBytes.length);
		Customer.setDate(DataOperations.byteArrayToString(dateBytes));
		index += CustomerFeature.Date_Lenght;



		if (index != byteArray.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		if (Customer.getId() == 0)
		{
			return null;
		}
		else
		{
			return Customer;
		}

	}
	*/

	public static byte[] CustomerToByteArrayBlock(CustomerFeature Customer)
	{
		int index = 0;

		byte[] dataBuffer = new byte[Customer_DATA_BLOCK_SIZE];


		byte[] idBytes = DataOperations.integerToByteArray(Customer.getId());
		System.arraycopy(idBytes, 0, dataBuffer, index, idBytes.length);
		index += CustomerFeature.ID_LENGTH;

		byte[] name_sBytes = DataOperations.StringToByteArray(Customer.getname_s());
		System.arraycopy(name_sBytes, 0, dataBuffer, index, name_sBytes.length);
		index += CustomerFeature.name_s_MAX_LENGTH;

		byte[] descBytes = DataOperations.StringToByteArray(Customer.getcity());
		System.arraycopy(descBytes, 0, dataBuffer, index, descBytes.length);
		index += CustomerFeature.city_MAX_LENGTH;

		byte[] authorBytes = DataOperations.integerToByteArray(Customer.getcontact_no());
		System.arraycopy(authorBytes, 0, dataBuffer, index, authorBytes.length);
		index += CustomerFeature.contact_no_NAME_MAX_LENGTH;

		byte[] emailBytes = DataOperations.StringToByteArray(Customer.getemail());
		System.arraycopy(emailBytes, 0, dataBuffer, index, emailBytes.length);
		index += CustomerFeature.email_NAME_MAX_LENGTH;



		if (index != dataBuffer.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		return dataBuffer;
	}

	public static CustomerFeature ByteArrayBlockToCustomerCounter(byte[] byteArray) 
			throws IOException
	{

		CustomerFeature Customer = new CustomerFeature();

		if (byteArray.length != ID_LENGTH)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}


		int index = 0;
		//byte[] dataBuffer = new byte[Customer_DATA_BLOCK_SIZE];


		byte[] idBytes = new byte[CustomerFeature.ID_LENGTH];
		System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
		Customer.setId(DataOperations.byteArrayToInteger(idBytes));
		index += CustomerFeature.ID_LENGTH;
		//Console.WriteLine(Customer.Id);
		Customer.setId(Customer.getId() + 1);
		//Console.WriteLine(Customer.Id);
		idBytes = DataOperations.integerToByteArray(Customer.getId());
		
		FileOperations.deleteBlock(1, 5, "Customer.dat");
		FileOperations.appendBlockCounter(idBytes, "Customer.dat");
		return null;

		

	}
	public static CustomerFeature ByteArrayBlockToCustomer(byte[] byteArray)
	{

		CustomerFeature Customer = new CustomerFeature();

		if (byteArray.length != Customer_DATA_BLOCK_SIZE)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}

		int index = 0;

		//byte[] dataBuffer = new byte[Customer_DATA_BLOCK_SIZE];

		byte[] idBytes = new byte[CustomerFeature.ID_LENGTH];
		System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
		Customer.setId(DataOperations.byteArrayToInteger(idBytes));

		index += CustomerFeature.ID_LENGTH;

		byte[] name_sBytes = new byte[CustomerFeature.name_s_MAX_LENGTH];
		System.arraycopy(byteArray, index, name_sBytes, 0, name_sBytes.length);
		Customer.setname_s(DataOperations.byteArrayToString(name_sBytes));

		index += CustomerFeature.name_s_MAX_LENGTH;

		byte[] descBytes = new byte[CustomerFeature.city_MAX_LENGTH];
		System.arraycopy(byteArray, index, descBytes, 0, descBytes.length);
		Customer.setcity(DataOperations.byteArrayToString(descBytes));

		index += CustomerFeature.city_MAX_LENGTH;

		byte[] authorBytes = new byte[CustomerFeature.contact_no_NAME_MAX_LENGTH];
		System.arraycopy(byteArray, index, authorBytes, 0, authorBytes.length);
		Customer.setcontact_no(DataOperations.byteArrayToInteger(authorBytes));

		index += CustomerFeature.contact_no_NAME_MAX_LENGTH;




		byte[] emailBytes = new byte[CustomerFeature.email_NAME_MAX_LENGTH];

		System.arraycopy(byteArray, index, emailBytes, 0, emailBytes.length);

		Customer.setemail(DataOperations.byteArrayToString(emailBytes));

		index += CustomerFeature.email_NAME_MAX_LENGTH;




		if (index != byteArray.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		if (Customer.getId() == 0)
		{
			return null;
		}
		else
		{
			return Customer;
		}


	}

}