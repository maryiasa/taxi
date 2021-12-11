package com.taxiagency.domain;

import java.util.Random;

public enum Route {
    Minsk_Moskva,Minsk_Litva,Minsk_Latvia,Minsk_Poland, Minsk_France;

    public static Route wishRoute() {
        Route[] routes = Route.values();
        Random generator = new Random();
        return routes[generator.nextInt(routes.length)];
    }
}
