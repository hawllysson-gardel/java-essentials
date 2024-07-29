package br.com.hawlab.exceptions;

class UncheckedCustomException extends RuntimeException {
    public UncheckedCustomException(String message) {
        super(message);
    }
}

public class UncheckedException {
    public static void performUncheckedOperation() {
        throw new UncheckedCustomException("Unchecked Exception Occurred!");
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Exceptions (Unchecked)");

        try {
            performUncheckedOperation();
        } catch (UncheckedCustomException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("------------------------------------------");
    }
}
