package homework2.task3Phones;

/**
 * Created by ira on 20.02.15.
 */
public class IPhone5 extends IPhone{
    public IPhone5() {
        System.out.println("IPhone5 constructor");

        screenSize = 4;
    }

	/*@Override
	public void call(String number) {
		System.out.println("IPhone class is calling " + number);
	}*/

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("IPhone5 class is sending sms " + message + " to " + number);
    }
}
