import org.json.JSONObject;

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
        //String inputLine = "{\"id\" : \"Alice\"}";
        System.out.println("Всё что с JSON пришло: "+inputLine);
                in.close();

            JSONObject obj = new JSONObject(inputLine); //comment
            String ID1 = obj.getString("id");
            System.out.println("ID: "+ID1);

        return(ID1);
    }
}
