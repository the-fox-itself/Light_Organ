import javax.swing.*;
import java.awt.*;

public class Main {
    private static JFrame frame = new JFrame();

    public static void main(String[] args) {
        frame.setSize(2000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(new DrawPanel());
        Runnable repaintRunnable = () -> {
            while (true) {
                frame.repaint();
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(repaintRunnable);
        thread.start();
        frame.setVisible(true);
    }
}
