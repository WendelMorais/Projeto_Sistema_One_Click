/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BEan;

/**
 *
 * @author UERGS
 */
public class opServico {
    
    private int id;
    private int clienteid;
    private int servicoID;
    

    
    
    public int getclienteid() {
        return clienteid;
    }

    public void setclieteid(int clienteid) {
        this.clienteid = clienteid;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServicoID() {
        return servicoID;
    }

    public void setServicoID(int servicoID) {
        this.servicoID = servicoID;
    }
    
    
}
