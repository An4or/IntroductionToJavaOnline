package by.yakovtsev.introduction.tasks_6.task3;

import by.yakovtsev.introduction.ConsoleHelper;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<String, Connection>();

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                e.printStackTrace();
                ConsoleHelper.writeMessage("Сообщение не отправлено");
            }
        }
    }

    public static void main(String[] args) throws IOException {

//        ConsoleHelper.writeMessage("Введите порт сервера: ");
//        int serverPort = ConsoleHelper.readInt();

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8080);
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                //Слушаем
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                //запускаем handler
                handler.start();
            }
        } catch (IOException e) {
            serverSocket.close();
            e.printStackTrace();

        }

    }

    public static void startServer() throws IOException {
//        ConsoleHelper.writeMessage("Введите порт сервера: ");
//        int serverPort = ConsoleHelper.readInt();

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8080);
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                //Слушаем
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                //запускаем handler
                handler.start();
            }
        } catch (IOException e) {
            serverSocket.close();
            e.printStackTrace();

        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        public void run(){
            ConsoleHelper.writeMessage("Установленно соединение с адресом " + socket.getRemoteSocketAddress());
            try {
                Connection connection = new Connection(socket);
                ConsoleHelper.writeMessage("connect: " + connection.getRemoteSocketAddress());
                String userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                ConsoleHelper.writeMessage("connect close");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            connection.send(new Message(MessageType.NAME_REQUEST));
            Message messageResponse = connection.receive();

            while (!messageResponse.getType().equals(MessageType.USER_NAME) ||
                    messageResponse.getData().equals("") ||
                    connectionMap.containsKey(messageResponse.getData())) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                messageResponse = connection.receive();


            }
            connectionMap.put(messageResponse.getData(), connection);
            connection.send(new Message(MessageType.NAME_ACCEPTED));
            return messageResponse.getData();
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException {

//            for (String map : connectionMap.keySet()) {
//
//            }
            connectionMap.forEach((string, connect) -> {
                Message message = new Message(MessageType.USER_ADDED, string);
                if (!string.equals(userName)) {

                    try {
                        connection.send(message);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });

            }
    private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
        while (true) {
            Message message = connection.receive();
            if (message.getType() == MessageType.TEXT) {
                sendBroadcastMessage((new Message(MessageType.TEXT, userName + ": " + message.getData())));
            }else
                ConsoleHelper.writeMessage("error");
        }
    }
}

}


