package Utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class payloadconvertor {

	public static String generatepayload(String filename) throws IOException
	{
		
		String filepath = "C:\\Users\\User\\eclipse-workspace\\API-Framework-restassured\\src\\main\\java\\resource\\"+filename;
		
		//This is the one which will convert the json format in to string format.
		return new String(Files.readAllBytes(Paths.get(filepath)));
		
	}
}
