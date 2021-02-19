package com.broniec.settlers.mapObject.village;

import com.broniec.settlers.building.Building;
import com.broniec.settlers.building.townHall.TownHall;
import com.broniec.settlers.mapObject.Coordinate;
import com.broniec.settlers.mapObject.MapObject;
import com.broniec.settlers.user.User;
import lombok.*;

import java.util.Collections;
import java.util.Set;

@Getter
public final class Village extends MapObject {
    @Setter
    private User owner;
    private final Set<Building> buildings;
    private int ownedGold;

    public Village(Coordinate coordinate) {
        super(coordinate);
        buildings = Collections.singleton(
                new TownHall()
        );
    }
}
