import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private boolean isRunning = true;

    public App() {
    }

    public void run() {
        while (isRunning) {
            Scanner input = new Scanner(System.in);
            System.out.println("indtast 1 for encoding || indtast 2 for decoding || indtast 0 for at lukke program");
            try {
                try {
                    switch (input.nextInt()) {
                        case 0:
                            isRunning = false;
                            break;
                        case 1:
                            input.nextLine();
                            System.out.println("skriv din besked");
                            Encode encode = new Encode(input.nextLine());
                            System.out.println(encode.encode());
                            break;

                        case 2:
                            input.nextLine();
                            System.out.println("skriv hexa decimaler");
                            Decode decode = new Decode(input.nextLine());
                            System.out.println(decode.decode());
                            break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("ugyldigt info");
                }
            } catch (InputMismatchException e) {
                System.out.println("ugyldt info");
                continue;
            }
        }
    }
}
