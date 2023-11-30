package com.oskarjohansson.dungeonrun.Model.Map;

import com.oskarjohansson.dungeonrun.Model.Monster.Bosses.IcaBoss;
import com.oskarjohansson.dungeonrun.Model.Monster.Bosses.KjellCOBoss;
import com.oskarjohansson.dungeonrun.Model.Monster.Bosses.SatsBoss;
import com.oskarjohansson.dungeonrun.Model.Monster.Bosses.TechWizOfDoom;
import com.oskarjohansson.dungeonrun.Model.Monster.EnemyParentModel;

import java.util.ArrayList;
import java.util.List;


public class TeacherLounge extends Level {

    public TeacherLounge() {

        List<EnemyParentModel> setMonsterList = new ArrayList<>();
        setMonsterList.add(new IcaBoss());
        setMonsterList.add(new SatsBoss());
        setMonsterList.add(new KjellCOBoss());
        setFinalBoss(new TechWizOfDoom());
        this.setMonsterList(setMonsterList);
        this.setLevelNumber("4");
        this.setLevelName("Dungeon of The Teachers Lounge");
    }
}
