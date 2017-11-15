package chapter01.com.sun.service.impl;

import chapter01.com.sun.knights.Minstrel;
import chapter01.com.sun.service.Knight;
import chapter01.com.sun.service.Quest;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight(SlayDragonQuest slayDragonQuest) {
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
