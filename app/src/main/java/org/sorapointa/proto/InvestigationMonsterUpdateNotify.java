package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InvestigationMonsterUpdateNotify {
    public enum InvestigationMonsterUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1919) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public InvestigationMonster investigationMonster = null;
}
