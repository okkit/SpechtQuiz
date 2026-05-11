package de.example.quizui.element;

import de.example.quizui.UIConstants;

public class AppBigLabel extends AppLabel {

	public AppBigLabel(String text) {
		super(text);
	}

	/**
	 * 
	 * @param string
	 * @param right aligment in parent-Component
	 */
	   public AppBigLabel(String string, int aligment) {
		super(string, aligment);
	}

	   /**
     * Initialisiert gemeinsame Basiseigenschaften des Labels.
     */
    protected void initialize() {
        setForeground(UIConstants.TEXT_COLOR_STANDARD);
        setFont(UIConstants.FONT_HEADER);
    }


}
