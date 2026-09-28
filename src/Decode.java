import java.io.IOException;

public class Decode {
    private String input;

    public Decode(String input) {
        this.input = input;
    }

    public String decode() throws IOException {
        String output = "";
        StringBuffer sB = new StringBuffer();
        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i+=2) {
            String s = "" + ch[i] + ch[i+1];
            char c = (char)Integer.parseInt(s, 16);
            sB.append(c);
        }
        return output = sB.toString();
    }
}
