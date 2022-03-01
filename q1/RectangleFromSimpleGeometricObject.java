class RectangleFromSimpleGeometricObject extends GeometricObject{

    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject(){

    }

    public RectangleFromSimpleGeometricObject(double width, double height){
        this.height = height;
        this.width = width;

    }

    public RectangleFromSimpleGeometricObject(double width,double height, String color, boolean filled){

        this.width =width;
        this.height =height;
        this.setColor(color);
        this.setFilled(filled);

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        double area = this.width*this.height;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (this.width *2) + (this.height *2);
        return perimeter;
    }
    
}
