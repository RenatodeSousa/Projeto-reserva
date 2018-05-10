package br.com.projReservaSala.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.projReservaSala.conexao.Conexao;

public class testeConexao {
	
	private static Connection connection;
	
	public static void main(String[] args) throws SQLException {
		connection = Conexao.getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
	}

}
