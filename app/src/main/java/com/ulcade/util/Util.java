package com.ulcade.util;
import io.netty.buffer.ByteBuf;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class Util
{

	public static byte[] randomKey(int p0)
	{
		byte[] h=new byte[p0];
		new Random().nextBytes(h);
		return h;
	}
	
	public static long readUnsignedLong(long value) {
		BigInteger result = BigInteger.valueOf(value);
		if (result.compareTo(BigInteger.ZERO) < 0) {
			result = result.add(BigInteger.ONE.shiftLeft(64));
		}
		return result.longValue();
    }

	
	
	
	public static byte[] hexToBytes(String str)
	{
        String replaceAll = str.replaceAll(" ", "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(replaceAll.length() >> 1);
        for (int i = 0; i <= replaceAll.length() - 2; i += 2)
		{
            byteArrayOutputStream.write(Integer.parseInt(replaceAll.substring(i, i + 2), 16) & 255);
        }
        return byteArrayOutputStream.toByteArray();
    }

	public static void writeToFile(byte[] o, File file)
	{
		try
		{
			FileOutputStream out = new FileOutputStream(file);

			out.write(o);
			out.flush();
			out.close();

			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static byte[] bytesFromFile(File file)
	{

		try
		{
			InputStream in = new FileInputStream(file);

			byte[] data = Util.toByteArray(in);
			in.close();

			return data;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public static byte[] bytesFromFile(String file_name)
	{

		try
		{
			InputStream in = new FileInputStream(file_name);

			byte[] data = Util.toByteArray(in);
			in.close();

			return data;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//e.printStackTrace();
		}
		return null;
	}
	
	private static byte[] toByteArray(InputStream in) throws IOException
	{

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024 * 4];
		int n = 0;
		while ((n = in.read(buffer)) != -1)
		{
			out.write(buffer, 0, n);
		}
		return out.toByteArray();
	}
	
	
	
	public static byte[] bufToBytes(ByteBuf buf)
	{
		byte[] h =new byte[buf.readableBytes()];
		buf.readBytes(h);
		buf.readerIndex(0);//必须把指针调回0
		return h;
	}
	
	public static String bytesToHex(byte[] bytes)
	{
        String hex= "";
        if (bytes != null)
		{
            for (Byte b : bytes)
			{
                hex += String.format("%02X", b.intValue() & 0xFF);
            }
        }
        return hex;

    }
	
	public static String getRandomString(int length){
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random=new Random();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<length;i++){
			int number=random.nextInt(62);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}
}
