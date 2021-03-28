import java.awt.*;
import javax.swing.JPanel;

class Surface extends JPanel  {

    public static int temp = 0;

    public Surface() {

    }

    private void doDrawing(Graphics g) {
         new Bezier(28,22,27, 7 , 40 ,  464 , 29 , 467 , g);
         new Bezier(29,467,2, 474,68 , 489 ,  71 ,  467,g);

        new Bezier(71,467,77, 417 , 76 ,  257 , 73 , 254 , g);
        new Bezier(73,254,52, 230,186 , 213 ,  231 ,  469,g);

        new Bezier(226,470,227, 477 , 256 ,  420 , 260 , 413 , g);
        new Bezier(260,413,276, 385,317 ,317, 302 ,  314 ,  g);

        new Bezier(302,314,268, 308 , 364 ,  451 , 358 , 465 , g);
        new Bezier(358,465,352, 479,467 , 207 ,  478 ,  210,g);

        new Bezier(478,210,492, 214 , 469 ,  211 , 460 , 199 , g);
        new Bezier(460,199,451, 187,372 , 399 ,  362 ,  411,g);

        new Bezier(362,411,352, 423 , 285 ,  256 , 297 , 247 , g);
        new Bezier(297,247,328, 225,260 , 377 ,  241 ,  408,g);

        new Bezier(241,408,233, 421 , 209 ,  227 , 124 , 223 , g);
        new Bezier(123,223,105, 222,172 , 215 ,  248 ,  26,g);

        new Bezier(248,26,254, 12 , 235 ,  22 , 188 , 19 , g);
        new Bezier(188,19,187, 19,176 , 171 ,  76 ,  217,g);

        new Bezier(76,217,62, 223 , 79 ,  42 , 70 , 27 , g);
        new Bezier(70,27,62, 14,48 , 22 ,  33 ,  20,g);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);

    }

    }