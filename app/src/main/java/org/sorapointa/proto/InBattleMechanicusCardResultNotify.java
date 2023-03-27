package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusCardResultNotify {
    public static class MapPlayerConfirmedCardMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum InBattleMechanicusCardResultNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5316) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer playIndex = null;
    @Tag(tag=4) public Long waitBeginTimeUs = null;
    @Tag(tag=5) public List<InBattleMechanicusCardInfo> cardList = new ArrayList<>();
    @Tag(tag=12) public List<MapPlayerConfirmedCardMap> playerConfirmedCardMap = new ArrayList<>();
    @Tag(tag=15) public Integer groupId = null;
    @Tag(tag=9) public Integer waitSeconds = null;
}
