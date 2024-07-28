package br.com.hawlab.access_modifiers;

public class Private {
    private String text;

    public Private(String text) {
        this.text = text;
    }

    private String getText() {
        return text;
    }

    private void setText(String text) {
        this.text = text;
    }
}
