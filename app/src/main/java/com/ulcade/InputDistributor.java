package com.ulcade;

import java.util.LinkedList;
import java.util.Scanner;

public class InputDistributor extends Thread
{
	public static LinkedList<InputReader> readers=new LinkedList<InputReader>();

	public static void registerHighPriority(InputReader reader){
		if(readers.contains(reader)){
			return;
		}
		readers.addFirst(reader);
	}

	public static void registerLowPriority(InputReader reader){
		if(readers.contains(reader)){
			return;
		}
		readers.addLast(reader);
	}

	public static void unRegister(InputReader reader){
		readers.remove(reader);
	}

	public interface InputReader{
		void read(String string);
	}

	@Override
	public void run()
	{
		Scanner scaner=new Scanner(System.in);
		while(true){
			String input =scaner.nextLine();
			if(readers.size()>0){
			    readers.peekFirst().read(input);
			}
		}
	}
}

