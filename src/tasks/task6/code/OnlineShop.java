package tasks.task6.code;

import java.util.List;
import java.util.Set;


public class OnlineShop {
    public List<SmartPhone> getListOfSmartPhones(Set<SmartPhone> smartPhones, byte requiredScreenSize) {
        smartPhones.stream()
                .filter(smartPhone -> smartPhone.getScreenSize() >= requiredScreenSize);
        smartPhones.stream().filter(smartPhone -> smartPhone.getScreenSize() < requiredScreenSize)
                .peek(e -> e.setSmartPhonePrice(e.getSmartPhonePrice() - e.getSmartPhonePrice() * 0.1));
        return smartPhones.stream().toList();
    }

    public List<SmartPhone> findBudgetSmartPhones(Set<SmartPhone> smartPhones) {
        return List.of();
    }
}
