/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author gabi0
 */
public class Brinquedo {
    //identificação do brinquedo no banco de dados
    private String codigo;
    private String nome;
    private String quantidade;
    
    public Brinquedo (String codigo, String nome, String quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    public Brinquedo(){
        
    }
    
    
    //getters e setters
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(){
        this.codigo = codigo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
