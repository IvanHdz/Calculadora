
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

    public Calculadora() {
        super("Viruz Blog: Calculadora 1.0");
        setSize(280, 350);
        Panel();
        Panel3();
        setBackground(Color.LIGHT_GRAY);
        setVisible(true);
    }

    private void Panel() {
        JTextField texto1 = new JTextField(22);
        JPanel panel = new JPanel();
        panel.add(texto1);
        add(panel, "North");
    }

    private void Panel3() {
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(4, 4, 1, 1));

        JButton boton4 = new JButton("7");
        JButton boton5 = new JButton("8");
        JButton boton6 = new JButton("9");
        JButton boton7 = new JButton("/");

        JButton boton9 = new JButton("4");
        JButton boton10 = new JButton("5");
        JButton boton11 = new JButton("6");
        JButton boton12 = new JButton("*");

        JButton boton14 = new JButton("1");
        JButton boton15 = new JButton("2");
        JButton boton16 = new JButton("3");
        JButton boton17 = new JButton("-");

        JButton boton19 = new JButton("0");
        JButton boton20 = new JButton(".");
        JButton boton21 = new JButton("=");
        JButton boton22 = new JButton("+");

        panel3.add(boton4);
        panel3.add(boton5);
        panel3.add(boton6);
        panel3.add(boton7);

        panel3.add(boton9);
        panel3.add(boton10);
        panel3.add(boton11);
        panel3.add(boton12);

        panel3.add(boton14);
        panel3.add(boton15);
        panel3.add(boton16);
        panel3.add(boton17);

        panel3.add(boton19);
        panel3.add(boton20);
        panel3.add(boton21);
        panel3.add(boton22);

        add(panel3, "Center");
    }
}
