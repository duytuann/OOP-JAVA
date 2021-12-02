public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, String registrationNumber, 
                Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car:" + "\n");
        sb.append("\t" + "Brand: " + this.brand + "\n");
        sb.append("\t" + "Model: " + this.model + "\n");
        sb.append("\t" + "Registration Number: " + this.registrationNumber + "\n");
        sb.append("\t" + "Number of Doors: " + this.numberOfDoors + "\n");
        sb.append("\t" + "Belongs to " + this.owner.getName() + " - " + this.owner.getAddress());
        sb.append("\n");
        String result = sb.toString();
        return result;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
