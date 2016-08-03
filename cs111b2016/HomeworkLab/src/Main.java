import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Point;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Point point = event.getPoint();

        double x = point.getX();

        double y = point.getY();

        if((x < width/2 && y < height/2) ||

                (x > width/2 && y > height/2)) {

            setBackground(Color.RED);

        } else {

            setBackground(Color.BLUE);

        }

        repaint();
    }
}
