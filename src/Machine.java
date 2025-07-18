public class Machine {
    private String name;
    private String status;

    public Machine(String name) {
        this.name = name;
        this.status = "Stopped";
    }

    public void start() {
        if (status.equals("Running")) {
            System.out.println(name + " is already running.");
        } else {
            status = "Running";
            System.out.println(name + " started.");
        }
    }

    public void stop() {
        if (status.equals("Stopped")) {
            System.out.println(name + " is already stopped.");
        } else {
            status = "Stopped";
            System.out.println(name + " stopped.");
        }
    }

    public void reset() {
        status = "Stopped";
        System.out.println(name + " has been reset.");
    }

    public void simulateFault() {
        status = "Error";
        System.out.println(name + " has encountered an error.");
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
