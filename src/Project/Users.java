/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author MrGodleSS
 */
public abstract class Users {
    
    private String name;
    private long ID;

    public Users(String name, long ID) {
        this.name =name;
        this.ID = ID;
    }
     public void setName(String name) {
        this.name = name;
    }

    public void setID(long ID) {
        
        this.ID = ID;
    }

    public String getName() {
        return name;
    }
    
    public long getID() {
        return ID;
    }
}
