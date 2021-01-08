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


}
