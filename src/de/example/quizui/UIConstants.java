package de.example.quizui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public abstract class UIConstants {

	// Textfonts für die gesamte App gültig
	public static final Font FONT_TEXT = new Font("Calibri", Font.PLAIN, 20);
	public static final Font FONT_TEXT_BOLD = new Font("Calibri", Font.BOLD, 20);
	public static final Font FONT_HEADER = new Font("Calibri", Font.PLAIN, 30);
	
	// Farben
	public static final Color TEXT_COLOR_STANDARD = Color.BLACK;
	public static final Color TEXT_COLOR_SUCCESS = Color.GREEN;
	public static final Color TEXT_COLOR_ERROR = Color.RED;
	
	public static final Color BACK_GROUND_STANDARD = new Color(40, 40, 40);
	public static final Color BACK_GROUND_ACSENT = new Color(10, 20, 30);
	
	
	// QuizFrame-Konstanten
	public static final String APP_TITLE = "SpechtQuiz";
	public static final Dimension FRAME_DIMENSION = new Dimension(900, 800);

	// QuestionPanel-Konstanten
	public static final MatteBorder QP_MATTE_BORDER = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(180, 180, 180));
	public static final Border QP_EMPTY_BORDER = BorderFactory.createEmptyBorder(20, 20, 20, 20);
	
	// AnswerPanel-Konstanten
	public static final Border AP_EMPTY_BORDER = BorderFactory.createEmptyBorder(20, 30, 20, 30);
	
	// HeaderPanel-Konstanten
	static Border outsideBorder = BorderFactory.createLineBorder(new Color(180, 180, 180), 1);
	static Border insideBorder = BorderFactory.createEmptyBorder(10, 15, 10, 15);
	public static final Border HP_COMPOUD_BORDER = BorderFactory.createCompoundBorder(outsideBorder, insideBorder);
}
