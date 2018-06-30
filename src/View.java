
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class View extends JFrame {

    public Container contenedor;
    public JPanel pTextField;
    public JPanel pTrigonometricas;
    public JPanel pBasicas;
    public JPanel pPrincipal;
    public JButton boton0;
    public JButton boton1;
    public JButton boton2;
    public JButton boton3;
    public JButton boton4;
    public JButton boton5;
    public JButton boton6;
    public JButton boton7;
    public JButton boton8;
    public JButton boton9;
    public JButton botonSin;
    public JButton botonCos;
    public JButton botonTan;
    public JButton botonD;
    public JButton botonM;
    public JButton botonS;
    public JButton botonR;
    public JButton botonP;
    public JButton botonI;
    public JButton botonC;
    public JButton botonOff;
    public JButton botonOn;
    public JButton botonMod;
    public JButton botonMem;
    public JToggleButton botonInv;
    public JTextField texto1;

    @SuppressWarnings("deprecation")
    public View() {
        super(": :Calculadora versión 2: :");
        setSize(260, 400);
        contenedor = getContentPane();
        Menu();
        addComponentes();
        setBackground(Color.LIGHT_GRAY);
        setCursor(Cursor.HAND_CURSOR);
        setVisible(true);
    }

    private void addComponentes() {

        pPrincipal = new JPanel();
        pTextField = new JPanel();
        pTrigonometricas = new JPanel();
        pBasicas = new JPanel();

        //Llama alos Metodos de los paneles creados.
        Panel();
        Panel2();
        Panel3();

        pPrincipal.setLayout(new GridLayout(3, 1));

        //adici�n paneles a panel principal
        pPrincipal.add(pTextField);
        pPrincipal.add(pTrigonometricas);
        pPrincipal.add(pBasicas);

        //adici�n de componentes a la ventana o contenedor.
        contenedor.add(pPrincipal);
    }

    private void Menu() {
        JMenuBar barra = new JMenuBar();
        JMenu m1 = new JMenu("Edicion");
        JMenu m2 = new JMenu("Ver");
        JMenu m3 = new JMenu("Ayuda");
        barra.add(m1);
        barra.add(m2);
        barra.add(m3);
        m1.add(new JMenuItem("Abrir"));
        m1.add(new JMenuItem("Cerrar"));
        m1.addSeparator();
        m1.add(new JMenuItem("Salir"));
        setJMenuBar(barra);
    }

    public void Panel() {
        texto1 = new JTextField();
        //Alinea el texto donde comenzara a Escribir.
        texto1.setHorizontalAlignment(JTextField.RIGHT);
        texto1.setEditable(false);
        texto1.setBackground(Color.WHITE);

        pTextField.setBorder(new TitledBorder(":  CASIO :"));
        pTextField.setLayout(new GridLayout(1, 1));

        //adici�n de componentes
        pTextField.add(texto1);
    }

    public void Panel2() {

        botonInv = new JToggleButton("Inv");
        botonInv.setEnabled(false);
        botonSin = new JButton("Sin");
        botonSin.setEnabled(false);
        botonCos = new JButton("Cos");
        botonCos.setEnabled(false);
        botonTan = new JButton("Tan");
        botonTan.setEnabled(false);

        botonOn = new JButton("ON");
        botonOff = new JButton("OFF");
        botonOff.setEnabled(false);
        botonMod = new JButton("Mod");
        botonMod.setEnabled(false);
        botonC = new JButton("C");
        botonC.setEnabled(false);

        JButton boton10 = new JButton("");
        boton10.setEnabled(false);
        JButton boton11 = new JButton("");
        boton11.setEnabled(false);
        JButton boton12 = new JButton("");
        boton12.setEnabled(false);
        botonMem = new JButton("Me");
        botonMem.setEnabled(false);

        pTrigonometricas.setLayout(new GridLayout(3, 4, 3, 3));

        //adici�n de componentes
        pTrigonometricas.add(botonInv);
        pTrigonometricas.add(botonSin);
        pTrigonometricas.add(botonCos);
        pTrigonometricas.add(botonTan);

        pTrigonometricas.add(boton10);
        pTrigonometricas.add(boton11);
        pTrigonometricas.add(boton12);
        pTrigonometricas.add(botonMem);

        pTrigonometricas.add(botonOn);
        pTrigonometricas.add(botonOff);
        pTrigonometricas.add(botonMod);
        pTrigonometricas.add(botonC);
    }

    public void Panel3() {

        boton7 = new JButton("7");
        boton7.setEnabled(false);
        boton8 = new JButton("8");
        boton8.setEnabled(false);
        boton9 = new JButton("9");
        boton9.setEnabled(false);
        botonD = new JButton("/");
        botonD.setEnabled(false);

        boton4 = new JButton("4");
        boton4.setEnabled(false);
        boton5 = new JButton("5");
        boton5.setEnabled(false);
        boton6 = new JButton("6");
        boton6.setEnabled(false);
        botonM = new JButton("*");
        botonM.setEnabled(false);

        boton1 = new JButton("1");
        boton1.setEnabled(false);
        boton2 = new JButton("2");
        boton2.setEnabled(false);
        boton3 = new JButton("3");
        boton3.setEnabled(false);
        botonR = new JButton("-");
        botonR.setEnabled(false);

        boton0 = new JButton("0");
        boton0.setEnabled(false);
        botonP = new JButton(".");
        botonP.setEnabled(false);
        botonI = new JButton("=");
        botonI.setEnabled(false);
        botonS = new JButton("+");
        botonS.setEnabled(false);

        pBasicas.setLayout(new GridLayout(4, 4, 3, 3));

        //adici�n de componentes
        pBasicas.add(boton7);
        pBasicas.add(boton8);
        pBasicas.add(boton9);
        pBasicas.add(botonD);

        pBasicas.add(boton4);
        pBasicas.add(boton5);
        pBasicas.add(boton6);
        pBasicas.add(botonM);

        pBasicas.add(boton1);
        pBasicas.add(boton2);
        pBasicas.add(boton3);
        pBasicas.add(botonR);

        pBasicas.add(boton0);
        pBasicas.add(botonP);
        pBasicas.add(botonI);
        pBasicas.add(botonS);
    }
}
