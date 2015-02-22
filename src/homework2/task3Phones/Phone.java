package homework2.task3Phones;

/**
 * Created by ira on 20.02.15.
 */
public abstract class Phone {
    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected int callCount;
    protected int smsCount;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number) {
        callCount++;
    }

    public void sendSMS(String number, String message){
        smsCount++;
    }
}
