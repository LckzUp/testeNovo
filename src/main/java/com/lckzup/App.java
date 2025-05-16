package com.lckzup;

import com.lckzup.conexao.Conexao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        
        Conexao conexao = new Conexao();

        conexao.getConexao();
    }
}
