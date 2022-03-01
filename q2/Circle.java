class Circle extends Shape {

    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double Area(){

        double area =this.getDim1() * this.getDim2() * this.getPI();

        return area;


    }
    
}
