package br.com.hawlab.access_modifiers.test;

import br.com.hawlab.access_modifiers.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Access Modifiers");

        Public publicExample = new Public("Public");
        Private privateExample = new Private("Private");
        Protected protectedExample = new Protected("Protected");
        Default defaultExample = new Default("Default");

        NewProtected newProtectedExample = new NewProtected("New Protected");

        System.out.println(publicExample.text);
        publicExample.setText("New Public");
        System.out.println(publicExample.getText());
        System.out.println(publicExample.text);

        System.out.println(newProtectedExample.getNewProtectedText());
        newProtectedExample.setNewProtectedText("New NewProtected");
        System.out.println(newProtectedExample.getNewProtectedText());

        /*
        ERROR

        System.out.println(privateExample.text);
        privateExample.setText("New Private");
        System.out.println(privateExample.getText());
        System.out.println(privateExample.text);

        System.out.println(protectedExample.text);
        protectedExample.setText("New Protected");
        System.out.println(protectedExample.getText());
        System.out.println(protectedExample.text);

        System.out.println(newProtectedExample.text);
        newProtectedExample.setText("New Public");
        System.out.println(newProtectedExample.getText());
        System.out.println(newProtectedExample.text);

        System.out.println(defaultExample.text);
        defaultExample.setText("New Default");
        System.out.println(defaultExample.getText());
        System.out.println(defaultExample.text);
        */

        System.out.println("------------------------------------------");
    }
}