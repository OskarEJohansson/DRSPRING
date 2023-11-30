package com.oskarjohansson.dungeonrun.Model.Map;

import com.oskarjohansson.dungeonrun.Model.Monster.Bosses.KjellCOBoss;
import com.oskarjohansson.dungeonrun.Model.Monster.EnemyParentModel;
import com.oskarjohansson.dungeonrun.Model.Monster.Monster.Nerd;

import java.util.ArrayList;
import java.util.List;

public class KjellCO extends Level {

    public KjellCO() {
        List<EnemyParentModel> setMonsterList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            setMonsterList.add(new Nerd());
        }
        this.setMonsterList(setMonsterList);
        this.setFinalBoss(new KjellCOBoss());
        this.setLevelNumber("3");
        this.setLevelName("Dungeon of Kjell & Co");
    }

}
