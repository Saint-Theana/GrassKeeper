package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NpcTalkStateNotify {
    public enum NpcTalkStateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=481) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Boolean isBan = null;
}
