package P010_L007_Rectangle;

import java.awt.*;

public class Rectangle {

        int width = 0;
        int length = 0;

            public Rectangle() {
            }

            public Rectangle(int width, int length) {
                this.width = width;
                this.length = length;
            }
            public void areaOfRectangle() {
                int area = width * length;
                System.out.println("Area = "+ area);
            }

            public void perimeterOfRectangle() {
                int perimeter = 2*(width+length);
                System.out.println("Perimeter = " + perimeter);
            }


    }
}
