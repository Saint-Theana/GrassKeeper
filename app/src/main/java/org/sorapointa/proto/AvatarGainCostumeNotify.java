package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarGainCostumeNotify {
    public enum AvatarGainCostumeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1714) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer costumeId = null;
}
