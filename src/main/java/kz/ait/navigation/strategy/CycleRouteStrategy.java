package kz.ait.navigation.strategy;

public class CycleRouteStrategy implements RouteStrategy {

    @Override
    public String planRoute(String from, String to) {
        return String.format("[CYCLE] %s -> %s | bike lanes, ~5 km, ~18 min", from, to);
    }

    @Override
    public String name() {
        return "Cycle";
    }
}