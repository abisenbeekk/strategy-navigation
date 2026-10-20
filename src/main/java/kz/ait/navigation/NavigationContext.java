package kz.ait.navigation;

import kz.ait.navigation.strategy.RouteStrategy;


public class NavigationContext {

    private RouteStrategy strategy;

    public NavigationContext(RouteStrategy initialStrategy) {
        if (initialStrategy == null) {
            throw new IllegalArgumentException("Initial strategy must not be null");
        }
        this.strategy = initialStrategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy must not be null");
        }
        this.strategy = strategy;
    }

    public String currentStrategyName() {
        return strategy.name();
    }

    public String buildRoute(String from, String to) {
        return strategy.planRoute(from, to);
    }
}
