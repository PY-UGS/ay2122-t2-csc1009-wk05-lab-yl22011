public class TestCircleRectangle {

    public static void main(String[] args){
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1,"white",false);

        System.out.println("A circle created on " + circle.toString());
        System.out.println("color: " + circle.getColor() + " and filled: " +circle.isFilled() );
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2,4,"white",false);
        System.out.println("\nA rectangle  create on " + rectangle.getDateCreated());
        System.out.println("color: " + rectangle.getColor() + " and filled: " +rectangle.isFilled() );
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

    }
    
}
