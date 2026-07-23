import java.util.Objects;

/* актёр */
public class Actor extends Person {
    private double height; // рост

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                '}';
    }

   @Override
    public boolean equals(Object object) {
        if (this == object) return true; // проверка адресов объектов
        if (object == null) return false; // проверка на null
        if (this.getClass() != object.getClass()) return false; // проверка на соответствие классу
        Actor actor = (Actor) object; // доступ к полям
        return Objects.equals(name, actor.name) && // поля
                Objects.equals(surname, actor.surname) &&
                (height == actor.height); // примитивное
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
