package de.example.quizdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Dies ist ein Programm zum Erstellen einer MySQL Datenbank f�r das Projekt
 * SpechtQuiz
 */
public class SchemaCreator2 {

// Die Zugangsdaten im Sourcecode zu halten ist eine sehr unsichere Sache.
// Ein Weg, dies sicher zu gestalten, ist die notwendigen Daten als
// Umgebungsvariablen in der Run-Configuration zu definieren.
// Dafür: Rechte Maustaste auf den File im Package-Explorer ->
// Run as -> Run Configurations... 
// Im Menübereich Environment folgende Einträge machen (add Button nutzen):
// Variable: 	DB_URL
// Value:		jdbc:mysql:// localhost:3306/spechtquiz;
// usw.

	private static final String URL = System.getenv("DB_URL");
	private static final String USER = System.getenv("DB_USER");
	private static final String PASSWORD = System.getenv("DB_PASSWORD");

	// Im SQL-Skript stehen Apostrofen: DROP SCHEMA IF EXISTS `spechtquiz` ;
	// Diese m�ssen entfernt werden.
	private static String CREATE_SHEMA_SPECHTQUIZ = "DROP SCHEMA IF EXISTS spechtquiz; "
			+ "CREATE SCHEMA IF NOT EXISTS spechtquiz;";

	private static String CREATE_TABLE_QUIZ = "CREATE TABLE IF NOT EXISTS spechtquiz.Quiz "
			+ "(id INT NOT NULL AUTO_INCREMENT, " + "title VARCHAR(45) NOT NULL, "
			+ "PRIMARY KEY (id));";

	private static String CREATE_TABLE_QUESTION = "CREATE TABLE IF NOT EXISTS spechtquiz.Question "
			+ "(id INT NOT NULL AUTO_INCREMENT, "
			+ "text VARCHAR(500) NOT NULL, score INT NULL, Quiz_id INT NOT NULL,  "
			+ "PRIMARY KEY (id, Quiz_id),"
			+ "CONSTRAINT fk_Question_Quiz FOREIGN KEY (Quiz_id) REFERENCES spechtquiz.Quiz (id))";

	private static String CREATE_TABLE_ANSWER = "CREATE TABLE IF NOT EXISTS spechtquiz.Answer ("
			+ "  id INT NOT NULL AUTO_INCREMENT," + "  text VARCHAR(80) NOT NULL,"
			+ "  correct TINYINT NOT NULL," + "  Question_id INT NOT NULL,"
			+ "  Question_Quiz_id INT NOT NULL,"
			+ "  PRIMARY KEY (id, Question_id, Question_Quiz_id),"
			+ "  INDEX fk_Answer_Question_idx (Question_id ASC, Question_Quiz_id ASC),"
			+ "  CONSTRAINT fk_Answer_Question" + "  FOREIGN KEY (Question_id , Question_Quiz_id)"
			+ "  REFERENCES spechtquiz.Question (id , Quiz_id))";

	public static void main(String[] args) {

		if (URL == null || USER == null || PASSWORD == null) {
			System.out.println("Fehler: DB_URL, DB_USER oder DB_PASSWORD ist nicht gesetzt.");
			return;
		}

		System.out.println(URL);
		System.out.println(USER);
		System.out.println("[" + PASSWORD + "]");

		// Verbindung zu der Datenbank herstellen
		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

			// Um SQL-Commandos abzusetzen, brauchen wir die Instanz der Klasse Statement
			Statement stmt = con.createStatement();

			// Die Klasse Statement ist in der Lage ein SQL-Befehl abzusetzen (die Methode
			// execute)
			stmt.execute(CREATE_SHEMA_SPECHTQUIZ);
			System.out.println("Databes is created");

			stmt.execute(CREATE_TABLE_QUIZ);
			System.out.println("Table Quiz is created");

			stmt.execute(CREATE_TABLE_QUESTION);
			System.out.println("Table Question is created");

			stmt.execute(CREATE_TABLE_ANSWER);
			System.out.println("Table Answer is created");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
