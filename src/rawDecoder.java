import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class rawDecoder {

    public static void main(String[] args) {

        String string = "0JTQvtCx0YDRi9C5INCy0LXRh9C10YAhDQoNCtCS0YHQtdCz0L4g0LfQsCDRgdC10LPQvtC00L3RjyDQsdGL0LvQviDQvtGC0YDQsNCx0L7RgtCw0L3QviA4INGHLg0K0JfQsNC00LDRh9C4LCDQstGL0L_QvtC70L3QtdC90L3Ri9C1INC30LAg0YHQtdCz0L7QtNC90Y86DQoNCioxLiA4ODggSG9sZGluZ3MgLSBQb2tlciAtIDYg0YcuKg0KDQoqVGFzayAxMjM0Mzc4OltNb2JpbGVdIDcuMTQgUmVncmVzc2lvbiBpT1MgLSBFeGVjdXRpb24qIC0gNSDRhy4NCg0KICAgLSBSZXN0cmljdGlvbnMNCiAgIC0gRXJyb3IgSGFuZGxpbmcNCiAgIC0gQ09NIE5ldHdvcmsgLSBSZWd1bGFyDQogICAtIE1hbHRhDQoNCipUYXNrIDExNTA2NzM6W01vYmlsZV0gQW5hbHl6ZSBBdXRvbWF0aW9uIG5pZ2h0bHkgcnVuKiAtIDEg0YcuDQoNCiAgIC0gZXhlY18yMDE3DQogICAtIGV4ZWNfMjAxNSAoTm90IGNvbXBsZXRlZCkNCg0KKtCf0YDQvtCy0L7QtNC40LvQvtGB0Ywg0L3QsCo6DQoNCiAgIC0gaVBob25lIFhTIC8vIGlPUyAxMi4wLjENCg0KKjIuINCS0L3Rg9GC0YDQtdC90L3QuNC1INC30LDQtNCw0YfQuCAtIDIg0YcuKg0KDQogICAtINCT0YDRg9C_LiDQutC-0L7RgNC00LjQvdCw0YLQvtGA0YHQutC40Lkg0LzQuNGC0LjQvdCzDQogICAtINCh0L7RgdGC0LDQstC70LXQvdC40LUg0L7RhtC10L3QutC4INC_0L4g0L_RgNC-0LXQutGC0YMgVG9tIEhvcm4gR2FtaW5nDQogICAtINCf0L7QtNCz0L7RgtC-0LLQutCwINC30LDQtNCw0L3QuNGPLCDQtNC-0LrRg9C80LXQvdGC0LDRhtC40Lgg0L_QviDQv9GA0L7QtdC60YLRgw0KDQoq0JfQsNC00LDRh9C4LCDQt9Cw0L_Qu9Cw0L3QuNGA0L7QstCw0L3QvdGL0LUg0L3QsCDRgdC70LXQtNGD0Y7RidC40Lkg0YDQsNCx0L7Rh9C40Lkg0LTQtdC90Yw6Kg0KODg4aG9sZGluZ3MuY29tIC0gUG9rZXINCg0KKtCi0LXQutGD0YnQuNC1INC_0YDQvtCx0LvQtdC80YsqOg0K0J3QtdGCDQoNCirQoSDRg9Cy0LDQttC10L3QuNC10LwsKg0K";

        // закодировать
        //final byte[] authBytes = string.getBytes(StandardCharsets.UTF_8);
        //final String encoded = Base64.getEncoder().encodeToString(authBytes);
        //System.out.println(string + " => " + encoded);

        //раскодировать
        final byte[] authBytes2 = string.getBytes(StandardCharsets.UTF_8);
        System.out.println("decodedBytes: " + new String(authBytes2));

        byte[] decodedBytes = Base64.getUrlDecoder().decode(authBytes2);
        System.out.println("decodedText: " + "\n" + new String(decodedBytes) + "\n" + "====EDN of Message====");
    }
}