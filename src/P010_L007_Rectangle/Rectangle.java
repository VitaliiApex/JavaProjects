package P010_L007_Rectangle;

import java.awt.*;

public class Rectangle {

        int width = 0;
        int length = 0;

            public Rectangle() {
                this.width = 5;
                this.length = 10;
            }

            public Rectangle(int Width, int Length) {
                width = Width;
                length = Length;
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

