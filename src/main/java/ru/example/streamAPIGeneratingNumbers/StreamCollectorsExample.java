package ru.example.streamAPIGeneratingNumbers;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsExample {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0)
        );

        System.out.println("Группировка по продуктам:" +'\n'+ groupByProduct(orders));
        System.out.println("Общая стоимость по продуктам:"+'\n'+ calculateTotalCosts(orders));
        System.out.println("Сортировка по общей стоимости:" +'\n'+ sortByTotalCost(orders));
        System.out.println("Три самых дорогих продукта:");
        getTopThreeProducts(orders).forEach(p -> System.out.printf("%s: %.2f%n", p.getProduct(), p.getCost()));

    }

    private static List<Order> getTopThreeProducts(List<Order> orders) {
        return orders.stream().sorted(Comparator.comparing(Order::getCost).reversed()).limit(3).collect(Collectors.toList());
    }

    private static List<Order> sortByTotalCost(List<Order> orders) {
        return orders.stream().sorted(Comparator.comparing(Order::getCost)).collect(Collectors.toList()).reversed();
    }

    private static Map<String, Double> calculateTotalCosts(List<Order> orders) {
      return   orders.stream().collect(
              Collectors.groupingBy(Order::getProduct, Collectors.summingDouble(Order::getCost)));
    }

    private static Map<String, List<Order>> groupByProduct(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getProduct));
    }

}
