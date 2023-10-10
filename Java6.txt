package usedcarexception;
class UsedCarException extends Exception {
    public UsedCarException(String vin) {
        super("Invalid UsedCar with VIN: " + vin);
    }
}
public class UsedCar {
    private String vin;
    private String make;
    private int year;
    private int mileage;
    private double price;

    public UsedCar(String vin, String make, int year, int mileage, double price) throws UsedCarException {
        if (vin.length() != 4) {
            throw new UsedCarException(vin);
        }

        if (!isValidMake(make)) {
            throw new UsedCarException(vin);
        }

        if (year < 1990 || year > 2014) {
            throw new UsedCarException(vin);
        }

        if (mileage < 0 || price < 0) {
            throw new UsedCarException(vin);
        }

        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    private boolean isValidMake(String make) {
        String[] validMakes = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};
        for (String validMake : validMakes) {
            if (validMake.equalsIgnoreCase(make)) {
                return true;
            }
        }
        return false;
    }

    public String getVin() {
        return vin;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "VIN: " + vin + ", Make: " + make + ", Year: " + year + ", Mileage: " + mileage + ", Price: " + price;
    }
}
class ThrowUsedCarExceptions {
    public static void main(String[] args) {
        UsedCar[] cars = new UsedCar[7];
        int validCarCount = 0;

        try {
            cars[0] = new UsedCar("1234", "Ford", 2005, 80000, 5000);
            validCarCount++;
            cars[1] = new UsedCar("5678", "Toyota", 2010, 60000, 8000);
            validCarCount++;
            cars[2] = new UsedCar("ABCD", "Honda", 2000, 120000, 2500);
            validCarCount++;
            cars[3] = new UsedCar("EFGH", "Chrysler", 1995, 150000, 2000);
            validCarCount++;
            cars[4] = new UsedCar("WXYZ", "Other", 2015, 10000, 15000);
            validCarCount++;
            // Invalid cars
            cars[5] = new UsedCar("XYZ", "GMC", 2022, -1000, 30000);
            cars[6] = new UsedCar("12345", "Ford", 1985, 200000, -500);
        } catch (UsedCarException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("List of Valid Used Cars:");
        for (int i = 0; i < validCarCount; i++) {
            System.out.println(cars[i]);
        }
    }
}