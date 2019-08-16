import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        int randomColorInt1 = (int) (Math.random() * 99999999);
        Color randomColor1 = new Color(randomColorInt1);
        g.setColor(randomColor1);
        g.fillRect(0, 0, 2000, 1000);

        for (int x = 0; x < 20; x++) {
            int randomColorInt = (int) (Math.random() * 99999999);
            Color randomColor = new Color(randomColorInt);
            g.setColor(randomColor);

            int randomX = (int) (Math.random() * 2000);
            int randomY = (int) (Math.random() * 1000);
            int randomWidth = (int) (Math.random() * 1000);
            int randomHeight = (int) (Math.random() * 1000);

            int randomShape = (int) (Math.random() * 2);
            switch (randomShape) {
                case 0:
                    g.fillRect(randomX, randomY, randomWidth, randomHeight);
                    break;
                case 1:
                    g.fillOval(randomX, randomY, randomWidth, randomHeight);
                    break;
            }
        }
    }
}
