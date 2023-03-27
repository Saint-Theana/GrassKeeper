package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MichiaeMatsuriRemoveChallengeMarkNotify {
    public enum MichiaeMatsuriRemoveChallengeMarkNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8168) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer groupId = null;
    @Tag(tag=8) public Integer gadgetId = null;
}
