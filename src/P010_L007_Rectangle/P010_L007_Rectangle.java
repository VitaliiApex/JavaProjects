package P010_L007_Rectangle;

import java.awt.*;

public class P010_L007_Rectangle {
    public static void main(String[] args) {

        Rectangle ab = new Rectangle ();

        public class Rectangle {
            private static final int width;
            private static final int length;
            int width = 0;
            int length = 0;

            public Rectangle() {

            }

            public Rectangle(int width, int length) {
                Rectangle.width = width;
                Rectangle.length = length;
            }
            public void areaOfRectangle() {
                int area = width * length;
                System.out.println("Площа прямокутника = "+ area);
            }

            public void perimeterOfRectangle() {
                int perimeter = 2*(width+length);
                System.out.println("Периметр прямокутника = " + perimeter);
            }

            public String toString() {
                return "Rectangle{" +
                        "width=" + width +
                        ", length=" + length +
                        '}';

    }
}
