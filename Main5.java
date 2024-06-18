package inheritance;
interface Logger {
    // Abstract method to log a message
    void log(String message);
    
    // Default method to provide a default logging behavior
    default void defaultLog() {
        System.out.println("Logging default message");
    }
}

class FileLogger implements Logger {
    // Implementation of log method to write to a file
    @Override
    public void log(String message) {
        // Code to write message to a file
        System.out.println("Logging to file: " + message);
    }
}

class ConsoleLogger implements Logger {
    // Implementation of log method to print to console
    @Override
    public void log(String message) {
        System.out.println("Logging to console: " + message);
    }
}

public class Main5 {

	public static void main(String[] args) {
		// Creating instances of FileLogger and ConsoleLogger
        Logger fileLogger = new FileLogger();
        Logger consoleLogger = new ConsoleLogger();
        
        // Calling log method for both loggers
        fileLogger.log("File Logger: Writing to file");
        consoleLogger.log("Console Logger: Printing to console");
        
        // Calling defaultLog method for both loggers
        fileLogger.defaultLog();
        consoleLogger.defaultLog();
	}

}
