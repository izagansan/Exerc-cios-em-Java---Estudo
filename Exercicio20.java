import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {

    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String dayOfWeek = appointmentDate.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        String month = appointmentDate.getMonth()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        int day = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear();

        int hour = appointmentDate.getHour();
        int minute = appointmentDate.getMinute();

        String amPm = hour >= 12 ? "PM" : "AM";
        hour = hour % 12;
        if (hour == 0) {
            hour = 12;
        }

        return "You have an appointment on " + dayOfWeek + ", " +
               month + " " + day + ", " + year + ", at " +
               hour + ":" + String.format("%02d", minute) + " " + amPm + ".";
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
