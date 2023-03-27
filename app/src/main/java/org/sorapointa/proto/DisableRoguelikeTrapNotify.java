package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DisableRoguelikeTrapNotify {
    public enum DisableRoguelikeTrapNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8726) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer cardId = null;
}
