package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayBattleUidOpNotify {
    @Tag(tag=7) public Integer op = null;
    @Tag(tag=9) public List<Integer> paramTargetList = new ArrayList<>();
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=3) public String paramStr = null;
    @Tag(tag=6) public List<Integer> uidList = new ArrayList<>();
    @Tag(tag=11) public Integer paramIndex = null;
    @Tag(tag=8) public Integer playType = null;
    @Tag(tag=12) public Integer paramDuration = null;
    @Tag(tag=15) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=5) public Integer playId = null;
}
