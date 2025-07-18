import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FactoryController {
    private ArrayList<Machine> machines;
    private String logFile = "logs/factory_log.txt";

    public FactoryController() {
        machines = new ArrayList<>();
    }

    public void addMachine(Machine m) {
        machines.add(m);
    }

    public void startAll() {
        for (Machine m : machines) {
            m.start();
            log(m.getName() + " started");
        }
    }

    public void stopAll() {
        for (Machine m : machines) {
            m.stop();
            log(m.getName() + " stopped");
        }
    }

    public void resetAll() {
        for (Machine m : machines) {
            m.reset();
            log(m.getName() + " reset");
        }
    }

    public void showStatus() {
        System.out.println("\n--- Machine Status ---");
        for (Machine m : machines) {
            System.out.println(m.getName() + " => " + m.getStatus());
        }
        System.out.println("----------------------");
    }

    public void simulateRandomFault() {
        if (machines.size() > 0) {
            int index = (int) (Math.random() * machines.size());
            Machine faulty = machines.get(index);
            faulty.simulateFault();
            log(faulty.getName() + " error simulated");
        }
    }

    private void log(String text) {
        try {
            FileWriter fw = new FileWriter(logFile, true);
            fw.write(text + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Failed to write to log.");
        }
    }
}
