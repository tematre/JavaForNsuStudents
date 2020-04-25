package ru.tematre.javaExample.serverSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(4004);
            System.out.println("Сервер запущен!");


            Socket clientSocket = null;
            BufferedReader in = null;
            BufferedWriter out = null;

            try {

                clientSocket = server.accept();
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // и отправлять
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                String word = in.readLine(); // ждём пока клиент что-нибудь нам напишет
                System.out.println(word);
                // не долго думая отвечает клиенту
                out.write("Привет, это Сервер! Подтверждаю, вы написали : " + word + "\n");
                out.flush(); // выталкиваем все из буфера

            } catch (IOException e1) {
                e1.printStackTrace();
            } finally { // в любом случае сокет будет закрыт
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
