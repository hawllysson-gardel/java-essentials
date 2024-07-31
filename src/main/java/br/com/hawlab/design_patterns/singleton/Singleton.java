package br.com.hawlab.design_patterns.singleton;

class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Conectado ao MySQL!");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Design Patterns (Singleton)");

        DatabaseConnection instance1 = DatabaseConnection.getInstance();
        System.out.println("Instance 1: " + instance1);

        DatabaseConnection instance2 = DatabaseConnection.getInstance();
        System.out.println("Instance 2: " + instance2);

        System.out.println("------------------------------------------");
    }
}
