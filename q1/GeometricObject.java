import java.util.Date;

abstract class GeometricObject{

    private Date dateCreated;
    private String color;
    private boolean filled;

    public GeometricObject() {

        Date date = new Date();

        this.dateCreated = date;

    }

    public GeometricObject(String color, boolean filled){

        Date date = new Date();

        this.dateCreated = date;
        this.color = color;
        this.filled = filled;

    }

    public String toString() {
        
        String a = this.dateCreated.toString();
        return a;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    



}