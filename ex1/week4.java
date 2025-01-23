public class week {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number between 1 and 7 as a command-line argument.");
            return;
        }
        int number = Integer.parseInt(args[0]);
        if (number < 1 || number > 7) {
            System.out.println("Please enter a valid number between 1 and 7.");
            return;
        }
        String weekday = "";
        switch (number) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
        }
        System.out.println("The day of the week is: " + weekday);
    }
}
