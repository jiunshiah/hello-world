import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class hello {

	private static final String message = "Hello world";

	private static final Logger logger = LogManager.getLogger("hello");

	public static void main(String[] args) {
		System.out.println(message);
		logger.info(message);
	}

}
