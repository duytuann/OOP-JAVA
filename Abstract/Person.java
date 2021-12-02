import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove.
     */
    public void removeVehicle(String registrationNumber) {
        ListIterator<Vehicle> itr = vehicleList.listIterator();
        while (itr.hasNext()) {
            Vehicle run = itr.next();
            if (run.registrationNumber.equals(registrationNumber)) {
                itr.remove();
            }
        }
    }

    /**
     * getVehiclesInfo.
     */
    public String getVehiclesInfo() {
        if (this.vehicleList.size() == 0) {
            return this.name + " has no vehicle!";
        }
        String result = "";
        result += this.name + " has:";
        result += "\n";
        result += "\n";
        for (Vehicle v : vehicleList) {
            result += v.getInfo();
        }
        return result;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // public static void main(String[] args) {
    //     Person p1 = new Person("test1", "address1");
    //     Person p2 = new Person("test2", "address2");
    //     Vehicle car1 = new Car("a","a","a",234);
    // }
}
