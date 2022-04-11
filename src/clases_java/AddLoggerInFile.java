package clases_java;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 * 
 * @author ik_1dw3
 *
 */
public class AddLoggerInFile {
/**
 * Método para grabar datos en fichero
 * @param string Mensaje que quieres grabar
 */
	public static void grabar(String string) {
		Logger logger = Logger.getLogger("MyLog");
		FileHandler fileHandler;
		try {
			fileHandler = new FileHandler("MyLogFile.txt", true);
			logger.addHandler(fileHandler);
			SimpleFormatter simpleFormatter = new SimpleFormatter();
			fileHandler.setFormatter(simpleFormatter);
			logger.info(string);
//        MainRA mainRA = new MainRA();
//        MainRA.main(args);

		} catch (SecurityException e) {
			logger.info("Exception:" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.info("IO Exception:" + e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			logger.info("NumberFormatException" + e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			logger.info("Null Pointer Exception" + e.getMessage());
			e.printStackTrace();
		}

	}
/**
 * Método llamar el método grabar()
 * @param string Mensaje que quieres grabar
 */
	public static void Log(String string) {
		grabar(string);
	}

}
