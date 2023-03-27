package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReunionActivateNotify {
    public enum ReunionActivateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5060) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public ReunionBriefInfo reunionBriefInfo = null;
    @Tag(tag=5) public Boolean isActivate = null;
}
