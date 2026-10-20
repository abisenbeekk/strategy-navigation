package kz.ait.navigation.strategy;

public class CarRouteStrategy implements RouteStrategy {

    @Override
    public String planRoute(String from, String to) {
        return String.format("[CAR]   %s -> %s | fastest roads, ~15 km, ~20 min", from, to);
    }

    @Override
    public String name() {
        return "Car";
    }
}