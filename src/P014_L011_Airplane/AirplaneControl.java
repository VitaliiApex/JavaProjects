package P014_L011_Airplane;

    public class AirplaneControl extends Plane {

        private int length, width, weight;

        public AirplaneControl() {
        }

        public AirplaneControl(int length, int width, int weight) {
            setLength(length);
            setWidth(width);
            setWeight(weight);
        }

        public void movementUp(){
            int movementUpRandom = (int)(Math.random()*1000);
            System.out.println("movement Up " + movementUpRandom + " Km.");
        }
        public void movementDown(){
            int movementDownRandom = (int)(Math.random()*1000);
            System.out.println("movement Down " + movementDownRandom + " km.");
        }
        public void movementForward(){
            int movementForwardRandom = (int)(Math.random()*1000);
            System.out.println("movement Forward " + movementForwardRandom + " Km.");
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}
