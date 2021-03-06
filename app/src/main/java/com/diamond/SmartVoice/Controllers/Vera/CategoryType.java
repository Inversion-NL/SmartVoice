package com.diamond.SmartVoice.Controllers.Vera;

/**
 * @author Dmitriy Ponomarev
 */
public enum CategoryType {
    Controller(0, "Controller"),
    Interface(1, "Interface"),
    DimmableLight(2, "Dimmable Light"),
    Switch(3, "Switch"),
    SecuritySensor(4, "Security Sensor"),
    HVAC(5, "HVAC"),
    Camera(6, "Camera"),
    DoorLock(7, "Door Lock"),
    WindowCovering(8, "Window Covering"),
    RemoteControl(9, "Remote Control"),
    IRTransmitter(10, "IR Transmitter"),
    GenericIO(11, "Generic I/O"),
    GenericSensor(12, "Generic Sensor"),
    SerialPort(13, "Serial Port"),
    SceneController(14, "Scene Controller"),
    AV(15, "A/V"),
    HumiditySensor(16, "Humidity Sensor"),
    TemperatureSensor(17, "Temperature Sensor"),
    LightSensor(18, "Light Sensor"),
    ZWaveInterface(19, "Z-Wave Interface"),
    InsteonInterface(20, "Insteon Interface"),
    PowerMeter(21, "Power Meter"),
    AlarmPanel(22, "Alarm Panel"),
    AlarmPartition(23, "Alarm Partition"),
    Siren(24, "Siren"),
    Weather(25, "Weather"),
    PhilipsController(26, "Philips Controller"),
    Appliance(27, "Appliance"),
    UVSensor(28, "UV Sensor"),
    Unknown(-1, "Unknown");

    private int id;
    private String name;

    private CategoryType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static CategoryType getById(int id) {
        for (CategoryType cat : values())
            if (cat.id == id)
                return cat;
        return Unknown;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" + id + ", " + name + "}";
    }
}