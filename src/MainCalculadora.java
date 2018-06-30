
import javax.swing.JFrame;

public class MainCalculadora {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //View view = new View();
        Eventos mod = new Eventos();
        mod.addEventos();
        mod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
