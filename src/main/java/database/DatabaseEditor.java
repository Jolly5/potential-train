package database;

import java.util.ArrayList;

import question.Question;

public final class DatabaseEditor {
	
	private static DatabaseConnector con = new DatabaseConnector();
	
	public static void main(String[] args) {
		/*addQuestion(
				"Wie hei�en Markus M�llers S�hne",
				"Ludwig & Lorenz",
				"Jonas & Justus",
				"Bj�rn & Benjamin");*/
	}
	
	public static void addQuestion(String question, String a1, String a2, String a3) {
		ArrayList<String> list = new ArrayList<>(3);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		con.addQuestion(new Question(question, list));
	}
	
}
