import java.util.Scanner;

//user I/O commands
public class UserIOConsoleImpl implements  UserIO{

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return scan.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return Integer.parseInt(scan.nextLine());
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.printf(prompt,min, max);
        int num = Integer.parseInt(scan.nextLine());
        while (num<min || max>100){
            System.out.println("Error not between the correct range.\nPlease enter an integer between 0 and 100");
            num = Integer.parseInt(scan.nextLine());
        }
        return num;
    }

    @Override
    public double readDouble(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return Double.parseDouble(scan.nextLine());
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner scan = new Scanner(System.in);
        System.out.printf(prompt,min, max);
        double num = Double.parseDouble(scan.nextLine());
        while (num<min || max>100){
            System.out.println("Error not between the correct range.\nPlease enter a float between 0 and 100");
            num = Double.parseDouble(scan.nextLine());
        }
        return num;
    }

    @Override
    public float readFloat(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return Float.parseFloat(scan.nextLine());
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner scan = new Scanner(System.in);
        System.out.printf(prompt,min, max);
        float num = Float.parseFloat(scan.nextLine());
        while (num<min || max>100){
            System.out.println("Error not between the correct range.\nPlease enter a float between 0 and 100");
            num = Float.parseFloat(scan.nextLine());
        }
        return num;
    }

    @Override
    public long readLong(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return Long.parseLong(scan.nextLine());
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        Scanner scan = new Scanner(System.in);
        System.out.printf(prompt,min, max);
        long num = Long.parseLong(scan.nextLine());
        while (num<min || max>100){
            System.out.println("Error not between the correct range.\nPlease enter a long between 0 and 100");
            num = Long.parseLong(scan.nextLine());
        }
        return num;
    }

}
