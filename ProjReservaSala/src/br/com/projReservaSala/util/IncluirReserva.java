package br.com.projReservaSala.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.projReservaSala.conexao.Conexao;

public class IncluirReserva {
	
	private Connection connection;
	
	public  IncluirReserva () {
		connection = Conexao.getConnection();
		
	}


/**
 * @param reserva
 * @return
 * @throws SQLException
 */
public boolean inserir(Reserva reserva) throws SQLException {

	try {

		PreparedStatement stmt = this.connection
				.prepareStatement("INSERT INTO TB_RESERVA (descricao, dataCadastro, dataReserva, hora) values (?, ?, ?, ?)");

		stmt.setString(1, reserva.getDescricao());
		stmt.setString(2, reserva.getDataCadastro());
		stmt.setString(3, reserva.getDataReserva());
		stmt.setString(4, reserva.getHora());
		stmt.execute();
		return true;

	} catch (SQLException e) {
		System.err.println(e.toString());
	} finally {

		connection.close();

	}
	return false;

}
}
