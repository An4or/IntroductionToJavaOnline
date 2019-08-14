package by.yakovtsev.introduction.tasks_6.task3;

import java.io.IOException;

/**
 * Created by Sasha on 11.02.2018.
 */
public class ArchivariusBot extends Client{

    public static void main(String[] args) {
        ArchivariusBot archivariusBot = new ArchivariusBot();
        archivariusBot.run();
    }
    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return "Archivarius";
    }

    public class BotSocketThread extends SocketThread{
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("\n1. Add new student \n" +
                            "2. Print all \n" +
                            "3. Edit student \n" +
                            "4. Exit");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {

            // Вывести в консоль текст полученного сообщения message
            System.out.println(message);

            // Получить из message имя отправителя и текст сообщения. Они разделены ": "
            String senderName = "";
            String senderMessageText;

            if (message.contains(": ")) {
                senderName = message.substring(0, message.indexOf(": "));
                senderMessageText = message.substring(message.indexOf(": ") + 2);
            }
            else {
                senderMessageText = message;
            }



            // Отправить ответ в зависимости от текста принятого сообщения. Если текст сообщения:
            if ("1".equalsIgnoreCase(senderMessageText)) {
                sendTextMessage("Enter name");
                String name = senderMessageText;
//
//
//                List<Student> students = new ArrayList<>();
            }
            else if ("2".equalsIgnoreCase(senderMessageText)) {
                String allStudent = ParserXML.readXML();
                sendTextMessage("Информация для " + senderName + ": " + ParserXML.readXML());
            }
//            else if ("3".equalsIgnoreCase(senderMessageText)) {
//
//            }
//            else if ("4".equalsIgnoreCase(senderMessageText)) {
//
//            }


        }

    }
    }

