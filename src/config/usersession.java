/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;


public class usersession {
    private static usersession instance;

    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String role;
    private String password;
    private String status;
    private String address;
    private String image; 
    private String accnum;// Added image field
    private boolean loggedIn;
    private boolean userlogged;

    private usersession() {
        this.loggedIn = false;
        this.userlogged = false;
    }

    public static synchronized usersession getInstance() {
        if (instance == null) {
            instance = new usersession();
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAccNum() {
        return accnum;
    }

    public void setAccNum(String accnum) {
        this.accnum = accnum;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isUserlogged() {
        return userlogged;
    }

    public void setUserlogged(boolean userlogged) {
        this.userlogged = userlogged;
    }
    

    public void logout() {
        this.id = 0;
        this.firstname = null;
        this.lastname = null;
        this.username = null;
        this.email = null;
        this.role = null;
        this.password = null;
        this.status = null;
        this.address = null;
        this.image = null;
        this.loggedIn = false;
        this.userlogged = false;
    }
}
