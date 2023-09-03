import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class test_api {
    static HttpClient httpClient = HttpClient.newBuilder()
            .build();

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder(new URI("https://api.nationalize.io/?name=nathaniel")).build();
        var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

//        File file = new File("output.json");
//        FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write(response.body());
//        fileWriter.flush();
//        fileWriter.close();
    }
}
