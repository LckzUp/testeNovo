package com.lckzup.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    //atributos do protocolo de conexão com o banco de dados
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String password = "";

    private Connection conexao;

    //metodo para criar a conexao com o banco de dados
    public void getConexao() {

        try {
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem sucedida!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Conexão mal sucedida!");
        }
    }



}
