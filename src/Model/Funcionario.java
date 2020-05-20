/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author gabi0
 */
public class Funcionario {
    //identificação do brinquedo no banco de dados
    private String nome;
    
    private String cpf;
    private Date dataNascimento;
    private String telefone;
    private String email;
    
    private int gerenteLogin;

    
    public Funcionario (String nome, String cpf, Date dataNascimento, String telefone, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }
    
    public Funcionario(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGerenteLogin() {
        return gerenteLogin;
    }

    public void setGerenteLogin(int gerenteLogin) {
        this.gerenteLogin = gerenteLogin;
    }

    
}
