package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusExcapeMonsterNotify {
    public enum InBattleMechanicusExcapeMonsterNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5320) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer excapedMonsterNum = null;
}
