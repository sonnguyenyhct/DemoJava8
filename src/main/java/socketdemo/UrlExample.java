package socketdemo;

import java.io.*;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class UrlExample {
    public static void main(String[] args) throws UnknownHostException {
        try {
            URL url = new URL("https://www.w3schools.com/");
            System.out.println(url.getAuthority());
            System.out.println(url.getPath());
            System.out.println(url.getFile());
            System.out.println(url.getHost());

            URLConnection urlConnection = url.openConnection();
            BufferedReader  br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
             while((line = br.readLine()) != null){
                 sb.append(line + "\n");
             }
            System.out.println(sb.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());

    }
}
