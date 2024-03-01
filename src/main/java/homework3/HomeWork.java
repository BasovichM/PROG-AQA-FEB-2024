package homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write HashMap of owned cars, set their colors using enum you create
 * print owners of cars of certain color
 Write HashMap of owned cars, set their colors using enum you create
 print owners of cars of certain color
 */
public class HomeWork {

    public static void main(String[] args) {
        HashMap<CarBrand, CarColor> carColor = new HashMap<>();
        carColor.put(CarBrand.TOYOTA, CarColor.GRAY);
        carColor.put(CarBrand.AUDI, CarColor.YELLOW);
        carColor.put(CarBrand.FIAT, CarColor.WHITE);
        carColor.put(CarBrand.FORD, CarColor.YELLOW);
        carColor.put(CarBrand.OPEL, CarColor.VIOLET);
        carColor.put(CarBrand.MAZDA, CarColor.RED);
        carColor.put(CarBrand.VOLKSWAGEN, CarColor.GREEN);
        carColor.put(CarBrand.SKODA, CarColor.BLUE);

        public static void main (String[] args) {
            Map<CarBrand, CarColor> carOwners = new HashMap<>();
            carOwners.put(CarBrand.TOYOTA, CarColor.GRAY);
            carOwners.put(CarBrand.TOYOTA, CarColor.BLUE);
            carOwners.put(CarBrand.AUDI, CarColor.BLACK);
            carOwners.put(CarBrand.AUDI, CarColor.YELLOW);
            carOwners.put(CarBrand.FIAT, CarColor.WHITE);
            carOwners.put(CarBrand.FORD, CarColor.YELLOW);
            carOwners.put(CarBrand.OPEL, CarColor.VIOLET);
            carOwners.put(CarBrand.VOLKSWAGEN, CarColor.YELLOW);
            carOwners.put(CarBrand.VOLKSWAGEN, CarColor.ORANGE);
            carOwners.put(CarBrand.RANGE_ROVER, CarColor.BLUE);
            carOwners.put(CarBrand.BMW, CarColor.GREEN);
            carOwners.put(CarBrand.NISSAN, CarColor.RED);
            carOwners.put(CarBrand.JEEP, CarColor.GRAY);
            carOwners.put(CarBrand.GMC, CarColor.ORANGE);
            carOwners.put(CarBrand.MAZDA, CarColor.BLACK);
            carOwners.put(CarBrand.SKODA, CarColor.VIOLET);


            Owner owner1 = new Owner("Bob");
            Owner owner2 = new Owner("Jerry");
            Owner owner3 = new Owner("Mark");
            Owner owner4 = new Owner("Bill");
            Owner owner5 = new Owner("Tom");

            HashMap<CarBrand, Owner> carBrandOwnerHashMap = new HashMap<>();
            carBrandOwnerHashMap.put(CarBrand.AUDI, owner1);
            carBrandOwnerHashMap.put(CarBrand.FIAT, owner1);
            carBrandOwnerHashMap.put(CarBrand.FORD, owner2);
            carBrandOwnerHashMap.put(CarBrand.OPEL, owner2);
            carBrandOwnerHashMap.put(CarBrand.MAZDA, owner3);
            carBrandOwnerHashMap.put(CarBrand.VOLKSWAGEN, owner4);
            carBrandOwnerHashMap.put(CarBrand.SKODA, owner5);

            for (var item :
                    getPersonNames(carBrandOwnerHashMap, carColor, CarColor.YELLOW)) {
                System.out.println(item.getName());
            }
        }

        static List<Owner> getPersonNames
        (HashMap < homework3.CarBrand, Owner > carBrandOwnerHashMap, HashMap < CarBrand, CarColor > carColor, CarColor color){
            var listOfBrands = new ArrayList<CarBrand>();
            var owners = new ArrayList<Owner>();

            for (var item :
                    carColor.entrySet()) {
                if (item.getValue() == color) {
                    listOfBrands.add(item.getKey());
                }
            }

            for (var item :
                    carBrandOwnerHashMap.entrySet()) {
                if (listOfBrands.contains(item.getKey())) {
                    owners.add(item.getValue());
                }
            }

            return owners;
        }
    }
}