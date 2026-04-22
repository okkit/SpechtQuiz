package de.example.quizui.element;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class AppTextArea extends JTextArea {

	public AppTextArea() {
		super();
		initialize();
	}
	
    private void initialize() {
    	
        this.setLineWrap(true);
        setWrapStyleWord(true);
        setEditable(false);
        setFont(new Font("SansSerif", Font.PLAIN, 18));
        setBackground(Color.WHITE);
        setText(
                " Hier wird Info zu dem Thema der Frage stehen"
        );
    }
	

}
