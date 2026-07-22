import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* спектакль */
public class Show {
    protected String title; // название
    protected int duration; // длительность в минутах
    protected Director director; // режиссёр
    protected Map<Show, Actor> listOfActors; // список актёров

    public Show() {
        }

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

//    public void printListOfActors() {
//        for (Actor actorArrayList : listOfActors) {
//            System.out.println(actorArrayList.toString());
//        }
//    }

    public void addActor(Show show, Actor actor) {

        listOfActors = new HashMap<>();
        listOfActors.put(show, actor);
    }
}