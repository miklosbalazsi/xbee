import com.digi.xbee.api.XBeeDevice;
import com.digi.xbee.api.exceptions.XBeeException;


/**
 * XBee Java Library Reset Module sample application.
 *
 * <p>This example performs a software reset on the local XBee module.</p>
 *
 * <p>For a complete description on the example, refer to the 'ReadMe.txt' file
 * included in the root directory.</p>
 */
public class Main {
	/* Constants */

	// TODO Replace with the serial port where your module is connected.
	private static final String PORT = "/dev/ttyUSB0";
	// TODO Replace with the baud rate of your module.
	private static final int BAUD_RATE = 9600;

	/**
	 * Application main method.
	 *
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println(" +-----------------------------------------+");
		System.out.println(" |  XBee Java Library Reset Module Sample  |");
		System.out.println(" +-----------------------------------------+\n");

		XBeeDevice myDevice = new XBeeDevice(PORT, BAUD_RATE);

		try {
			myDevice.open();

			myDevice.reset();

			System.out.println(">> XBee module reset successfully");
		} catch (XBeeException e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			myDevice.close();
		}
	}



}
