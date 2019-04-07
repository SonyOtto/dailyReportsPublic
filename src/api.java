import org.json.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class api {

    private static String ID = "this is PSString";

    public static void main(String[] args) throws Exception {
        dublicater1("888");
    }

    public static String dublicater1 (String arg1) throws Exception {

        URL apiURL = new URL("http://www.strokypozovnoidavnosti.in.ua/api/product/read_one.php?article="+arg1);
        URLConnection yc = apiURL.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine = in.readLine();
        System.out.println("Всё что с JSON пришло: "+inputLine);
        in.close();

        try {
            JSONObject obj = new JSONObject(inputLine);
            String ID1 = obj.getString("id");
            System.out.println("ID: "+ID1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return(arg1);
    }
}
