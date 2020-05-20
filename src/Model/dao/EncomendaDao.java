/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.Encomenda;
import Model.MySqlConnector;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabi0
 */
public class EncomendaDao extends Dao {

    //Construtor que inicializa a conexão com o banco de dados
    public EncomendaDao() {
        this.connection = MySqlConnector.getConnection();
    }

    //Através de uma instância da encomenda cria uma nova encomenda no banco
    public boolean cadastrarEncomenda(Encomenda encomenda) {
        try {
            //Insere uma nova encomenda no banco de dados através da Query SQL
            //Caso insira com sucesso, retorna true, senão, false
            this.statement = this.connection.createStatement();
            String query = "INSERT INTO Encomenda (codigo, nome, descricao "
                    + "quantidade) "
                    + "VALUES ('"
                    + encomenda.getCodigo() + "','" + encomenda.getNome() + "','" 
                    + encomenda.getDescricao() + "','" + encomenda.getQuantidade();
            this.statement.executeUpdate(query);
            return true;
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
            return false;
        }
    }

    //Atualiza enccomenda. Caso atualize com sucesso,
    //retorna true, senão, false
    public boolean editarEncomenda(Encomenda encomenda) {
        try {
            this.statement = this.connection.createStatement();
            String queryAtualizar = "UPDATE Encomenda SET "
                    + "codigo = " + encomenda.getCodigo() + "nome = " + '"' + encomenda.getNome() + "descricao = " 
                    + encomenda.getDescricao() + "quantidade = " + encomenda.getQuantidade();

            this.statement.executeUpdate(queryAtualizar);
            return true;
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
            return false;
        }
    }

    //Deleta a encomenda. Caso delete com sucesso retorna true, senão, false
    public boolean excluirEncomenda(Encomenda encomenda) {
        try {
            this.statement = this.connection.createStatement();
            String queryDeletar = "DELETE FROM Encomenda";
            this.statement.executeUpdate(queryDeletar);
            return true;
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
            return false;
        }
    }
}
