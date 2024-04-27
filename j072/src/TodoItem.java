import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
    private String title;
    private String description;
    private Date registrationDate;

    public TodoItem(String title, String description) {
        this.title = title;
        this.description = description;
        this.registrationDate = new Date();
    }

    // Getters & Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return "[" + title + "] " + description + " - " + dateFormat.format(registrationDate);
    }
}
