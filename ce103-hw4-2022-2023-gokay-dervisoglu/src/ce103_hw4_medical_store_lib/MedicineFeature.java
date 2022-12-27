package ce103_hw4_medical_store_lib;

import java.io.IOException;



public class MedicineFeature
{

	public static final int ID_LENGTH = 4; //id

	public static final int name_s_MAX_LENGTH = 100; //name

	public static final int rack_MAX_LENGTH = 4; 

	public static final int cabnit_MAX_LENGTH = 4;

	public static final int company_NAME_MAX_LENGTH = 100;
	
	public static final int Medicine_NAME_MAX_LENGTH = 100;
	
	public static final int unitcost_MAX_LENGTH = 10;
	
	public static final int salecost_MAX_LENGTH = 10;
	
	public static final int quantity_MAX_LENGTH = 10;
	
	public static final int mgf_date_LENGTH = 30;
	
	public static final int exp_date_LENGTH = 30;

	public static final int Medicine_DATA_BLOCK_SIZE = ID_LENGTH + rack_MAX_LENGTH + cabnit_MAX_LENGTH + name_s_MAX_LENGTH 
	+ company_NAME_MAX_LENGTH + Medicine_NAME_MAX_LENGTH + unitcost_MAX_LENGTH + salecost_MAX_LENGTH + quantity_MAX_LENGTH + mgf_date_LENGTH 
	+ exp_date_LENGTH;
	
	public static final int SaleMedicine_DATA_BLOCK_SIZE = ID_LENGTH + Medicine_NAME_MAX_LENGTH;
	
	
	

	private int _id; 
	private String _name_s; 
	private int _rack; 
	private int _cabnit;
	
	private String _company;
	private String _Medicine;
	
	private int _unitcost;
	private int _salecost;
	private int _quantity;
	private String _mgf_date;
	private String _exp_date;
	private String _name;

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
	public final int getRack()
	{
		return _rack;
	}
	public final void setRack(int value)
	{
		_rack = value;
	}
	public final int getCabnit()
	{
		return _cabnit;
	}
	public final void setCabnit(int value)
	{
		_cabnit = value;
	}
	public final String getCompany()
	{
		return _company;
	}
	public final void setCompany(String value)
	{
		_company = value;
	}
	public final String getMedicine()
	{
		return _Medicine;
	}
	public final void setMedicine(String value)
	{
		_Medicine = value;
	}
	public final int getUnitcost()
	{
		return _unitcost;
	}
	public final void setUnitcost(int value)
	{
		_unitcost = value;
	}
	public final int getSalecost()
	{
		return _salecost;
	}
	public final void setSalecost(int value)
	{
		_salecost = value;
	}
	public final int getQuantity()
	{
		return _quantity;
	}
	public final void setQuantity(int value)
	{
		_quantity = value;
	}
	public final String getMgf_date()
	{
		return _mgf_date;
	}
	public final void setMgf_date(String value)
	{
		_mgf_date = value;
	}
	public final String getExp_date()
	{
		return _exp_date;
	}
	public final void setExp_date(String value)
	{
		_exp_date = value;
	}	
	public final String getName()
	{
		return _name;
	}
	public final void setName(String value)
	{
		_name = value;
	}

	public static byte[] MedicineToByteArrayBlock(MedicineFeature Medicine)
	{
		int index = 0;

		byte[] dataBuffer = new byte[Medicine_DATA_BLOCK_SIZE];

		System.out.println("3.");
		
		byte[] idBytes = DataOperations.integerToByteArray(Medicine.getId());
		System.arraycopy(idBytes, 0, dataBuffer, index, idBytes.length);
		index += MedicineFeature.ID_LENGTH;

		byte[] name_sBytes = DataOperations.StringToByteArray(Medicine.getname_s());
		System.arraycopy(name_sBytes, 0, dataBuffer, index, name_sBytes.length);
		index += MedicineFeature.name_s_MAX_LENGTH;

		byte[] rackBytes = DataOperations.integerToByteArray(Medicine.getRack());
		System.arraycopy(rackBytes, 0, dataBuffer, index, rackBytes.length);
		index += MedicineFeature.rack_MAX_LENGTH;

		byte[] cabnitBytes = DataOperations.integerToByteArray(Medicine.getCabnit());
		System.arraycopy(cabnitBytes, 0, dataBuffer, index, cabnitBytes.length);
		index += MedicineFeature.cabnit_MAX_LENGTH;

		byte[] companyBytes = DataOperations.StringToByteArray(Medicine.getCompany());
		System.arraycopy(companyBytes, 0, dataBuffer, index, companyBytes.length);
		index += MedicineFeature.company_NAME_MAX_LENGTH;

		byte[] medicineBytes = DataOperations.StringToByteArray(Medicine.getMedicine());
		System.arraycopy(medicineBytes, 0, dataBuffer, index, medicineBytes.length);
		index += MedicineFeature.Medicine_NAME_MAX_LENGTH;

		byte[] unitcostBytes = DataOperations.integerToByteArray(Medicine.getUnitcost());
		System.arraycopy(unitcostBytes, 0, dataBuffer, index, unitcostBytes.length);
		index += MedicineFeature.unitcost_MAX_LENGTH;
		
		byte[] salecostBytes = DataOperations.integerToByteArray(Medicine.getSalecost());
		System.arraycopy(salecostBytes, 0, dataBuffer, index, salecostBytes.length);
		index += MedicineFeature.salecost_MAX_LENGTH;
		
		byte[] quantityBytes = DataOperations.integerToByteArray(Medicine.getQuantity());
		System.arraycopy(quantityBytes, 0, dataBuffer, index, quantityBytes.length);
		index += MedicineFeature.quantity_MAX_LENGTH;
		
		byte[] mgfBytes = DataOperations.StringToByteArray(Medicine.getMgf_date());
		System.arraycopy(mgfBytes, 0, dataBuffer, index, mgfBytes.length);
		index += MedicineFeature.mgf_date_LENGTH;
		
		byte[] expBytes = DataOperations.StringToByteArray(Medicine.getExp_date());
		System.arraycopy(expBytes, 0, dataBuffer, index, expBytes.length);
		index += MedicineFeature.exp_date_LENGTH;
		
		

		if (index != dataBuffer.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		return dataBuffer;
	}

	public static MedicineFeature ByteArrayBlockToMedicineCounter(byte[] byteArray) 
			throws IOException
	{

		MedicineFeature Medicine = new MedicineFeature();

		if (byteArray.length != ID_LENGTH)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}


		int index = 0;
		//byte[] dataBuffer = new byte[Medicine_DATA_BLOCK_SIZE];


		byte[] idBytes = new byte[MedicineFeature.ID_LENGTH];
		System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
		Medicine.setId(DataOperations.byteArrayToInteger(idBytes));
		index += MedicineFeature.ID_LENGTH;
		//Console.WriteLine(Medicine.Id);
		Medicine.setId(Medicine.getId() + 1);
		//Console.WriteLine(Medicine.Id);
		idBytes = DataOperations.integerToByteArray(Medicine.getId());
		
		FileOperations.deleteBlock(1, 5, "");
		FileOperations.appendBlockCounter(idBytes, "");
		return null;

		

	}
	public static MedicineFeature ByteArrayBlockToMedicine(byte[] byteArray)
	{

		MedicineFeature Medicine = new MedicineFeature();

		if (byteArray.length != Medicine_DATA_BLOCK_SIZE)
		{
			throw new IllegalArgumentException("Byte Array Size Not Match with Constant Data Block Size");
		}

		int index = 0;

		byte[] idBytes = new byte[MedicineFeature.ID_LENGTH];
		System.arraycopy(byteArray, index, idBytes, 0, idBytes.length);
		Medicine.setId(DataOperations.byteArrayToInteger(idBytes));

		index += MedicineFeature.ID_LENGTH;
		
		byte[] name_sBytes = new byte[MedicineFeature.name_s_MAX_LENGTH];
		System.arraycopy(byteArray, index, name_sBytes, 0, name_sBytes.length);
		Medicine.setname_s(DataOperations.byteArrayToString(name_sBytes));

		index += MedicineFeature.name_s_MAX_LENGTH;

		byte[] rackBytes = new byte[MedicineFeature.rack_MAX_LENGTH];
		System.arraycopy(byteArray, index, rackBytes, 0, rackBytes.length);
		Medicine.setRack(DataOperations.byteArrayToInteger(rackBytes));

		index += MedicineFeature.rack_MAX_LENGTH;

		byte[] cabnitBytes = new byte[MedicineFeature.cabnit_MAX_LENGTH];
		System.arraycopy(byteArray, index, cabnitBytes, 0, cabnitBytes.length);
		Medicine.setCabnit(DataOperations.byteArrayToInteger(cabnitBytes));

		index += MedicineFeature.cabnit_MAX_LENGTH;
		
		byte[] companyBytes = new byte[MedicineFeature.company_NAME_MAX_LENGTH];
		System.arraycopy(byteArray, index, companyBytes, 0, companyBytes.length);
		Medicine.setCompany(DataOperations.byteArrayToString(companyBytes));

		index += MedicineFeature.company_NAME_MAX_LENGTH;

		byte[] medicineBytes = new byte[MedicineFeature.Medicine_NAME_MAX_LENGTH];
		System.arraycopy(byteArray, index, medicineBytes, 0, medicineBytes.length);
		Medicine.setMedicine(DataOperations.byteArrayToString(medicineBytes));

		index += MedicineFeature.Medicine_NAME_MAX_LENGTH;

		byte[] unitcostBytes = new byte[MedicineFeature.unitcost_MAX_LENGTH];
		System.arraycopy(byteArray, index, unitcostBytes, 0, unitcostBytes.length);
		Medicine.setUnitcost(DataOperations.byteArrayToInteger(unitcostBytes));

		index += MedicineFeature.unitcost_MAX_LENGTH;
	
		byte[] salecostBytes = new byte[MedicineFeature.salecost_MAX_LENGTH];
		System.arraycopy(byteArray, index, salecostBytes, 0, salecostBytes.length);
		Medicine.setSalecost(DataOperations.byteArrayToInteger(salecostBytes));

		index += MedicineFeature.salecost_MAX_LENGTH;

		byte[] quantityBytes = new byte[MedicineFeature.quantity_MAX_LENGTH];
		System.arraycopy(byteArray, index, quantityBytes, 0, quantityBytes.length);
		Medicine.setQuantity(DataOperations.byteArrayToInteger(quantityBytes));

		index += MedicineFeature.quantity_MAX_LENGTH;

		byte[] mgf_dateBytes = new byte[MedicineFeature.mgf_date_LENGTH];
		System.arraycopy(byteArray, index, mgf_dateBytes, 0, mgf_dateBytes.length);
		Medicine.setMgf_date(DataOperations.byteArrayToString(mgf_dateBytes));

		index += MedicineFeature.mgf_date_LENGTH;

		byte[] exp_dateBytes = new byte[MedicineFeature.exp_date_LENGTH];
		System.arraycopy(byteArray, index, exp_dateBytes, 0, exp_dateBytes.length);
		Medicine.setExp_date(DataOperations.byteArrayToString(exp_dateBytes));

		index += MedicineFeature.exp_date_LENGTH;
				

		if (index != byteArray.length)
		{

			throw new IllegalArgumentException("Index and DataBuffer Size Not Matched");
		}

		if (Medicine.getId() == 0)
		{
			return null;
		}
		else
		{
			return Medicine;
		}


	}

}