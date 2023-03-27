package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarChangeCostumeNotify {
    public enum AvatarChangeCostumeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1648) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public SceneEntityInfo entityInfo = null;
}
