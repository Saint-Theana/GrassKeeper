package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TrialAvatarInDungeonIndexNotify {
    public enum TrialAvatarInDungeonIndexNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2078) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer trialAvatarIndexId = null;
}
