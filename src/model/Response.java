/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TheNineInwKung
 */
public class Response {
    private int status;
    private String message;
    private User data;

    public Response(String text) {
        message = "Error"+text;
    }
    
    

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public User getData() {
        return data;
    }
    
}
