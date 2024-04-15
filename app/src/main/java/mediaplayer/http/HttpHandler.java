package mediaplayer.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpHandler {
   
    public StringBuilder httpRequest(String method, String url)
    {

        StringBuilder r = new StringBuilder();

        try 
        {
            @SuppressWarnings("deprecation")
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod(method);

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) 
            {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) 
                {
                    response.append(inputLine);
                }
                in.close();

                System.out.println("Response: " + response.toString());
                
                r = response;
            } else 
            {
                System.out.println("GET request failed with response code: " + responseCode);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }

        return r;
    }
    
}
