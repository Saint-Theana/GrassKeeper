package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Reward.*;
import org.sorapointa.proto.Reward;

public class GrantRewardNotify {
    public enum GrantRewardNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=622) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Reward reward = null;
}
