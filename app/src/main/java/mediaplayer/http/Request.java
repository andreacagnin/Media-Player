package mediaplayer.http;

public class Request {

    public Request(){}

    public StringBuilder sendRequest(String method, String uri){
        HttpHandler http = new HttpHandler();
        return http.httpRequest(method, uri);
    }
    
}
