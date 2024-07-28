package br.com.hawlab.access_modifiers;

public class Default {
    String text;

    public Default(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }
}
