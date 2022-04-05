package tasks.task6.code;

import java.util.List;
import java.util.Set;


public class OnlineShop {
    private void priceDecrease(SmartPhone smartPhone) {
        smartPhone.setSmartPhonePrice(smartPhone.getSmartPhonePrice() - smartPhone.getSmartPhonePrice() * 0.1);
    }

    public List<SmartPhone> getListOfSmartPhones(Set<SmartPhone> smartPhones, byte requiredScreenSize) {
        smartPhones.stream().filter(smartPhone -> smartPhone.getScreenSize() < requiredScreenSize)
                .forEach(this::priceDecrease);
        return smartPhones.stream()
                .filter(smartPhone -> smartPhone.getScreenSize() > requiredScreenSize)
                .toList();

    }

    public List<SmartPhone> findBudgetSmartPhones(Set<SmartPhone> smartPhones) {
        return smartPhones.stream().filter(smartPhone -> smartPhone.getSmartPhonePrice() <= 10000.0).toList();
    }
}
