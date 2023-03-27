package com.ulcade;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ulcade.ByteArrayToHexTypeAdapter;
import java.io.File;

public class PublicConstant
{
	public static Gson gson = new GsonBuilder().setPrettyPrinting().serializeSpecialFloatingPointValues().setLenient().registerTypeHierarchyAdapter(byte[].class, new ByteArrayToHexTypeAdapter()).create();
	
	public static File clientConfigFile=new File("conf/client.json");
	
	public static File userConfigFile=new File("conf/user.json");
	
	public static boolean printCmd=true;
}
