import java.util.ArrayList;

/* Музыкальный спектакль */
public class MusicalShow extends Show{
    protected Person musicAuthor; // автор музыки
    protected String librettoText; // текст либретто

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Распечатать текст либретто
    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
