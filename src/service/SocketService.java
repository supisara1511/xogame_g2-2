/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TheNineInwKung
 */
public class SocketService {
    private Socket socket;
    private final String url = "http://9develop.com:12123";

    public SocketService(String id) {
        IO.Options opts = new IO.Options();
        opts.query = "id="+id;
        try {
            socket = IO.socket(url,opts);
            socket.on(Socket.EVENT_CONNECT, new Emitter.Listener(){
                @Override
                public void call(Object... os) {
                    System.out.println("connect to server success.");
                }
            });
            socket.connect();
        } catch (URISyntaxException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Socket getSocket() {
        return socket;
    }
    
    
}
