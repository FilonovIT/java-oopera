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
                "height=" + height +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }


    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Actor actor)) return false;
        return Double.compare(height, actor.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }
}
