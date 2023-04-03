package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MultistageSettleWatcherInfo.*;
import org.sorapointa.proto.MultistageSettleWatcherInfo;

public class InBattleMechanicusSettleNotify {
    public enum InBattleMechanicusSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5369) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<MultistageSettleWatcherInfo> watcherList = new ArrayList<>();
    @Tag(tag=8) public Boolean isSuccess = null;
    @Tag(tag=15) public Integer realToken = null;
    @Tag(tag=1) public Integer totalToken = null;
    @Tag(tag=12) public Integer playIndex = null;
    @Tag(tag=13) public Integer difficultyPercentage = null;
    @Tag(tag=10) public Long sceneTimeMs = null;
    @Tag(tag=9) public Integer groupId = null;
}
