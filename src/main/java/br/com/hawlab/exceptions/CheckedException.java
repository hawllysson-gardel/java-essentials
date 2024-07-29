package br.com.hawlab.exceptions;

class CheckedCustomException extends Exception {
    public CheckedCustomException(String message) {
        super(message);
    }
}

public class CheckedException {
    public static void performCheckedOperation() throws CheckedCustomException {
        throw new CheckedCustomException("Checked Exception Occurred!");
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Exceptions (Checked)");

        try {
            performCheckedOperation();
        } catch (CheckedCustomException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("------------------------------------------");
    }
}
