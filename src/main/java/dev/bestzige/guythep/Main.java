package dev.bestzige.guythep;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================");
        testOSCase();
        System.out.println("==================================");
        testApplicationCase();
        System.out.println("==================================");
    }

    private static void testOSCase() {
        OS window = new OS("Windows 10", 250);
        OS mac = new OS("Mac OS", 500);
//
//        // test toString()
        System.out.println(window);
        System.out.println(mac);

        // test addApplication()
        Application app1 = new Application("Google Chrome", "Web Browser", 10);
        Application app2 = new Application("Microsoft Word", "Word Processor", 20);
        Application app3 = new Application("Microsoft Excel", "Spreadsheet", 30);
        Application app4 = new Application("Microsoft PowerPoint", "Presentation", 40);
        Application app5 = new Application("Microsoft OneNote", "Note Taking", 500);
        mac.addApplication(app1);
        mac.addApplication(app2);
        mac.addApplication(app3);
        mac.addApplication(app4);
        mac.addApplication(app5);

        // test removeApplication()
        mac.removeApplication(app5.getId());

        // test getApplication()
        System.out.println(mac.getApplicationIdByName("Google Chrome"));

        // test getter
        System.out.println("getId() = " + mac.getId());
        System.out.println("getName() = " + mac.getName());
        System.out.println("getStorageSize() = " + mac.getStorageSize());
        Application[] apps = mac.getApps();
        // check all app in mac
        for(Application app : apps) {
            System.out.println(app);
        }
        System.out.println("getUsedStorage() = " + mac.getUsedStorage());

    }

    private static void testApplicationCase() {
        Application app1 = new Application("Google Chrome", "Test", 100);
        Application app2 = new Application("Microsoft Word", "Test", 200);
        Application app3 = new Application("Microsoft Excel", "Test", 300);

        // test toString()
        System.out.println(app1);
        System.out.println(app2);
        System.out.println(app3);

        // test getter
        System.out.println(app1.getName());
        System.out.println(app1.getSize());
    }
}
