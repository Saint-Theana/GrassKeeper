package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo.*;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo;
import org.sorapointa.proto.InvestigationMonster_LockState.*;
import org.sorapointa.proto.InvestigationMonster_LockState;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class InvestigationMonster {
    @Tag(tag=1) public Integer nextRefreshTime = null;
    @Tag(tag=10) public Integer nextBossChestRefreshTime = null;
    @Tag(tag=8) public WeeklyBossResinDiscountInfo weeklyBossResinDiscountInfo = null;
    @Tag(tag=2) public Integer lockState = null;
    @Tag(tag=6) public Integer refreshInterval = null;
    @Tag(tag=80) public Integer groupId = null;
    @Tag(tag=13) public Integer sceneId = null;
    @Tag(tag=7) public Integer cityId = null;
    @Tag(tag=11) public Integer maxBossChestNum = null;
    @Tag(tag=4) public Vector pos = null;
    @Tag(tag=5) public Boolean isAreaLocked = null;
    @Tag(tag=3) public Integer level = null;
    @Tag(tag=15) public Integer id = null;
    @Tag(tag=1493) public Integer monsterId = null;
    @Tag(tag=12) public Integer bossChestNum = null;
    @Tag(tag=9) public Integer resin = null;
    @Tag(tag=14) public Boolean isAlive = null;
}
