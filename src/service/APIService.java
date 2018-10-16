/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.File;
import model.Response;

/**
 *
 * @author TheNineInwKung
 */
public class APIService {
    final static String url_base = "http://www.9develop.com:12123";
    static {
        Unirest.setTimeouts(1000, 5000);

        Unirest.setObjectMapper(new ObjectMapper() {
            private Gson gson = new GsonBuilder().disableHtmlEscaping()
                    .create();

            @Override
            public <T> T readValue(String value, Class<T> valueType) {
                return gson.fromJson(value, valueType);
            }

            @Override
            public String writeValue(Object value) {
                return gson.toJson(value);
            }
        });
    }

    public static Response login(String username,String password){
    String url = url_base+"/api/user/login";
        try {
            HttpResponse<Response> jsonResponse = Unirest.post(url)
                    .header("accept", "application/json")
                    .field("username", username)
                    .field("password", password)
                    .asObject(Response.class);
            Response res = jsonResponse.getBody();
            return res;
        } catch (UnirestException ex) {
            System.out.println(ex.getMessage());
            Response res = new Response();
            res.setMessage(ex.getMessage());
            return res;
        }
				
    }
    public static String register(String username,String password,String name){
    String url = url_base+"/api/user/register";
        try {
            HttpResponse<Response> jsonResponse = Unirest.post(url)
                    .header("accept", "application/json")
                    .field("username", username)
                    .field("password", password)
                    .field("name", name)
                    .asObject(Response.class);
            return jsonResponse.getBody().getMessage();
        } catch (UnirestException ex) {
            return ex.getMessage();
        }
				
    }
    public static String register(String username,String password,String name,File file){
    String url = url_base+"/api/user/register/img";
        try {
            HttpResponse<Response> jsonResponse = Unirest.post(url)
                    .header("accept", "application/json")
                    .field("username", username)
                    .field("password", password)
                    .field("name", name)
                    .field("FileImg", file)
                    .asObject(Response.class);
            return jsonResponse.getBody().getMessage();
        } catch (UnirestException ex) {
            return ex.getMessage();
        }			
    }
}
