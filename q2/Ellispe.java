class Ellispe extends Shape {

    public Ellispe(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double Area(){
        return this.getPI()*this.getDim1()*this.getDim2();
    }
    
}
