package br.com.hawlab.access_modifiers;

public class Public {
    public String text;

    public Public(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
