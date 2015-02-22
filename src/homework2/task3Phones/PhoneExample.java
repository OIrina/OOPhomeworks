package homework2.task3Phones;

/**
 * Created by ira on 20.02.15.
 */
public class PhoneExample {
    public static void main(String[] args) {
        // Phone p = new Phone();

        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screen size: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        System.out.println("Nokia3310 called to " + nokia.callCount + " number.");
        nokia.sendSMS("567-78-89", "text message");
        System.out.println("Nokia3310 sent sms to " + nokia.smsCount + " number.");

        System.out.println("----------------------------------");

        IPhone iphone = new IPhone();
        System.out.println("IPhone screen size: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        System.out.println("IPhone called to " + nokia.callCount + " number.");
        iphone.sendSMS("567-78-89", "text message");
        System.out.println("IPhone sent sms to " + nokia.smsCount + " number.");

        System.out.println("----------------------------------");

        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone screen size: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        System.out.println("IPhone5 called to " + nokia.callCount + " number.");
        iphone5.sendSMS("567-78-89", "text message");
        System.out.println("Iphone5 sent sms to " + nokia.smsCount + " number.");

        System.out.println("----------------------------------");

        SamsungS4 samsungS4 = new SamsungS4();
        System.out.println("SamsungS4 has wifi is: " + samsungS4.isHasWifi());
        System.out.println("SamsungS4 screen size: " + samsungS4.getScreenSize());
        samsungS4.call("222-55-22");
        System.out.println("SamsungS4 called to " + nokia.callCount + " number.");
        samsungS4.sendSMS("222-55-22", " Sveta! How are you?");
        System.out.println("Samsung sent sms to " + nokia.smsCount + " number.");

    }
}
