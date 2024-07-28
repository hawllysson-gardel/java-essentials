package br.com.hawlab.access_modifiers;

public class Protected {
    protected String text;

    public Protected(String text) {
        this.text = text;
    }

    protected String getText() {
        return text;
    }

    protected void setText(String text) {
        this.text = text;
    }
}
