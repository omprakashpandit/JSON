import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


 
/**
 * @author Crunchify.com
 * 
 */
 
public class viswa {
	public static void main(String[] args) throws FileNotFoundException, JSONException {
		String jsonData = "";
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader("biswa.txt"));
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
			System.out.println("---------------------------------------");
		JSONObject obj = jsonArr.getJSONObject(i);
		String carton_no=((String)obj.getJSONObject("carton_no").get("value"));
		System.out.println("carton_no: " +carton_no);
		String rly=((String)obj.getJSONObject("rly").get("value"));
		System.out.println("rly: " +rly);
		String vcode=((String)obj.getJSONObject("vcode").get("value"));
		System.out.println("vcode: " +vcode);
		String po_no=((String)obj.getJSONObject("po_no").get("value"));
		System.out.println("po_no: " +po_no);
		String po_sr=((String)obj.getJSONObject("po_sr").get("value"));
		System.out.println("po_sr: " +po_sr);
		String pl_no=((String)obj.getJSONObject("pl_no").get("value"));
		System.out.println("pl_no: " +pl_no);
		String rr_type=((String)obj.getJSONObject("rr_type").get("value"));
		System.out.println("rr_type: " +rr_type);
		String lorry_no=((String)obj.getJSONObject("lorry_no").get("value"));
		/*if((String)obj.getJSONObject("lorry_no").get("value")==null)
		{
			lorry_no="";
		}
		else {
			obj.getJSONObject("lorry_no").get("value");
		}*/
		System.out.println("lorry_no: " +lorry_no);
		String challan_no=((String)obj.getJSONObject("challan_no").get("value"));
		System.out.println("challan_no: " +challan_no);
		String challan_dt=((String)obj.getJSONObject("challan_dt").get("value"));
		System.out.println("challan_dt: " +challan_dt);
		String fr_stn=((String)obj.getJSONObject("fr_stn").get("value"));
		System.out.println("fr_stn: " +fr_stn);
		String to_stn=((String)obj.getJSONObject("to_stn").get("value"));
		System.out.println("to_stn: " +to_stn);
		String manufacturer=((String)obj.getJSONObject("manufacturer").get("value"));
		System.out.println("manufacturer: " +manufacturer);
		String location=((String)obj.getJSONObject("location").get("value"));
		System.out.println("location: " +location);
		String batch_no=((String)obj.getJSONObject("batch_no").get("value"));
		System.out.println("batch_no: " +batch_no);
		String drug_code=((String)obj.getJSONObject("drug_code").get("value"));
		System.out.println("drug_code: " +drug_code);
		String mfg_date=((String)obj.getJSONObject("mfg_date").get("value"));
		System.out.println("mfg_date: " +mfg_date);
		String warranty_expiry=((String)obj.getJSONObject("warranty_expiry").get("value"));
		System.out.println("warranty_expiry: " +warranty_expiry);
		String carton_qty=((String)obj.getJSONObject("carton_qty").get("value"));
		System.out.println("carton_qty: " +carton_qty);
		
		}
		
		
	}
}