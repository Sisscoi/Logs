package logs.lib;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logs {
	
	BufferedWriter writer;
	
	private static String getTime() { 
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();   
	    return formatter.format(date);
	}
	
	public void write(String data, String destination){
		try {
			writer = new BufferedWriter(new FileWriter(destination, true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String command = getTime() + " " + data;		
		try {
			writer.write(command + "\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
