import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Encode {
    private String input;

    public Encode(String input){
        this.input = input;
    }


    public String encode() throws IOException {
        String output = "";
        byte[] byteArray = input.getBytes(StandardCharsets.UTF_8);
        StringBuffer sB = new StringBuffer();
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            String hex = Integer.toHexString(ch[i]);
            sB.append(hex);
        }
        return output = sB.toString();
    }
}
