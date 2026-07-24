import java.util.ArrayList;

/* спектакль */
public class Show {
    protected String title; // название
    protected int duration; // длительность в минутах
    protected Director director; // режиссёр
    protected ArrayList<Actor> listOfActors = new ArrayList<>(); // список актёров

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }

    public void printListOfActors() {
        for (Actor actorArrayList : listOfActors) {
            System.out.println(title + " " + actorArrayList);
        }
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("В спектакле уже участвует этот актёр!");
        }
    }

    public void replacementActor(Actor actor/* кого будем менять */, Actor repActor /* на кого меняем */) {
        if (listOfActors.contains(actor)) {
            int index = listOfActors.indexOf(actor);
            listOfActors.set(index, repActor);
        } else {
            System.out.println("В спектакле не участвует этот актёр!");
        }



    }
}