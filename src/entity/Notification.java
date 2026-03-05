package entity;

public class Notification {
    private String notification_id;
    private String notification_type;

    public Notification(String notification_id, String notification_type) {
        this.notification_id = notification_id;
        this.notification_type = notification_type;
    }

    public String getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(String notification_id) {
        this.notification_id = notification_id;
    }

    public String getNotification_type() {
        return notification_type;
    }

    public void setNotification_type(String notification_type) {
        this.notification_type = notification_type;
    }


}
