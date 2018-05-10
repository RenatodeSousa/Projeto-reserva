package br.com.projReservaSala.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.projReservaSala.conexao.Conexao;
import br.com.projReservaSala.util.Reserva;

public class TesteInserir {
private Connection connection;
	
	public  TesteInserir () {
		connection = Conexao.getConnection();
		 System.out.println("Tudo pronto!");
	
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

		stmt.setString(1, "testdescricao");
		stmt.setString(2, "testDatacad");
		stmt.setString(3, "testedatreserva");
		stmt.setString(4, "testhora");
		stmt.execute();
		 System.out.println("Iserido com sucesso!");
		return true;

	} catch (SQLException e) {
		System.err.println(e.toString());
	} finally {

		connection.close();

	}
	return false;


}
}
