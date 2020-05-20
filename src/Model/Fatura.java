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
public class Fatura {
    //identificação do brinquedo no banco de dados
    private String codigo;
    
    private String nome;
    private String valor;
    private String descricao;
    
    public Fatura (String codigo, String nome, String valor, String descricao){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }
    
    public Fatura(){
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
       
}
