
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.setLocationRelativeTo(null);
        c.setResizable(false);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
