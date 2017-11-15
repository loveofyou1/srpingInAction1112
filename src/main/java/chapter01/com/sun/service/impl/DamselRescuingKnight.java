package chapter01.com.sun.service.impl;

import chapter01.com.sun.service.Knight;

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public void embarkOnQuest() {
        quest.embark();
    }

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
        /**
         * 强耦合
         */

    }
}
