package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerWorldSceneInfo.*;
import org.sorapointa.proto.PlayerWorldSceneInfo;

public class PlayerWorldSceneInfoListNotify {
    public enum PlayerWorldSceneInfoListNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3198) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<PlayerWorldSceneInfo> infoList = new ArrayList<>();
}
