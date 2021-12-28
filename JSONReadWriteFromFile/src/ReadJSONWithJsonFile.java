import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;


public class ReadJSONWithJsonFile {
	 @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
		 File jsonInputFile = new File("test.json");
	        InputStream is;
	        try {
	            is = new FileInputStream(jsonInputFile);
	            // Create JsonReader from Json.
	            JsonReader reader = Json.createReader(is);
	            // Get the JsonObject structure from JsonReader.
	            JsonObject empObj = reader.readObject();
	            reader.close();
	            // read string data
	            System.out.println("Name:- " + empObj.getString("name"));
	            System.out.println("AGE:-"+  empObj.get("age"));
	          //  System.out.println("Author: " + empObj.getString("Author"));
	          
	            // read json array
	            JsonArray arrObj = empObj.getJsonArray("messages");
	            System.out.println("\nDirect Reports:");
	            for(JsonValue value : arrObj){
	                System.out.println(value.toString());
	            }
	             
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
       
}
