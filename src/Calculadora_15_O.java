import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_15_O extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton dividirButton;
    private JButton multiplicarButton;
    private JButton raízCuadradaButton;
    private JButton raízCúbicaButton;
    private JButton exponenteX2Button;
    private JButton exponenteX3Button;
    private JButton senButton;
    private JButton saludarButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton factorialXButton;
    private JButton cotanButton;
    private JButton limpiarButton;
    private JButton cscButton;
    private JButton secButton;
    private JButton unirButton;
    private JButton cerrarButton;
    private JTextField textField3;

    public  Calculadora_15_O() {
        super("OPERACIONES");
        setContentPane(panel1);
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");

            }
        });




        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = Calculadora_15_O.this.textField3.getText();
                String saludo = "Hola " + nombre;

                JOptionPane.showMessageDialog(null, saludo);


            }
        });


        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "La suma es: " + (valor1 + valor2));
                }
                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }

            }
        });




        unirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre1 = textField1.getText();
                String nombre2 = textField2.getText();
                String resultado = nombre1 + nombre2;

                JOptionPane.showMessageDialog(null, resultado);
            }
        });


        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "La resta es: " + (valor1 - valor2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });

        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    if (valor2 != 0) {
                        JOptionPane.showMessageDialog(null, "La división es: " + (valor1 / valor2));
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });

        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null,"La multiplicación es: " + (valor1 * valor2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });

        raízCuadradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    if (valor1 >= 0) {
                        JOptionPane.showMessageDialog(null, "La raíz cuadrada de " + valor1 + " es: " + Math.sqrt(valor1) + "\nLa raíz cuadrada de " + valor2 + " es: " + Math.sqrt(valor2));

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se puede calcular la raíz cuadrada de un número negativo");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });



        raízCúbicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "La raíz cúbica de " + valor1 + " es: " + Math.cbrt(valor1) + "\nLa raíz cúbica de " + valor2 + " es: " + Math.cbrt(valor2));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });

        exponenteX2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "El cuadrado de " + valor1 + " es: " + Math.pow(valor1, 2) + "\nEl cuadrado de " + valor2 + " es: " + Math.pow(valor2, 2));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });

        exponenteX3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "El cubo de " + valor1 + " es: " + Math.pow(valor1, 3) + "\nEl cubo de " + valor2 + " es: " + Math.pow(valor2, 3));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos");
                }
            }
        });

        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "El seno de " + valor1 + " es: " + Math.sin(valor1) + "\nEl seno de " + valor2 + " es: " + Math.sin(valor2));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });

        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "El coseno de " + valor1 + " es: " + Math.cos(valor1) + "\nEl coseno de " + valor2 + " es: " + Math.cos(valor2));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });

        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "La tangente de " + valor1 + " es: " + Math.tan(valor1) + "\nLa tangente de " + valor2 + " es: " + Math.tan(valor2));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });

        factorialXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int valor1 = Integer.parseInt(textField1.getText());
                    int valor2 = Integer.parseInt(textField2.getText());

                    JOptionPane.showMessageDialog(null, "El factorial de " + valor1 + " es: " + factorial(valor1) + "\nEl factorial de " + valor2 + " es: " + factorial(valor2));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }

            private int factorial(int n) {
                if (n == 0 || n == 1) {
                    return 1;
                }
                return n * factorial(n - 1);
            }
        });



        cotanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    double cotan1 = 1 / Math.tan(valor1);
                    double cotan2 = 1 / Math.tan(valor2);

                    JOptionPane.showMessageDialog(null, "La cotangente de " + valor1 + " es: " + cotan1 + "\nLa cotangente de " + valor2 + " es: " + cotan2);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });

        cscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    double csc1 = 1 / Math.sin(valor1);
                    double csc2 = 1 / Math.sin(valor2);

                    JOptionPane.showMessageDialog(null, "La cosecante de " + valor1 + " es: " + csc1 + "\nLa cosecante de " + valor2 + " es: " + csc2);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });


        secButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    double valor2 = Double.parseDouble(textField2.getText());

                    double sec1 = 1 / Math.cos(valor1);
                    double sec2 = 1 / Math.cos(valor2);

                    JOptionPane.showMessageDialog(null, "La secante de " + valor1 + " es: " + sec1 + "\nLa secante de " + valor2 + " es: " + sec2);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Se ha producido un error al ingresar los datos.");
                }
            }
        });




    }

}
