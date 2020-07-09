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
public class cliente {
    
    private int id;
    private int cpf;
    private String nome;
    private String endereco;
    private int telefone;

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    private opServico opServico;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public opServico getOpServico() {
        return opServico;
    }

    public void setOpServico(opServico opServico) {
        this.opServico = opServico;
    }
    
    
    
}
