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
public class servico {
    
    private int id;
    private String nome;
    private int valor;
    private int qntfotos;
    private String dataini;
    private String datareal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQntfotos() {
        return qntfotos;
    }

    public void setQntfotos(int qntfotos) {
        this.qntfotos = qntfotos;
    }
       public String getDataini() {
        return dataini;
    }

    public void setDataini(String dataini) {
        this.dataini = dataini;
    }

    public String getDatareal() {
        return datareal;
    }

    public void setDatareal(String datareal) {
        this.datareal = datareal;
    }
    
    
}
