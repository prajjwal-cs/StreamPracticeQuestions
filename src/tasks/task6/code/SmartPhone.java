package tasks.task6.code;

import java.util.Objects;

public class SmartPhone {
    private final long ImeiNumber;
    private final String smartPhoneName;
    private double smartPhonePrice;
    private byte screenSize;

    public SmartPhone() {
        this.ImeiNumber = 0;
        this.smartPhoneName = null;
        this.smartPhonePrice = 0.0;
        this.screenSize = 0;
    }

    public SmartPhone(long imeiNumber, String smartPhoneName, double smartPhonePrice, byte screenSize) {
        ImeiNumber = imeiNumber;
        this.smartPhoneName = smartPhoneName;
        this.smartPhonePrice = smartPhonePrice;
        this.screenSize = screenSize;
    }

    public long getImeiNumber() {
        return ImeiNumber;
    }

    public String getSmartPhoneName() {
        return smartPhoneName;
    }

    public double getSmartPhonePrice() {
        return smartPhonePrice;
    }

    public void setSmartPhonePrice(double smartPhonePrice) {
        this.smartPhonePrice = smartPhonePrice;
    }

    public byte getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(byte screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return ImeiNumber == that.ImeiNumber && Double.compare(that.smartPhonePrice, smartPhonePrice) == 0 && screenSize == that.screenSize && Objects.equals(smartPhoneName, that.smartPhoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ImeiNumber, smartPhoneName, smartPhonePrice, screenSize);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ImeiNumber=" + ImeiNumber +
                ", smartPhoneName='" + smartPhoneName + '\'' +
                ", smartPhonePrice=" + smartPhonePrice +
                ", screenSize=" + screenSize +
                '}';
    }
}
