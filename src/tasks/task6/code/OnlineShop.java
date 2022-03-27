package tasks.task6.code;

import java.util.List;
import java.util.Set;


public class OnlineShop {
    public List<SmartPhone> getListOfSmartPhones(Set<SmartPhone> smartPhones, byte requiredScreenSize) {
        smartPhones.stream().filter(smartPhone -> smartPhone.getScreenSize() < requiredScreenSize)
                .peek(e -> e.setSmartPhonePrice(e.getSmartPhonePrice() - e.getSmartPhonePrice() * 0.1));
        return smartPhones.stream()
                .filter(smartPhone -> smartPhone.getScreenSize() >= requiredScreenSize)
                .toList();
    }

    public List<SmartPhone> findBudgetSmartPhones(Set<SmartPhone> smartPhones) {
        return smartPhones.stream().filter(smartPhone -> smartPhone.getSmartPhonePrice() <= 10000.0).toList();
    }
}
