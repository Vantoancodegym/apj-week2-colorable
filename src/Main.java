public class Main {
    public static void main(String[] args) {
        Shapes[] shapes =new Shapes[4];
        shapes[0]=new Square("red",4);
        Shapes shape1=new Square("blue",6);
        Colorable c=(Colorable)shape1;
        shapes[1]=new Square("blue",3);
        shapes[2]=new Rectangle("yellow",4,6);
        shapes[3]=new Rectangle("yellow",2,5);
        for (Shapes shape:shapes
             ) {
            System.out.println(shape.toString());
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
            if (shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }
    }
}
