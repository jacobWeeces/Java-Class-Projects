public class MyFirstJavaApp {

    // Program will print out our car's statistics
    public static void main(String[] args){
        // Bytes
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        // Shorts
        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        // Integers
        int price = 29999;
        int mileage = 14999;

        // Long
        long registrationNumber = 125487489445646L;

        // Floats
        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        // Double
        double fuelConsumptionPresiceAverage = 15.93820423;

        // Boolean
        boolean isDamaged = true;

        //Char
        char energyEfficiencyCategory = 'G';


        // Print car name
        System.out.println("2018 Dodge Challenger SRT 392");
        // Print price
        System.out.println("Price: $" + price);
        // Print mileage of car
        System.out.println("Mileage: " + mileage + "miles");
        // Print if car is damaged or not
        System.out.println("The car is Damaged: " + isDamaged);
        // Print the registration number of car
        System.out.println("Registration number: " + registrationNumber);
        // Print capacity of cabin
        System.out.println("Cubic capacity: " + cubicCapacity + "ccm");
        // Print hp and kW
        System.out.println("Power: " + power + "kW(" + horsePower + "hp)");
        // Print emissions stats
        System.out.println("CO2 emission: " + co2Emission + " g/km");
        // Print emission sticker
        System.out.println("Emission sticker: " + emissionSticker + "( Energy efficiency category: "+ energyEfficiencyCategory + ")");
        // Print combined fuel economy
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + " l/100km");
        // Print combined fuel economy
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + " l/100km");
        // Print extra urban fuel economy
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + " l/100km");
        // Print precise average fuel consumption
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPresiceAverage + " l/100km");
        // Print number of owners
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        // Print number of doors
        System.out.println("Number of doors: " + numberOfDoors);

        // Widening conversions
        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The values of new number of seats: " + numberOfSeats);
        double newFuelConsumptionCombined = fuelConsumptionCombined;
        System.out.println("The new value of combined fuel consumption: " + newFuelConsumptionCombined + "l/100km");

        // Narrowing conversions - This purposefully prints out something wrong for purpose of demonstration
        byte newPower = (byte) power;
        System.out.println("The value of the new power: " + newPower + "kW");
    }


}






































