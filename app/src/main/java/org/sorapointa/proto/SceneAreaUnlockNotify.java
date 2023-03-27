package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneAreaUnlockNotify {
    public enum SceneAreaUnlockNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=258) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<Integer> areaList = new ArrayList<>();
    @Tag(tag=11) public Integer sceneId = null;
}
