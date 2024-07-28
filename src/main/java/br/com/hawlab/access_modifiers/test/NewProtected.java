package br.com.hawlab.access_modifiers.test;

import br.com.hawlab.access_modifiers.Protected;

public class NewProtected extends Protected {

    public NewProtected(String text) {
        super(text);
    }

    public String getNewProtectedText() {
        return text;
    }

    public void setNewProtectedText(String text) {
        this.text = text;
    }
}
