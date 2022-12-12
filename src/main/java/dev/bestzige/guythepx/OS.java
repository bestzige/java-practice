package dev.bestzige.guythep;

import java.util.Arrays;

public class OS {

    private int id;
    private static int lastestId;
    private String name;
    private Application[] apps;
    private int storageSize;
    private int usedStorage;
    private int count;

    public OS(String name, int storageSize) {
        this.id = lastestId++;
        this.name = name;
        this.storageSize = storageSize;
        this.apps = new Application[1];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Application[] getApps() {
        return apps;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public int getUsedStorage() {
        return usedStorage;
    }

    public boolean addApplication(Application app) {
        if(app == null) return false;
        if(usedStorage + app.getSize() > storageSize) return false;

        // check apps array is full or not
        if(count == apps.length) {
            // create new array with plus 1 size
            Application[] temp = new Application[apps.length + 1];
            for(int i = 0; i < apps.length; i++) {
                temp[i] = apps[i];
            }
            apps = temp;
        }

        // add app to apps array
        apps[count++] = app;
        usedStorage += app.getSize();
        return true;
    }

    public void removeApplication(int id) {
        // return if apps array is null
        if(apps == null) return;

        Application[] temp = new Application[--count];
        for(int i = 0, tempCount = 0; i < count; i++) {
            if(apps[i].getId() == id) {
                // remove size of app from usedStorage
                usedStorage -= apps[i].getSize();
                continue; // use continue to skip this app
            }
            temp[tempCount++] = apps[i];
        }

        apps = temp;
    }

    public Application getApplicationIdByName(String name) {

        // return null if apps array is null
        if(apps != null) {
            // loop apps array to find app by name
            for(int i = 0; i < count; i++) {
                if(apps[i].getName().equals(name)) {
                    return apps[i];
                }
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "OS{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", apps=" + Arrays.toString(apps) +
                ", storageSize=" + storageSize +
                ", usedStorage=" + usedStorage +
                ", count=" + count +
                '}';
    }
}
