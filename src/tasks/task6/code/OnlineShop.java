package tasks.task6.code;

import java.util.List;
import java.util.Set;


public class OnlineShop {
    private void priceDecrease(SmartPhone smartPhone) {
        smartPhone.setSmartPhonePrice(smartPhone.getSmartPhonePrice() - smartPhone.getSmartPhonePrice() * 0.1);
    }

    public List<SmartPhone> getListOfSmartPhones(Set<SmartPhone> smartSmartPhones, byte requiredScreenSize) {
        smartSmartPhones.stream().filter(smartSmartPhone -> smartSmartPhone.getScreenSize() < requiredScreenSize)
                .forEach(this::priceDecrease);
        return smartSmartPhones.stream()
                .filter(smartSmartPhone -> smartSmartPhone.getScreenSize() > requiredScreenSize)
                .toList();

    }

    public List<SmartPhone> findBudgetSmartPhones(Set<SmartPhone> smartSmartPhones) {
        return smartSmartPhones.stream().filter(smartSmartPhone -> smartSmartPhone.getSmartPhonePrice() <= 10000.0).toList();
    }
}
