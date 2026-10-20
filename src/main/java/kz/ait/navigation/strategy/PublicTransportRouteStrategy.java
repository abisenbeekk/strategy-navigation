package kz.ait.navigation.strategy;


public class PublicTransportRouteStrategy implements RouteStrategy {

    @Override
    public String planRoute(String from, String to) {
        return String.format("[BUS]   %s -> %s | bus 12 + metro, ~6 km, ~35 min", from, to);
    }

    @Override
    public String name() {
        return "PublicTransport";
    }
}