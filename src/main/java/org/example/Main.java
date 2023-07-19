package org.example;

import org.example.oder.Order;
import org.example.oder.OrderRepozitary;
import restaurant.Restaurant;
import restaurant.RestaurantRepozitary;

import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID id = UUID.randomUUID();
        RestaurantRepozitary repozitary = RestaurantRepozitary.getInstance();
        repozitary.add(new Restaurant(id, LocalDateTime.now(), LocalDateTime.now(), null, null, "chorsu", "123456"));
        System.out.println(repozitary.findAll());
        repozitary.delet(id);
        System.out.println(repozitary.findAll());

    }
}