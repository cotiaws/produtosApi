package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection getConnection() throws Exception {

		// parâmetros para conexão com o banco de dados
		var host = "jdbc:postgresql://servercoti.postgres.database.azure.com:5432/bd_produtosapi";
		var user = "usuariocoti";
		var pass = "Coti@2025";

		// retornar uma conexão
		return DriverManager.getConnection(host, user, pass);
	}
}
