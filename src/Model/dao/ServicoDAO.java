/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;


import Model.BEan.servico;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author UERGS
 */
public class ServicoDAO {
    public void create(servico ser){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO servico (nome,valor,qntfotos,dataini,datareal) VALUES (?,?,?,?,?)");
            stmt.setString(1, ser.getNome());
            stmt.setDouble(2, ser.getValor());
            stmt.setInt(3, ser.getQntfotos());
            stmt.setString(4, ser.getDataini());
            stmt.setString(5, ser.getDatareal());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!!!");
            
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
     }
    public List<servico> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs=null;
        
        List<servico> servicos = new ArrayList<>();
         
        try {
            stmt=con.prepareStatement("SELECT * FROM servico");
            rs=stmt.executeQuery();
            
            
            
            while(rs.next()){
                
                servico servico = new servico();
                servico.setNome(rs.getString("nome"));
                servico.setValor(rs.getInt("Valor"));
                servico.setQntfotos(rs.getInt("Qntfotos"));
                servico.setDataini(rs.getString("Dataini"));
                servico.setDatareal(rs.getString("Datareal"));
                servicos.add(servico);
                
            }
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex);                         
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
       return servicos;       
    }
     public List<servico> readForNome(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs=null;
        
        List<servico> servicos = new ArrayList<>();
         
        try {
            stmt=con.prepareStatement("SELECT * FROM servico where nome LIKE ? ");
            stmt.setString(1, "%"+nome+"%");
            
            rs=stmt.executeQuery();
            
            
            
            while(rs.next()){
                
                servico servico = new servico();
                servico.setNome(rs.getString("nome"));
                servico.setValor(rs.getInt("Valor"));
                servico.setQntfotos(rs.getInt("Qntfotos"));
                servico.setDataini(rs.getString("Dataini"));
                servico.setDatareal(rs.getString("Datareal"));
                servicos.add(servico);
                JOptionPane.showMessageDialog(null,"Evento encontrado!!");
            }
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex);                         
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
       return servicos;       
    }
    }

