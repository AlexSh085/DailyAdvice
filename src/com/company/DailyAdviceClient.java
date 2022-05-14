package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {

    public static void main(String[] args) {

        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }

    public void go() {
        try {
            Socket s = new Socket("192.168.100.162", 4242);

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String advice = br.readLine();
            System.out.println("Today you must: " + advice);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
