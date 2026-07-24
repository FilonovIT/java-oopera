public class Theatre {

    public static void main(String[] args) {
        // создаем актеров
        Actor actor_1 = new Actor("Первый", "Первов", Gender.MALE, 1.85);
        Actor actor_2 = new Actor("Второй", "Второв", Gender.MALE, 1.65);
        Actor actor_3 = new Actor("Третья", "Третьева", Gender.FEMALE, 1.72);

        // создаем режиссёров
        Director director_1 = new Director("РежиссёрПервый", "РежиссёрПервый", Gender.MALE, 5);
        Director director_2 = new Director("РежиссёрВторой", "РежиссёрВторой", Gender.MALE, 15);

        // создаем автора музыки и хореографа
        Person personMusicAuthor = new Person("АвторМузыки", "АвторМузыки", Gender.MALE);
        Person personChoreographer = new Person("Хореограф", "Хореограф", Gender.FEMALE);

        // создаем шоу
        MusicalShow musicalShow = new MusicalShow("MusicalShow", 180, director_1, personMusicAuthor, "text");
        MusicalShow ballet = new Ballet("Ballet", 360, director_2, personMusicAuthor, "text", personChoreographer);
        MusicalShow opera = new Opera("Opera", 240, director_1, personMusicAuthor, "text", 100);

        // добавляем актёров в шоу
        musicalShow.addActor(actor_1);
        musicalShow.addActor(actor_2);

        ballet.addActor(actor_1);
        ballet.addActor(actor_2);
        ballet.addActor(actor_3);

        opera.addActor(actor_3);

        // вывод списков актёров
        System.out.println("-".repeat(100));
        musicalShow.printListOfActors();
        System.out.println("-".repeat(100));
        ballet.printListOfActors();
        System.out.println("-".repeat(100));
        opera.printListOfActors();
        System.out.println("-".repeat(100));

        // замена актёров
        System.out.println("Меняем актера №3 на актера №1. ");
        opera.replacementActor(actor_3, actor_1);
        opera.printListOfActors();

        System.out.println("-".repeat(100));
        System.out.println("Меняем актера №3 на актера №2. Актера №3 нет в спектакле.");
        opera.replacementActor(actor_3, actor_2);
        opera.printListOfActors();
        System.out.println("-".repeat(100));
        opera.printLibrettoText();
        System.out.println("-".repeat(100));
        ballet.printLibrettoText();
        System.out.println("-".repeat(100));
    }
}