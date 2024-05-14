package de.telran.homeWorks;

import java.util.Comparator;


//Вы автоматизируете бизнес риелторов. у вас есть класс:
//   public class House {
//       int area; //площадь дома
//       int price; // цена
//       String city; // город
//       boolean hasFurniture; //продается с мебелью
//   }
//
//
//
//По умолчанию в вашем информационном хранилище дома сортируются по цене.
//
//Но иногда клиент хочет видеть информацию о домах в конкретном городе и отсортированную по цене.
//Реализуйте компаратор, который вы можете применить для показа клиенту в требуемом им формате.
//
//А если клиенту неожиданно захочет увидеть информацию, отсортированную в формате:
//"город - площадь дома", что вы будете делать?
public class House implements Comparator<House> {
    int area;
    int price;
    String city;
    boolean hasFurniture;

    @Override
    public int compare(House house1, House house2) {
        int cityCompare = house1.city.compareTo(house2.city);
        if (cityCompare != 0) {
            return cityCompare;
        } else {
            return Integer.compare(house1.area, house2.area);

        }
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }
}

