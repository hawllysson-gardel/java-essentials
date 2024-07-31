package br.com.hawlab.design_patterns.facade;

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is on.");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void off() {
        System.out.println("DVD Player is off.");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is on.");
    }

    public void setInput(DVDPlayer dvd) {
        System.out.println("Projector input set to DVD Player.");
    }

    public void off() {
        System.out.println("Projector is off.");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sound System is on.");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to " + level);
    }

    public void off() {
        System.out.println("Sound System is off.");
    }
}

class Lights {
    public void dim(int level) {
        System.out.println("Lights dimmed to " + level + "%.");
    }
}

class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        soundSystem.on();
        soundSystem.setVolume(5);
        projector.on();
        projector.setInput(dvdPlayer);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.dim(100);
        soundSystem.off();
        projector.off();
        dvdPlayer.off();
    }
}

public class Facade {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Design Patterns (Facade)");

        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();

        System.out.println("------------------------------------------");
    }
}
