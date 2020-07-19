package P010_L007_Rectangle;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Rectangle Calculator");
            System.out.println("Add width:");
            int width = sc.nextInt();
            System.out.println("Add length:");
            int length = sc.nextInt();
            Rectangle customRectangle = new Rectangle(width,length);
            System.out.println("Width = "+customRectangle.width);
            System.out.println("Length = "+ customRectangle.length);
            customRectangle.areaOfRectangle();
            customRectangle.perimeterOfRectangle();
        }
}
