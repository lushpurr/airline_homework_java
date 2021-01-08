public class Plane {
    private PlaneType type;

    public Plane(PlaneType planeType){
        this.type = planeType;
    }

    public PlaneType getType() {
        return type;
    }

    public int getCapacity(){
        return type.getCapacity();
    }

    public double getWeight(){
        return type.getTotalWeight();
    }


    public double getBaggageWeight() {
        return this.getWeight()/2;
    }
}
