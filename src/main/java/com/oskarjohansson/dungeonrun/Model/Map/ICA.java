package com.oskarjohansson.dungeonrun.Model.Map;


import com.oskarjohansson.dungeonrun.Model.Monster.Bosses.IcaBoss;
import com.oskarjohansson.dungeonrun.Model.Monster.EnemyParentModel;
import com.oskarjohansson.dungeonrun.Model.Monster.Monster.Minion;

import java.util.ArrayList;
import java.util.List;

public class ICA extends Level {

    public ICA() {

        List<EnemyParentModel> setMonsterList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            setMonsterList.add(new Minion());
        }
        this.setMonsterList(setMonsterList);
        this.setFinalBoss(new IcaBoss());
        this.setLevelNumber("1");
        this.setLevelName("Dungeon of Ica");
    }

}
