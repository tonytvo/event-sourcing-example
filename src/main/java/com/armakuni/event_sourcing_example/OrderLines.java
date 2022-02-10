package com.armakuni.event_sourcing_example;

import com.armakuni.event_sourcing_example.events.ItemAdded;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class OrderLines {
    HashMap<ItemCode, Quantity> lines = new HashMap<ItemCode, Quantity>();

    public OrderLines() {
    }

    void incrementQuantity(ItemAdded event) {
        var quantity = lines.containsKey(event.itemCode)
                ? lines.get(event.itemCode).increment()
                : Quantity.of(1);

        lines.put(event.itemCode, quantity);
    }

    boolean isEmpty() {
        return lines.isEmpty();
    }

    List<IndividualOrderLine> getOrderItems() {
        return lines.entrySet().stream()
                .map((entry) -> new IndividualOrderLine(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }
}