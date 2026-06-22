package de.example.quizdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.example.quizdata.objects.Quiz;

public class MySqlDataManager implements QuizDataManager {

	@Override
	public Quiz getQuiz() {
		return null;
	}

	@Override
	public List<Quiz> getQuizList() {

// Alle geladenen Quize werden in einer Liste gespeichert
		List<Quiz> quizList;

// Zu der DB connecten - mit der Datenbank verbinden

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/spechtquiz", "root", "")) {

// Eine SQL-Query = ein SQL-Statement definieren
			String sqlStmt = "SELECT * FROM spechtquiz.quiz;";

// Das SQL-Statement erzeugen			
			PreparedStatement stmt = connection.prepareStatement(sqlStmt);

// Das SQL-Statement absetzen und ein Result erhalten
			ResultSet result = stmt.executeQuery();

//	Wenn nichts aus der DB angekommen ist, return mit null
			if (result == null)
				return null;
			
			quizList = new ArrayList<Quiz>();
// Das erhaltene Result auf ein Java-Objekt mappen
			Quiz q;
			while (result.next()) {
				String title = result.getString("title");
				q = new Quiz(title);
				q.setId(result.getInt("id"));
				quizList.add(q);
			}
// Die Liste mit den Quizen zurückliefern
			return quizList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
