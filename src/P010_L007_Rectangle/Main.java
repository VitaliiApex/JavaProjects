package P010_L007_Rectangle;

    public class Main {
        public static void main(String[] args) {

            Rectangle customRectangle = new Rectangle(5,10);
            System.out.println("Width = "+customRectangle.width);
            System.out.println("Length = "+ customRectangle.length);

            customRectangle.areaOfRectangle();

            customRectangle.perimeterOfRectangle();

        }
}
