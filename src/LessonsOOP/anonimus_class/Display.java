package LessonsOOP.anonimus_class;

public class Display {
    private final int DISPLAY_HEIGHT = 1920;
    private final int DISPLAY_WIDHT = 1280;

    public Display() {
        Pixel pixel = new Pixel(123, 414, Color.BLUE);
        pixel.getPixel();
    }


    class Pixel {
        private int x;
        private int y;
        private Color color;

        public Pixel(int x, int y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Pixel{" +
                    "x=" + x +
                    ", y=" + y +
                    ", color=" + color +
                    '}';
        }

        public void getPixel() {
            System.out.println(toString());
        }
    }

    enum Color {
        RED, GREEN, BLUE, YELLOW
    }
}
