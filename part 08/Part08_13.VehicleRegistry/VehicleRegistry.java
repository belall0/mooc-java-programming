
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.containsKey(licensePlate)) {
            return false;
        }

        owners.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return owners.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        return (owners.remove(licensePlate) == null ? false : true);

    }

    public void printLicensePlates() {
        for (LicensePlate key : owners.keySet()) {
            System.out.println(key);
        }

    }

    public void printOwners() {
        HashMap<String, Integer> names = new HashMap<>();

        for (String name : owners.values()) {
            if (names.get(name) != null) {
                continue;
            }

            names.put(name, 1);
            System.out.println(name);
        }
    }
}
