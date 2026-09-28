import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private boolean isRunning = true;
    private String RED_TEXT = "\u001B[31m";
    private String BLACK_BG = "\u001B[40m";
    private String RESET = "\u001B[0m";
    private String GREEN_TEXT = "\u001B[32m";

    public App() {
    }

    public void run() {
        while (isRunning) {
            Scanner input = new Scanner(System.in);
            System.out.println(GREEN_TEXT + "indtast 1 for encoding || indtast 2 for decoding || indtast 0 for at lukke program" + RESET);
            try {
                try {
                    switch (input.nextInt()) {
                        case 0:
                            isRunning = false;
                            break;
                        case 1:
                            input.nextLine();
                            System.out.println(GREEN_TEXT + "--skriv din besked--" + RESET);
                            Encode encode = new Encode(input.nextLine());
                            System.out.println(RED_TEXT + BLACK_BG + encode.encode() + RESET);
                            break;

                        case 2:
                            input.nextLine();
                            System.out.println("--skriv hexa decimaler--");
                            Decode decode = new Decode(input.nextLine());
                            System.out.println(RED_TEXT + BLACK_BG + decode.decode() + RESET);
                            break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println(RED_TEXT + "ugyldigt info" + RESET);
                }
            } catch (InputMismatchException e) {
                System.out.println(RED_TEXT + "ugyldt info" + RESET);
                continue;
            }
        }
    }
}
