package exercise23.base;

import java.util.Scanner;

public class Solution23 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Is the car silent when you turn the key? ");
        String turnKey = in.nextLine();

        if(turnKey.equals("Yes")) {
            System.out.println("Are the battery terminals corroded? ");
            String batteryTerm = in.nextLine();
            if(batteryTerm.equals("Yes")) {
                System.out.println("Clean terminals and try starting again.");
            }
            else if (batteryTerm.equals("No")) {
                System.out.println("Replace cables and try again.");
            }
        }
        else if (turnKey.equals("No")) {
            System.out.println("Does the car make a slicking noise? ");
            String slickingNoise = in.nextLine();
            if (slickingNoise.equals("Yes")) {
                System.out.println("Replace the battery");
            }
            else if (slickingNoise.equals("No")) {
                System.out.println("Does the car crank up but fail to start? ");
                String crankToStart = in.nextLine();
                if(crankToStart.equals("Yes")) {
                    System.out.println("Check spark plug connections.");
                }
                else if (crankToStart.equals("No")) {
                    System.out.println("Does the engine start and then die? ");
                    String engineDie = in.nextLine();
                    if (engineDie.equals("Yes")) {
                        System.out.println("Does you car have fuel injection? ");
                        String fuelInjection = in.nextLine();
                        if (fuelInjection.equals("Yes")) {
                            System.out.println("Get it in for service.");
                        }
                        else if (fuelInjection.equals("No")) {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if (engineDie.equals("No")) {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }

    }
}
