/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg6;

/**
 *
 * @author Harlin
 */

public abstract class Acc {
    protected String username, password;
    
//    protected InputStreamReader isr = new InputStreamReader(System.in);
//    protected BufferedReader br = new BufferedReader(isr);
//    protected int pilihan;
    
    public Acc(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
