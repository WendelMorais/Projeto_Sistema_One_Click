/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.BEan.cliente;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author UERGS
 */
public class ClienteDAO {
    
    public void create(cliente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome,cpf,endereco,telefone) VALUES (?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setInt(2, c.getCpf());
            stmt.setString(3, c.getEndereco());
            stmt.setInt(4,c.getTelefone());
            
            stmt.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Salvo com sucesso!!!");
                    } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
             
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<cliente> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs=null;
        
        List<cliente> clientes = new ArrayList<>();
         
        try {
            stmt=con.prepareStatement("SELECT * FROM cliente");
            rs=stmt.executeQuery();
            
            
            
            while(rs.next()){
                
                cliente cliente = new cliente();
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getInt("cpf"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getInt("telefone"));
                cliente.setId(rs.getInt("id"));
                clientes.add(cliente);
                
            }
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex);                         
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
       return clientes;       
    }
    
     public void update (cliente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cliente SET nome = ?,cpf = ?,endereco = ?,telefone = ? where id = ?");
            stmt.setString(1, c.getNome());
            stmt.setInt(2, c.getCpf());
            stmt.setString(3, c.getEndereco());
            stmt.setInt(4,c.getTelefone());
           stmt.setInt(5, c.getId());
            
            stmt.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!!");
                    } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
             
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     
     public void delete (cliente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE from cliente where id = ?");
           
           stmt.setInt(1, c.getId());
            
            stmt.executeUpdate();
            
             JOptionPane.showMessageDialog(null, "Excluido com sucesso!!!");
                    } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir: "+ex);
             
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
