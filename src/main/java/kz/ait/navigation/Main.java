package kz.ait.navigation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import kz.ait.navigation.strategy.CarRouteStrategy;
import kz.ait.navigation.strategy.CycleRouteStrategy;
import kz.ait.navigation.strategy.PublicTransportRouteStrategy;
import kz.ait.navigation.strategy.RouteStrategy;
import kz.ait.navigation.strategy.WalkRouteStrategy;


public class Main {

    public static void main(String[] args) {

        Map<String, RouteStrategy> registry = new LinkedHashMap<>();
        registry.put("car",   new CarRouteStrategy());
        registry.put("walk",  new WalkRouteStrategy());
        registry.put("cycle", new CycleRouteStrategy());
        registry.put("bus",   new PublicTransportRouteStrategy());

        NavigationContext navigator = new NavigationContext(registry.get("car"));

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nAvailable modes: " + registry.keySet()
                        + " | current: " + navigator.currentStrategyName());
                System.out.print("Choose mode (or 'exit'): ");
                String mode = scanner.nextLine().trim().toLowerCase();

                if (mode.equals("exit")) {
                    System.out.println("Bye.");
                    break;
                }

                RouteStrategy chosen = registry.get(mode);
                if (chosen == null) {
                    System.out.println("Unknown mode: " + mode);
                    continue;
                }

                navigator.setStrategy(chosen);

                System.out.print("From: ");
                String from = scanner.nextLine().trim();
                System.out.print("To:   ");
                String to = scanner.nextLine().trim();

                System.out.println("Route: " + navigator.buildRoute(from, to));
            }
        }
    }
}