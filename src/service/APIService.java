/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
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
    public static Response login(String username,String password){
    String url = url_base+"/api/user/login";
        try {
            HttpResponse<Response> jsonResponse = Unirest.post(url)
                    .header("accept", "application/json")
                    .field("username", username)
                    .field("password", password)
                    .asObject(Response.class);
            return jsonResponse.getBody();
        } catch (UnirestException ex) {
            return new Response(ex.getMessage());
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
