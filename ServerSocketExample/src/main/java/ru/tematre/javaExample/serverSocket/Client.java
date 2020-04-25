package ru.tematre.javaExample.serverSocket;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args)
    {
        try {
            Socket clientSocket = null;
            BufferedReader in = null;
            BufferedWriter out  = null;
            try {

                clientSocket = new Socket("127.0.0.1", 4004);
                //  у сервера доступ на соединение
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                // читать соообщения с сервера
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // писать туда же
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                System.out.println("Вы что-то хотели сказать? Введите это здесь:");

                String word = reader.readLine();
                out.write(word + "\n");
                out.flush();
                String serverWord = in.readLine();
                System.out.println(serverWord);
            } finally {
                System.out.println("Клиент был закрыт...");
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
