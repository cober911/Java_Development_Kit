package Seminar1.lekc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ChatLogManager {
    private static final String LOG_FILE_NAME = "ChatLog.txt";

    public static void writeLog(String text) {
        try (FileWriter writer = new FileWriter(LOG_FILE_NAME, true)) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
    }

    public static void readLogFromFile(Chat chat) {
        try {
            File fileChatLog = new File(LOG_FILE_NAME);
            if (fileChatLog.exists()) {
                Scanner scanner = new Scanner(fileChatLog);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    chat.appendToChatHistory(line);
                }
                scanner.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла");
            e.printStackTrace();
        }
    }
}
