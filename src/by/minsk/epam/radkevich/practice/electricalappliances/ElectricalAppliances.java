package by.minsk.epam.radkevich.practice.electricalappliances;

public abstract class ElectricalAppliances {
    private String name;
    private int powerOfEngine;
    private boolean isPlugged;

    public ElectricalAppliances(String name, int powerOfEngine, boolean isPlugged) {
        this.name = name;
        this.powerOfEngine = powerOfEngine;
        this.isPlugged = isPlugged;
    }

    public void plug () {
        if (!isPlugged)
            isPlugged=true;
    }

    public void unplug () {
        if (isPlugged)
            isPlugged=false;
    }

    public int getCurrentPower() {
        return isPlugged ? powerOfEngine : 0;
    }

    public String getName () {
        return name;
    }
}
