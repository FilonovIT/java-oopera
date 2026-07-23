public class Theatre {

    public static void main(String[] args) {
        Actor actor_1 = new Actor("Первый", "Первов", Gender.MALE, 1.85);
        Actor actor_2 = new Actor("Второй", "Второв", Gender.MALE, 1.65);
        Actor actor_3 = new Actor("Третья", "Третьева", Gender.FEMALE, 1.72);

        Actor actor_4 = new Actor("Первый", "Первов", Gender.MALE, 1.85);

        Actor actor_5 = new Actor("Замена", "Замена", Gender.FEMALE, 1.55);

        System.out.println(actor_1.equals(actor_4));

        Director director_1 = new Director("Директор_name_1", "Директор_1", Gender.MALE, 5);
        Director director_2 = new Director("Директор_2", "Директор_2", Gender.MALE, 15);

        Person personMusicAuthor = new Person("", "", Gender.MALE);
        Person personChoreographer = new Person("", "", Gender.FEMALE);

        Show musicalShow = new MusicalShow("Music", 180, director_1, personMusicAuthor, "text");
        Show ballet = new Ballet("Ballet", 360, director_2, personMusicAuthor, "text", personChoreographer);
        Show opera = new Opera("Opera", 240, director_1, personMusicAuthor, "text", 100);

        musicalShow.addActor(actor_1);
        musicalShow.addActor(actor_2);

        ballet.addActor(actor_1);
        ballet.addActor(actor_2);
        ballet.addActor(actor_3);
        ballet.addActor(actor_1); // одинаковый актер

        opera.addActor(actor_3);

        System.out.println("*****************************************");
        musicalShow.printListOfActors();
        System.out.println("*****************************************");
        ballet.printListOfActors();
        System.out.println("*****************************************");
        opera.printListOfActors();
        System.out.println("*****************************************");

        opera.replacementActor(actor_3, actor_5);
        opera.printListOfActors();
    }
}