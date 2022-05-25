package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Programa {

	public static void main(String[] args) throws SQLException {
		
//		1. Abrir conexão com o banco de dados
		String url = "jdbc:sqlite:C:\\Users\\Aluno\\eclipse-workspace\\ExSQLite\\db\\primeiro_banco.db";
		Connection conexao = DriverManager.getConnection(url);
//		2. Criar comando e executar o SQL

		Statement comando = conexao.createStatement();
		String querySelect = "select * from cliente";
		ResultSet resultado = comando.executeQuery(querySelect);

//		3. Mostrar os dados
		while(resultado.next()) {
			int codigo = resultado.getInt(1);
			String Field3 = resultado.getString(2);
			String data_nasc = resultado.getString(3);
			String CPF = resultado.getString(4);
			String email = resultado.getString(5);
		
		
		System.out.println("Código: " + codigo);
		System.out.println("Nome: " + Field3);
		System.out.println("-----------------");

}
	
		
//		INSERT INTO pessoas (nome, sobrenome) VALUES ('João', 'Silva');
//		SELECT nome, sobrenome FROM pessoas WHERE peso > 50;
//		UPDATE pessoas SET nome = 'Pedro' WHERE nome = 'João';
//		DELETE FROM pessoas WHERE nome like 'Jo%';
		
	}
	
}
