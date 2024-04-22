
import java.util.HashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());

        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = this.storage.get(storageUnit);

        // remove only one occurence of item in the list
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                items.remove(i);
                break;
            }
        }

        // check if the storageUnit is empty
        if (items.isEmpty()) {
            this.storage.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnitsNames = new ArrayList<>();

        for (String s : this.storage.keySet()) {
            storageUnitsNames.add(s);
        }

        return storageUnitsNames;
    }

}
