import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Calculadora_15_O();
                frame.setSize(550,550);
                frame.setVisible(true);
            }
        });
    }
}