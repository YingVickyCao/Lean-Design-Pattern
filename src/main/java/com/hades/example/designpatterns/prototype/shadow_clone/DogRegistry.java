package com.hades.example.designpatterns.prototype.shadow_clone;

import java.util.HashMap;

public class DogRegistry {
    HashMap<String, Dog> mMap = new HashMap<>();

    public DogRegistry() {
        mMap.put(WhiteDog.class.getSimpleName(), new WhiteDog("Teddy", 2));  // prototype for all white dogs
        mMap.put(BlackDog.class.getSimpleName(), new BlackDog("Ben", "Canned beef")); // prototype for all Drakons

        Dog whiteDog = new WhiteDog("Teddy", 2); // prototype for all white dogs
        Dog blackDog = new BlackDog("Ben", "Canned beef"); // prototype for all Drakons
        System.out.println(whiteDog.hashCode());    // 1973538135
        System.out.println(blackDog.hashCode());    // 1365202186
        System.out.println(whiteDog.toString());    // Dog{name='Teddy', age=2, food='null', ParamBean@'1586600255'}
        System.out.println(blackDog.toString());    // Dog{name='Ben', age=0, food='Canned beef', ParamBean@'474675244'}
        System.out.println();

        mMap.put(WhiteDog.class.getSimpleName(), whiteDog);
        mMap.put(BlackDog.class.getSimpleName(), blackDog);
    }

    Dog getDog(String type, String name) {
        Dog newDog = null;
        try {
            newDog = mMap.get(type).copy();
            newDog.setName(name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newDog;
    }
}
