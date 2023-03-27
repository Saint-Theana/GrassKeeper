package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayBattleUidOpNotify {
    public enum ScenePlayBattleUidOpNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4366) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=7) public Integer paramIndex = null;
    @Tag(tag=9) public List<Integer> paramTargetList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> uidList = new ArrayList<>();
    @Tag(tag=11) public Integer playId = null;
    @Tag(tag=2) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=5) public Integer playType = null;
    @Tag(tag=13) public Integer op = null;
    @Tag(tag=12) public String paramStr = null;
    @Tag(tag=8) public Integer paramDuration = null;
}
