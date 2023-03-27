package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusConfirmCardNotify {
    public enum InBattleMechanicusConfirmCardNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5378) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer playerUid = null;
    @Tag(tag=1) public Integer cardId = null;
    @Tag(tag=7) public Integer playIndex = null;
    @Tag(tag=12) public Integer groupId = null;
}
