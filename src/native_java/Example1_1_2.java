package native_java;

import java.io.*;
import java.util.*;

public class Example1_1_2{
	public static void main(String[] args) throws IOException{

		String strName;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(keyboard.readLine()); 

		System.out.println("What is your name? ");
		strName = keyboard.readLine();

		System.out.println("Welcome to native java: "+strName);

	}
}