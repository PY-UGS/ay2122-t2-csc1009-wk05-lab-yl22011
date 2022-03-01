
class CircleFromSimpleGeometricObject extends GeometricObject {

    private double radius;

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
            double area = 3.142 * this.radius * this.radius;
            return area;
    }

    public double getPerimeter(){

        double perimeter = 3.142 *this.radius * 2;
        return perimeter;
    }

    public double getDiameter(){
        double diameter = 2* this.radius;
        return diameter;
    }

    public void printCircle(){
        
    }
    


    
}
