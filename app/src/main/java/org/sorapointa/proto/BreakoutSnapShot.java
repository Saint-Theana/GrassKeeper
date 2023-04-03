package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BreakoutPhysicalObject.*;
import org.sorapointa.proto.BreakoutPhysicalObject;
import org.sorapointa.proto.BreakoutAction.*;
import org.sorapointa.proto.BreakoutAction;
import org.sorapointa.proto.BreakoutSpawnPoint.*;
import org.sorapointa.proto.BreakoutSpawnPoint;
import org.sorapointa.proto.BreakoutElementReactionCounter.*;
import org.sorapointa.proto.BreakoutElementReactionCounter;
import org.sorapointa.proto.BreakoutSyncConnectUidInfo.*;
import org.sorapointa.proto.BreakoutSyncConnectUidInfo;

public class BreakoutSnapShot {
    @Tag(tag=1) public Long clientGameTime = null;
    @Tag(tag=2) public Long serverGameTime = null;
    @Tag(tag=3) public List<BreakoutPhysicalObject> ballList = new ArrayList<>();
    @Tag(tag=4) public List<BreakoutPhysicalObject> physicalObjectList = new ArrayList<>();
    @Tag(tag=5) public List<BreakoutAction> actionList = new ArrayList<>();
    @Tag(tag=6) public Integer waveIndex = null;
    @Tag(tag=7) public Boolean isFinish = null;
    @Tag(tag=8) public Integer score = null;
    @Tag(tag=9) public Integer combo = null;
    @Tag(tag=10) public Integer maxCombo = null;
    @Tag(tag=11) public Integer lifeCount = null;
    @Tag(tag=12) public Integer waveSuiteIndex = null;
    @Tag(tag=13) public List<BreakoutSpawnPoint> spawnPointList = new ArrayList<>();
    @Tag(tag=14) public Integer remainingBossHp = null;
    @Tag(tag=15) public List<BreakoutElementReactionCounter> brickElementReactionList = new ArrayList<>();
    @Tag(tag=16) public List<BreakoutElementReactionCounter> ballElementReactionList = new ArrayList<>();
    @Tag(tag=17) public List<BreakoutSyncConnectUidInfo> uidInfoList = new ArrayList<>();
    @Tag(tag=18) public List<BreakoutPhysicalObject> dynamicObjectList = new ArrayList<>();
    @Tag(tag=19) public List<Integer> idIndexList = new ArrayList<>();
    @Tag(tag=20,isSigned=true) public Integer rawClientGameTime = null;
}
