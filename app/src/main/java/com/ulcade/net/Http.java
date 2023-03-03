package com.ulcade.net;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Http
{
	public static String httpPost(String url, String data)
	{  
		try
		{
			URL lll = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) lll.openConnection();// 打开连接  
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Accept", "*/*");
			connection.setDoOutput(true);
			connection.setRequestProperty("Referer", "https://music.163.com/m/song?id=16431842");
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36");
			connection.setRequestProperty("Origin","http://music.163.com");
			connection.setRequestProperty("Connection","keep-alive");
			connection.setRequestProperty("Accept-Language","zh-CN,zh;q=0.9,en;q=0.8,zh-TW;q=0.7");
			connection.connect();// 连接会话  
			// 获取输入流  
			PrintWriter writer = new PrintWriter(connection.getOutputStream());
			writer.print(data);                                    
			writer.flush();
			BufferedReader br= new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));  
			String line;  
			StringBuilder sb = new StringBuilder();  
			while ((line = br.readLine()) != null)
			{// 循环读取流  
				sb.append(line);  
			}  
			br.close();// 关闭流
			connection.disconnect();// 断开连接  
			return sb.toString();
		}
		catch (Exception e)
		{  
			System.out.println(e.toString());
		}
		return null;
	}

	public static String httpGet(String url)
	{
		try
		{
			InputStream is=new URL(url).openStream();
			ByteArrayOutputStream buffer=new ByteArrayOutputStream();
			int b=-1;
			while ((b = is.read()) != -1)
				buffer.write(b);
			return new String(buffer.toByteArray());
		}
		catch (MalformedURLException e)
		{
			System.out.println(e.toString());
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		return null;
	}
}
