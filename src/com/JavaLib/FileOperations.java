package com.JavaLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOperations
{
	public static byte[] readBlock(int count, int blocksize, String path) 
			throws IOException 
	{
	    byte[] buffer = new byte[blocksize];
	    try (FileInputStream fileStream = new FileInputStream(path)) 
	    {
	        fileStream.skip((count - 1) * blocksize);
	        fileStream.read(buffer);
	    }
	    return buffer;
	}
	
	public static boolean appendBlockCounter(byte[] data, String path)
		throws IOException 
		{
		try( FileOutputStream fileStream = new FileOutputStream(path,true))
		{
			fileStream.write(data);
		}
		catch(FileNotFoundException e)
		{ 
			e.printStackTrace();
		}
		return false;
		
		}
	
	
	public static boolean appendBlock(byte[] data, String path) throws IOException 
	{
	    try (FileOutputStream fileStream = new FileOutputStream(path, true))
	    {
	        fileStream.write(data);
	    }
	    //System.out.println("Yazma başarılı");
	    return true;
	}
	
	public static boolean appendBlock2(byte[] data, int offset, int blocksize, String path) throws IOException 
	{
	    try (FileOutputStream fileStream = new FileOutputStream(path, true))
	    {
	        fileStream.write(data);
	    }
	  	 catch (IOException e) {
          e.printStackTrace();
          return false;
	  	}
	    //System.out.println("Yazma başarılı");
	    return false;
	}
	
	
	
	
	public static boolean updateBlock(byte[] data, int offset, int blocksize, String path)
			throws IOException 
		{
		try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File(path), "rw")) {
            randomAccessFile.seek(offset);
            randomAccessFile.write(data);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
		return false;
	
		}
		
		public static boolean deleteBlock(int count, int blocksize, String path) throws IOException 
		{
		    byte[] data = new byte[blocksize];
		    try (FileOutputStream fileStream = new FileOutputStream(path)) {
		        fileStream.getChannel().position((count - 1) * blocksize);
		        fileStream.write(data);
		    }
		    return true;
		}
	
				
		public static boolean deleteBlock2(int blockSize, int offset, String path) {
				
				
				
        byte[] data = DataOperations.StringToByteArray("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(new File(path), "rw")) {
	            randomAccessFile.seek(offset);
	            randomAccessFile.write(data);
	        } catch (IOException e) {
	            e.printStackTrace();
	            return false;
	        }
	
	        return true;
}
}
