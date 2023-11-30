package com.oskarjohansson.dungeonrun.Model.Map;


import com.oskarjohansson.dungeonrun.Model.Monster.Bosses.SatsBoss;
import com.oskarjohansson.dungeonrun.Model.Monster.EnemyParentModel;
import com.oskarjohansson.dungeonrun.Model.Monster.Monster.Grunt;

import java.util.ArrayList;
import java.util.List;

public class Sats extends Level {

    public Sats() {
        List<EnemyParentModel> setMonsterList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            setMonsterList.add(new Grunt());
        }
        this.setMonsterList(setMonsterList);
        this.setFinalBoss(new SatsBoss());
        this.setLevelNumber("2");
        this.setLevelName("Dungeon of Sats");
    }

}
