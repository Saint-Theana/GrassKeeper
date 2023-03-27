package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionChallengeFinishedNotify {
    public enum ExpeditionChallengeFinishedNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2094) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer id = null;
}
