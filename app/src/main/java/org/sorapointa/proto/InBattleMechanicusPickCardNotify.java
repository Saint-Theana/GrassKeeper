package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusPickCardNotify {
    public enum InBattleMechanicusPickCardNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5314) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer playIndex = null;
    @Tag(tag=5) public Integer groupId = null;
    @Tag(tag=9) public Integer playerUid = null;
    @Tag(tag=8) public Integer cardId = null;
}
