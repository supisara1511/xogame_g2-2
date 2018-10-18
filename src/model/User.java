package model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FRAME
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
public class User {

    private String _id;
    private String username;
    private String name;
    private String temp;
    private String password;
    private String score;
    
    
   @JsonCreator public User(Map<String,Object> delegate) {
      _id = (String) delegate.get("_id");
      username = (String) delegate.get("username");
      name = (String) delegate.get("name");
      temp = (String) delegate.get("temp");
      score = (String) (""+delegate.get("score"));
   }

    public User(String username, String name, String temp, String password) {
        this.username = username;
        this.name = name;
        this.temp = temp;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    

}
