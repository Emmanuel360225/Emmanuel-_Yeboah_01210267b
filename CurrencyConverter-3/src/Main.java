import com.Converters.CurrencyConverter;
import com.Converters.DistanceConverter;
import com.Converters.TimeConverter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Converter:");
        System.out.println("1. Currency Converter");
        System.out.println("2. Distance Converter");
        System.out.println("3. Time Converter");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount:");
                double amount = scanner.nextDouble();
                System.out.println("Enter currency (USD, GHS, EUR, YEN):");
                String from = scanner.next().toUpperCase();
                System.out.println("Convert to (USD, GHS, EUR, YEN):");
                String to = scanner.next().toUpperCase();
                try {
                    double convertedAmount = CurrencyConverter.convert(from, to, amount);
                    System.out.println("Converted Amount: " + convertedAmount + " " + to);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 2:
                System.out.println("Enter distance value:");
                double distance = scanner.nextDouble();
                System.out.println("Convert from (meters, km, miles):");
                String distFrom = scanner.next().toLowerCase();
                System.out.println("Convert to (meters, km, miles):");
                String distTo = scanner.next().toLowerCase();

                double convertedDistance = switch (distFrom + "_" + distTo) {
                    case "meters_km" -> DistanceConverter.metersToKilometers(distance);
                    case "km_meters" -> DistanceConverter.kilometersToMeters(distance);
                    case "miles_km" -> DistanceConverter.milesToKilometers(distance);
                    case "km_miles" -> DistanceConverter.kilometersToMiles(distance);
                    default -> {
                        System.out.println("Invalid conversion.");
                        yield -1;
                    }
                };

                if (convertedDistance != -1) {
                    System.out.println("Converted Distance: " + convertedDistance + " " + distTo);
                }
                break;

            case 3:
                System.out.println("Enter time value:");
                double time = scanner.nextDouble();
                System.out.println("Convert from (hours, minutes, seconds):");
                String timeFrom = scanner.next().toLowerCase();
                System.out.println("Convert to (hours, minutes, seconds):");
                String timeTo = scanner.next().toLowerCase();

                double convertedTime = switch (timeFrom + "_" + timeTo) {
                    case "hours_minutes" -> TimeConverter.hoursToMinutes(time);
                    case "minutes_hours" -> TimeConverter.minutesToHours(time);
                    case "hours_seconds" -> TimeConverter.hoursToSeconds(time);
                    case "seconds_hours" -> TimeConverter.secondsToHours(time);
                    default -> {
                        System.out.println("Invalid conversion.");
                        yield -1;
                    }
                };

                if (convertedTime != -1) {
                    System.out.println("Converted Time: " + convertedTime + " " + timeTo);
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
