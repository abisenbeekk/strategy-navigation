package kz.ait.navigation.strategy;


public interface RouteStrategy {


    String planRoute(String from, String to);


    String name();
}