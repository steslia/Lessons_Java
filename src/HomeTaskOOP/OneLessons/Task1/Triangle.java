package HomeTaskOOP.OneLessons.Task1;

class Triangle {
    private int a,b,c;

    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void square(){
        int squareTriangle = (this.a + this.b + this.c) / 2;
        System.out.println();
        System.out.println("Square is triangle = " + squareTriangle);
    }
}
