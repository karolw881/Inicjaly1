
    import javax.swing.*;
import java.awt.*;

    public class Obraz extends JFrame {

        public Obraz() {

            initUI();
        }

        private void initUI() {

            add(new Surface());
            //this.setBackground(Color.GREEN);
            this.setPreferredSize(new Dimension(400, 400));
            this.pack();
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("Bezier");
            setSize(800, 800);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }


