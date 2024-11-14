public class TimeCalc {
    public static void main(String[] args) {
        // Parse time and minutes to add
        String[] timeParts = args[0].split(":");
        int hh = Integer.parseInt(timeParts[0]);
        int mm = Integer.parseInt(timeParts[1]);
        int minutesToAdd = Integer.parseInt(args[1]);

        // Initial input display for debugging
        // System.out.println("Hours: " + hh);
        // System.out.println("Minutes: " + mm);
        // System.out.println("Minutes to add: " + minutesToAdd);

        // Calculate total minutes from current time and minutesToAdd
        int totalMinutes = (hh * 60) + mm + minutesToAdd;

        // Compute new hour and minute values in 24-hour format
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        // Uncomment for debugging
        // System.out.println("New hours: " + newHours);
        // System.out.println("New minutes: " + newMinutes);

        // Format the output with leading zeros
        System.out.printf("%02d:%02d\n", newHours, newMinutes);
    }
}
