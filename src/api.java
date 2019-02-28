import org.json.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;



public class api {
    public static void main(String[] args) throws Exception {
        URL apiURL = new URL("http://www.strokypozovnoidavnosti.in.ua/api/product/read_one.php?article=888");
        URLConnection yc = apiURL.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        String inputLine1 = "{ \"id\": \"Alice\"}";
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

        try {
            JSONObject obj = new JSONObject(inputLine1);
            String emailBody = obj.getString("id");
            System.out.println(emailBody);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
