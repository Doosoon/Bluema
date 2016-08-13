package com.doosoon.home.bluema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by doosoon on 2016-08-13.
 */
public class DataManager {

    public static class CityData {
        CityData(String name, int price, int hotel, int building, int villa) {
            this.name = name;
            this.price = price;
            this.hotelPrice = hotel;
            this.buildingPrice = building;
            this.villaPrice = villa;
        }

        String name;
        int price;
        int hotelPrice;
        int buildingPrice;
        int villaPrice;
    }

    private static final List<CityData> mArrayCityData = Arrays.asList(
            new CityData("타이베이", 5, 25, 15, 5),
            new CityData("홍콩", 8, 25, 15, 5),
            new CityData("마닐라", 8, 25, 15, 5),
            new CityData("제주도", 20, 0, 0, 0),
            new CityData("싱가포르", 10, 25, 15, 5),
            new CityData("카이로", 10, 25, 15, 5),
            new CityData("이스탄불", 12, 25, 15, 5),
            new CityData("아테네", 14, 50, 30, 10),
            new CityData("코펜하겐", 16, 50, 30, 10),
            new CityData("스톡홀롬", 16, 50, 30, 10),
            new CityData("콩코드 여객기", 20, 0, 0, 0),
            new CityData("취리히", 18, 50, 30, 10),
            new CityData("베를린", 18, 50, 30, 10),
            new CityData("몬트리올", 20, 50, 30, 10),
            new CityData("부에노스 아이레스", 22, 75, 45, 15),
            new CityData("상파울루", 24, 75, 45, 15),
            new CityData("시드니", 24, 75, 45, 15),
            new CityData("부산", 50, 0, 0, 0),
            new CityData("하와이", 26, 75, 45, 15),
            new CityData("리스본", 26, 75, 45, 15),
            new CityData("퀸 에리자베스호", 30, 0, 0, 0),
            new CityData("마드리드", 28, 75, 45, 15),
            new CityData("도쿄", 30, 100, 60, 20),
            new CityData("콜럼비아호", 45, 0, 0, 0),
            new CityData("파리", 32, 100, 60, 20),
            new CityData("로마", 32, 100, 60, 20),
            new CityData("런던", 35, 100, 60, 20),
            new CityData("뉴욕", 35, 100, 60, 20),
            new CityData("서울올림픽", 100, 0, 0, 0));

    public DataManager() {

    }

    int getCityCount() {
        return mArrayCityData.size();
    }

    CityData getCityData(int index) {
        if (index < 0 || index >= getCityCount())
            return null;
        return mArrayCityData.get(index);
    }
}
