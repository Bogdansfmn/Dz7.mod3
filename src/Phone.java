import java.util.ArrayList;
import java.util.List;

public class Phone implements Comparable<Phone>{
    String phoneCompany;
    String phoneModel;
    int phonePrice;
    Phone (String company, String model, int price) {
        phoneCompany = company;
        phoneModel = model;
        phonePrice = price;
    }

    @Override
    public int compareTo(Phone o) {
        return this.phonePrice - o.phonePrice;
    }

    @Override
    public String toString() {
        return phoneModel + " from " + phoneCompany + " for " + phonePrice;
    }

    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        System.out.println();
        System.out.println("Телефончики: \n");
        phones.add(new Phone("Apple", "iPhone 6", 5000));
        phones.add(new Phone("Huawei", "Ultra Mega Huawei Phone", 30000));
        phones.add(new Phone("Samsung", "Galaxy S22", 60000));
        phones.add(new Phone("Apple", "iPhone 13 Pro Max Ultra 128Tb", 100000));
        phones.add(new Phone("Cum™", "CumShot E mini",999999999));

        phones.stream().sorted().forEach(phone -> System.out.println(phone));

        System.out.println();
        System.out.println("\nАйфончики: \n");

        List<Phone> applePhones = phones.stream().filter(phone -> (phone.phoneCompany.contains("Apple"))).toList();

        applePhones.stream().forEach(iPhone -> System.out.println(iPhone));
    }
}
