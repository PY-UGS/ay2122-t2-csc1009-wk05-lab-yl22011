class Test{
    public static void main(String[] args){

        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5,5);
        Ellispe e = new Ellispe(7, 7);
        Square s = new Square(6, 6);
        Shape figref;
        figref = r;
        System.out.println("Area is " +figref.Area());
        figref = t;
        System.out.println("Area is " +figref.Area());
        figref = c;
        System.out.println("Area is " +figref.Area());
        figref = e;
        System.out.println("Area is " +figref.Area());
        figref = s;
        System.out.println("Area is " +figref.Area());

    }
}