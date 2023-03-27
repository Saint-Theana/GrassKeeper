package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialDunegonFailNotify {
    public enum MistTrialDunegonFailNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8775) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer dungeonId = null;
}
