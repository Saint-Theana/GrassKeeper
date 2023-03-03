package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo.*;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo;

public class InvestigationMonster {
    public enum LockState {
        @Tag(tag=0) LOCK_STATE_NONE ,
        @Tag(tag=1) LOCK_STATE_QUEST ;
    }

    @Tag(tag=9) public Boolean isAlive = null;
    @Tag(tag=3) public Integer refreshInterval = null;
    @Tag(tag=13) public Integer id = null;
    @Tag(tag=5) public Integer level = null;
    @Tag(tag=1) public Integer bossChestNum = null;
    @Tag(tag=12) public WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo = null;
    @Tag(tag=301) public Integer monsterId = null;
    @Tag(tag=14) public Vector pos = null;
    @Tag(tag=8) public Integer resin = null;
    @Tag(tag=4) public Integer maxBossChestNum = null;
    @Tag(tag=11) public Integer nextRefreshTime = null;
    @Tag(tag=285) public Integer groupId = null;
    @Tag(tag=10) public Integer sceneId = null;
    @Tag(tag=15) public Boolean isAreaLocked = null;
    @Tag(tag=2) public LockState lockState = null;
    @Tag(tag=7) public Integer nextBossChestRefreshTime = null;
    @Tag(tag=6) public Integer cityId = null;
}
