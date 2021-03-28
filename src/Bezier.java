import java.awt.*;

public class Bezier extends Surface {


    public int tabx[] ;
    public int taby[] ;
    public double xt ;
    public double yt  ;
    public double startx ;
    public double starty ;


    Bezier(int xaa , int yaa , int xa , int  ya , int  xb , int yb  , int xz , int yz  , Graphics g) {

        this.startx = 100;
        this.starty = 100;
        tabx = new int[]{xaa ,xa , xb, xz};
        taby = new int[]{yaa , ya , yb , yz};
        paint(g);

    }





    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        int wynikx;
        int wyniky;
        super.paint(g);
        g.setColor(Color.blue);
        g.setColor(new Color(43, 186 + temp, 139 + temp, 215));
        temp +=2;


        for(double t = 0.0 ;  t <= 1.0 ; t+=0.005 ) {

            {
                wynikx = (int) (startx + xt);
                wyniky = (int) (starty + yt);
                xt = Math.pow(1-t,3) * tabx[0] + 3 *t * Math.pow(1-t,2) * tabx[1] + 3 * Math.pow(t,2) * (1-t) * tabx[2] + Math.pow(t,3) *tabx[3];
                yt = Math.pow(1-t,3) * taby[0] + 3 *t * Math.pow(1-t,2) * taby[1] + 3 * Math.pow(t,2) * (1-t) * taby[2] + Math.pow(t,3) *taby[3];
                g2d.fillOval(wynikx , wyniky , 8, 8);


            }

        }

    }
}
