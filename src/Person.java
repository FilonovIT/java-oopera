public class Person {
    protected String name; // имя
    protected String surname; // фамилия
    protected Gender gender; // пол

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}
