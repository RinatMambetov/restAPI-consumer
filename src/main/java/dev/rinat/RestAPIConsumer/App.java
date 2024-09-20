package dev.rinat.RestAPIConsumer;

//https://reqres.in/

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://reqres.in/api/users/2";

        String response = restTemplate.getForObject(url, String.class);
        System.out.println(response);

        Map<String, String> jsonToSend = new HashMap<>();
        jsonToSend.put("name", "Rinat");
        jsonToSend.put("job", "Developer");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonToSend);
        url = "https://reqres.in/api/users";
        response = restTemplate.postForObject(url, request, String.class);
        System.out.println(response);

    }
}
