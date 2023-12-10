/*
3. Implement a Java program, Events, that generates a file containing simulated events
and provides functionality to read the events from the file in multiple iterations.

- Implement a method named generateEventsFile that takes a filename and the number of records as parameters. The number of records to be generated is final and has a value
of one million. The method should create a file containing events with the following
information for each record:
● Timestamp: A random timestamp
● Event Type: Randomly selected from a predefined array of event types ({"Login",
"Logout", "Purchase", "ViewPage", "Error"}).
● User ID: A random integer between 0 and 999.
The generated file should have one event per line.
Additionally, implement a method named readEventsFile that takes a filename as a
parameter. The method should read events from the file and print each event to the
console. It should read the file in 5 iterations.
In the main method, specify the filename (e.g., "events.txt"), call the generateEventsFile
method to generate the events file, and call the readEventsFile method to read and print
events from the file in multiple iterations.
* */

package Week10.LabCode.Exercise3;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

class Events1 {
    public static void generateEventsFile(String filename, int numberOfRecords) {
        String[] eventTypes = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename + ".txt"));
            Random random = new Random();
            for(int i = 0; i < numberOfRecords; i++) {
                LocalDateTime timestamp = LocalDateTime.now().minusDays(random.nextInt(365)).minusHours(random.nextInt(24)).minusMinutes(random.nextInt(60));
                String eventType = eventTypes[random.nextInt(eventTypes.length)];
                int id = random.nextInt(998) + 1;
                writer.write(timestamp + " - " + eventType + " - " + id + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readEventsFile(String filename) {
        Path path = Paths.get(filename);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename + ".txt"));
            List<String> lines = reader.lines().toList();
            for(String line : lines) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Events {
    public static void main(String[] args) {
        Events1.generateEventsFile("test", 5);
        Events1.readEventsFile("test");
    }
}