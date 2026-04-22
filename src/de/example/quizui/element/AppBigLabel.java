package de.example.quizui.element;

import de.example.quizui.UIConstants;

public class AppBigLabel extends AppLabel {

	public AppBigLabel(String text) {
		super(text);
	}

	   public AppBigLabel(String string, int right) {
		super(string, right);
	}

	   /**
     * Initialisiert gemeinsame Basiseigenschaften des Labels.
     */
    protected void initialize() {
        setForeground(UIConstants.TEXT_COLOR_STANDARD);
        setFont(UIConstants.FONT_HEADER);
    }


}
