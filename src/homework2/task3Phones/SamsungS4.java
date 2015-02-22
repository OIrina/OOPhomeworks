package homework2.task3Phones;

/**
 * Created by ira on 20.02.15.
 */
public class SamsungS4 extends Phone {

    public SamsungS4(){
        System.out.println("SamsungS4 constructor");

        hasWifi = true;
        screenSize = 5;
    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Samsung class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        message = "Hello, " + message;
        System.out.println("Samsung class is sending sms " + message + " to " + number);
    }
}
