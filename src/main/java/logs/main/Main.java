package logs.main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import logs.lib.Logs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logs l = new Logs();
		l.write("[+] connection estabilished", "C:/Users/User1/MyBigProject/logs.txt");
		l.write("[+] succefully connected!", "C:/Users/User1/MyBigProject/logs.txt");

	}

}


/**
faire en sorte que la ligne precedente ne se reset pas et c bouclé
**/
