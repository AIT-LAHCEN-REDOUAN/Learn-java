package packages;

public class Rectangle {
    private Coordinate cood ;
    private double width , height ;

    public Rectangle(double x , double y , double w , double h){
        width = w ;
        height = h ;
        cood = new Coordinate(x,y);
    }

    public boolean contains (Coordinate c){
        double x= c.getX();
        double y = c.getY();
        boolean horizentalOk =  cood.getX() <=x && x <=cood.getX()+width ;
        boolean verticalOk = cood.getY() <=y && y <= cood.getY()+height ;

        return horizentalOk && verticalOk ;
    }

    public boolean contains (Rectangle r){
        double rX = r.cood.getX();
        double rY = r.cood.getY();
        double rWidth = r.width ;
        double rHeight = r.height ;

        boolean horizentalOK =  cood.getX() <= rX && rX+rWidth<=cood.getY()+width;
        boolean verticalOK = cood.getY() <=rY && rY+rHeight <=cood.getY()+height;

        return horizentalOK && verticalOK ;
    }
}
