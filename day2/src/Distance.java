package day2programs;

public class Distance {
    public static void main(String[] args) {
        // Check if two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java Distance <x> <y>");
            return;
        }
        // Parse command-line arguments as integers
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[1]);

                // Calculate the Euclidean distance
                double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

                // Print the distance
                System.out.println("Euclidean distance from (" + x + " , " + y + ") to the origin (0, 0): " + distance);
            }
    }




