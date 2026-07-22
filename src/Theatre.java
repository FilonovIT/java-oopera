import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor_1 = new Actor("Первый", "Первов", Gender.MALE, 1.85);
        Actor actor_2 = new Actor("Второй", "Второв", Gender.MALE, 1.65);
        Actor actor_3 = new Actor("Третья", "Третьева", Gender.FEMALE, 1.72);

        Director director_1 = new Director("Директор_1", "Директор_1", Gender.MALE, 5);
        Director director_2 = new Director("Директор_2", "Директор_2", Gender.MALE, 15);

        Person personMusik = new Person("", "", Gender.MALE);
        Person personChoreographer = new Person("", "", Gender.FEMALE);

        Show musicalShow = new MusicalShow("title", 180, director_1, personMusik, "text");
        Show ballet = new Ballet("title", 360, director_2, personMusik, "text", personChoreographer);
        Show opera = new Opera("title", 240, director_1, personMusik, "text", 100);

        musicalShow.addActor(musicalShow, actor_1);
        musicalShow.addActor(musicalShow, actor_2);

        ballet.addActor(ballet, actor_1);
        ballet.addActor(ballet, actor_2);
        ballet.addActor(ballet, actor_3);

        opera.addActor(opera, actor_3);
    }
}