
public class Circle {
    private double myX;
    private double myY;
    private double myDiameter;

    // Default constructor
    public Circle() throws InvalidDiameterException {
        this.myX = 0;
        this.myY = 0;
        setDiameter(100); // Use setter to validate
    }

    // Parameterized constructor
    public Circle(double myX, double myY, double myDiameter) throws InvalidDiameterException {
        this.myX = myX;
        this.myY = myY;
        setDiameter(myDiameter); // Validate using setter
    }

    // Accessor methods
    public double getMyX() {
        return myX;
    }

    public double getMyY() {
        return myY;
    }

    public double getDiameter() {
        return myDiameter;
    }

    // Mutator for diameter with validation
    public void setDiameter(double myDiameter) throws InvalidDiameterException {
        if (myDiameter < 0) {
            throw new InvalidDiameterException("Diameter cannot be negative!");
        }
        this.myDiameter = myDiameter;
    }

    // toString method to show circle details
    @Override
    public String toString() {
        return "Circle[Center: (" + myX + ", " + myY + "), Diameter: " + myDiameter + "]";
    }
}

