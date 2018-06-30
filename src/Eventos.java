
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Eventos extends View {

    double[] datos = new double[]{0, 0, 0};
    char ope = '0';
    boolean bandera = false;
    protected View calculadora;

    public void addEventos() {
        //oyentes an�nimos de los bot�nes
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "0");
            }
        });
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "1");
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "2");
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "3");
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "4");
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "5");
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "6");
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "7");
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "8");
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (texto1.getText().equals("0")) {
                    texto1.setText("");
                }
                texto1.setText(texto1.getText() + "9");
            }
        });

        botonD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dividir();
            }
        });
        botonM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplicar();
            }
        });
        botonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resta();
            }
        });
        botonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                suma();
            }
        });
        botonMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mod();
            }
        });
        botonP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char c = ((JButton) e.getSource()).getText().charAt(0);
                if (c == '.') {
                    if (!texto1.getText().contains(".") && !texto1.getText().equals("")) {
                        texto1.setText(texto1.getText() + ".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error!! Point Sintax ");
                    }
                }
            }
        });

        botonI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultado();
                //JOptionPane.showMessageDialog(null,"\n TU RESULTADO: ");
            }
        });
        botonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto1.setText("");
            }
        });
        botonOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String menu = ("\t\tBienvenido.\n 1.Apagar Calculadora.\n 2.Log out. ");
                byte opcion = Byte.parseByte(JOptionPane.showInputDialog(menu));
                switch (opcion) {
                    case 1:
                        botonInv.setEnabled(false);
                        botonSin.setEnabled(false);
                        botonCos.setEnabled(false);
                        botonTan.setEnabled(false);
                        botonOff.setEnabled(false);
                        botonMod.setEnabled(false);
                        botonC.setEnabled(false);
                        boton7.setEnabled(false);
                        boton8.setEnabled(false);
                        boton9.setEnabled(false);
                        botonD.setEnabled(false);
                        boton4.setEnabled(false);
                        boton5.setEnabled(false);
                        boton6.setEnabled(false);
                        botonM.setEnabled(false);
                        boton1.setEnabled(false);
                        boton2.setEnabled(false);
                        boton3.setEnabled(false);
                        botonR.setEnabled(false);
                        boton0.setEnabled(false);
                        botonP.setEnabled(false);
                        botonI.setEnabled(false);
                        botonS.setEnabled(false);
                        texto1.setText("");
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "GRACIAS POR USAR"
                                + " VIRUZ - CALCULATOR ");
                        System.exit(0);
                        break;
                }
            }
        });
        botonOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "::: ��BIENVENIDO!! :::");

                texto1.setText("0");

                botonInv.setEnabled(true);
                botonSin.setEnabled(true);
                botonCos.setEnabled(true);
                botonTan.setEnabled(true);
                botonOff.setEnabled(true);
                botonMod.setEnabled(true);
                botonC.setEnabled(true);
                boton7.setEnabled(true);
                boton8.setEnabled(true);
                boton9.setEnabled(true);
                botonD.setEnabled(true);
                boton4.setEnabled(true);
                boton5.setEnabled(true);
                boton6.setEnabled(true);
                botonM.setEnabled(true);
                boton1.setEnabled(true);
                boton2.setEnabled(true);
                boton3.setEnabled(true);
                botonR.setEnabled(true);
                boton0.setEnabled(true);
                botonP.setEnabled(true);
                botonI.setEnabled(true);
                botonS.setEnabled(true);
                botonMem.setEnabled(true);
            }
        });

        botonSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bandera == true) {
                    secante();
                } else {
                    seno();
                }
            }
        });
        botonCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bandera == true) {
                    cosecante();
                } else {
                    coseno();
                }
            }
        });

        botonTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bandera == true) {
                    cotangente();
                } else {
                    tangente();
                }
            }
        });

        botonInv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inversa();
                //setName(String nombre)
            }
        });
    }

    public void suma() //Metodo para sumar
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Error de Sintaxis");
            texto1.setText("");
        } else {
            ope = '+';
            //resultado;
            datos[0] = Double.parseDouble(texto1.getText());
            texto1.setText("");
        }
    }

    public void resta() //Metodo para restar
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Error de Sintaxis");
            texto1.setText("");
        } else {
            ope = '-';
            datos[0] = Double.parseDouble(texto1.getText());
            texto1.setText("");
        }
    }

    public void multiplicar() //Metodo para Multiplicar
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Error de Sintaxis");
            texto1.setText("");
        } else {
            ope = '*';
            datos[0] = Double.parseDouble(texto1.getText());
            texto1.setText("");
        }
    }

    public void dividir() //Metodo para Dividir
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Error de Sintaxis");
            texto1.setText("");
        } else {
            ope = '/';
            datos[0] = Double.parseDouble(texto1.getText());
            texto1.setText("");
        }
    }

    public void mod() //Metodo para guardar en memoria
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Error de Sintaxis");
            texto1.setText("");
        } else {
            ope = 'm';
            datos[0] = Double.parseDouble(texto1.getText());
            texto1.setText("");
        }
    }

    public void seno() //Metodo para calcular seno
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Introduce Digito Primero");
            texto1.setText("");
        } else {
            datos[0] = Double.parseDouble(texto1.getText());
            datos[2] = Math.sin(Math.toRadians(datos[0]));
            texto1.setText(Double.toString(datos[2]));
        }
    }

    public void coseno() //Metodo para calcular coseno
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Introduce Digito Primero");
            texto1.setText("");
        } else {
            datos[0] = Double.parseDouble(texto1.getText());
            datos[2] = Math.cos(Math.toRadians(datos[0]));
            texto1.setText(Double.toString(datos[2]));
        }
    }

    public void tangente() //Metodo para calcular tangente
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Introduce Digito Primero");
            texto1.setText("");
        } else {
            datos[0] = Double.parseDouble(texto1.getText());
            datos[2] = Math.tan(Math.toRadians(datos[0]));
            texto1.setText(Double.toString(datos[2]));
        }
    }

    public void inversa() //Metodo para Inversa
    {
        bandera = true;
    }

    public void secante() //Metodo para calcular secante
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Introduce Digito Primero");
            texto1.setText("");
        } else {
            datos[0] = Double.parseDouble(texto1.getText());
            datos[2] = 1 / Math.cos(Math.toRadians(datos[0]));
            texto1.setText(Double.toString(datos[2]));
        }
        bandera = false;
    }

    public void cosecante() //Metodo para calcular secante
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Introduce Digito Primero");
            texto1.setText("");
        } else {
            datos[0] = Double.parseDouble(texto1.getText());
            datos[2] = 1 / Math.sin(Math.toRadians(datos[0]));
            texto1.setText(Double.toString(datos[2]));
        }
        bandera = false;
    }

    public void cotangente() //Metodo para calcular secante
    {
        if (texto1.getText().equals("")) {
            texto1.setText("ERROR");
            JOptionPane.showMessageDialog(null, "Introduce Digito Primero");
            texto1.setText("");
        } else {
            datos[0] = Double.parseDouble(texto1.getText());
            datos[2] = 1 / Math.tan(Math.toRadians(datos[0]));
            texto1.setText(Double.toString(datos[2]));
        }
        bandera = false;
    }

    public void resultado() //Mostrar el resultado
    {
        if (texto1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No has Introducido Ningun Valor");
            datos[1] = 0;
        } else {
            datos[1] = Double.parseDouble(texto1.getText());
            //texto1.setText(Double.toString(datos[0])+ope+Double.toString(datos[1]));
            switch (ope) {
                case '+':
                    datos[2] = datos[0] + datos[1];
                    texto1.setText(Double.toString(datos[2]));
                    break;

                case '-':
                    datos[2] = datos[0] - datos[1];
                    texto1.setText(Double.toString(datos[2]));
                    break;

                case '*':
                    datos[2] = datos[0] * datos[1];
                    texto1.setText(Double.toString(datos[2]));
                    break;

                case '/':
                    datos[2] = datos[0] / datos[1];
                    texto1.setText(Double.toString(datos[2]));
                    break;
                case 'm':
                    datos[2] = datos[0] % datos[1];
                    texto1.setText(Double.toString(datos[2]));
                    break;
            }
            datos[0] = datos[2];
            datos[1] = 0;
        }
    }
}
