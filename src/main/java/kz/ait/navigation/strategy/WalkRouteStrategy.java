package kz.ait.navigation.strategy;

public class WalkRouteStrategy implements RouteStrategy {

    @Override
    public String planRoute(String from, String to) {
        return String.format("[WALK]  %s -> %s | pedestrian paths, ~3 km, ~40 min", from, to);
    }

    @Override
    public String name() {
        return "Walk";
    }
}