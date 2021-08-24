public class ObjectReference {

    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horespower = 392;
        Integer price = 14999;
        Long registrationNumber = 2124165156L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPrecise = 15.48450392;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carModel = "Dodge Challenger SRT 392";
        String carModelNew = new String("Dodge Challenger SRT 392");

        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horsepower: " + horespower);
        System.out.println("Price: $" + price.floatValue());
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Combined Fuel Consumption: " + fuelConsumptionCombined);
        System.out.println("Precise Fuel Consumption: " + fuelConsumptionPrecise.intValue());
        System.out.println("This car is: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);

        System.out.println("The car model: " + carModel);
        System.out.println("The car model with new keyword: " + carModelNew);

    }


}
