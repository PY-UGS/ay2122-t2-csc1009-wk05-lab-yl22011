class Square  extends Shape{

    public Square (double dim1, double dim2){
        super(dim1, dim2);
    }

    public double Area(){
        return this.getDim1() * this.getDim2();
    }
    
}
