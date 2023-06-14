import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Simple {

	public static void main(String[] args) throws FileNotFoundException, JSONException {
		String jsonData = "";
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader("zap.txt")); 
			while ((line = br.readLine()) != null) {
				jsonData += line + "\n";
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		// System.out.println("File Content: \n" + jsonData);
		JSONArray jsonArr = new JSONArray(jsonData);
		int len = jsonArr.length();
		//System.out.println("lenght"+len);
		
		for(int i = 0; i < len; i++) {	
		//JSONObject obj = new JSONObject(jsonData);
		System.out.println("-------------------------------------------------");
		System.out.println("\n->Name List:");
		JSONObject obj = jsonArr.getJSONObject(i);
		System.out.println("Id: " + obj.getInt("id"));
		System.out.println("name: " + obj.getString("name"));
		System.out.println("username: " + obj.getString("username"));
		System.out.println("phone: " + obj.getString("phone"));
		System.out.println("website: " + obj.getString("website"));
		
		
		System.out.println("\n->Address List:");
		System.out.println("street: " + obj.getJSONObject("address").getString("street"));
		System.out.println("city: " + obj.getJSONObject("address").getString("city"));
		System.out.println("zipcode: " + obj.getJSONObject("address").getString("zipcode"));
		System.out.println("\n->geo List:");
		System.out.println("lat: " + obj.getJSONObject("address").getJSONObject("geo").getString("lat"));
		System.out.println("lng: " + obj.getJSONObject("address").getJSONObject("geo").getString("lng"));
		
		System.out.println("\n->Company List:");
		System.out.println("company name: " + obj.getJSONObject("company").getString("name"));
		
		
		}
		
		
	}

}
