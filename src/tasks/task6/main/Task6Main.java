package tasks.task6.main;

import com.github.javafaker.Faker;
import tasks.task6.code.OnlineShop;
import tasks.task6.code.SmartPhone;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Task6Main {
    private static SmartPhone createFakeSmartPhones() {
        Faker faker = new Faker(new Locale("en-IND"));
        return new SmartPhone(faker.number().randomNumber(), faker.company().industry(),
                faker.number().randomDouble(2, 1000,50000),
                (byte) faker.number().numberBetween(4, 15));
    }

    private static Set<SmartPhone> createSetOfFakeSmartPhone(int number) {
        Set<SmartPhone> fakeSmartphoneSet = new HashSet<>();
        for (int index = 0; index < number; index++) {
            fakeSmartphoneSet.add(createFakeSmartPhones());
        }
        return fakeSmartphoneSet;
    }

    public static void main(String[] args) {
        OnlineShop onlineShop = new OnlineShop();
        Set<SmartPhone> newPhones = createSetOfFakeSmartPhone(8);

        System.out.println(newPhones);
        List<SmartPhone> smartPhoneList = onlineShop.getListOfSmartPhones(newPhones, (byte) 6);
        System.out.println(smartPhoneList);
        System.out.println(newPhones);
    }
}
