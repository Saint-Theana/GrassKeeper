package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneForceUnlockNotify {
    public enum SceneForceUnlockNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=285) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Boolean isAdd = null;
    @Tag(tag=14) public List<Integer> forceIdList = new ArrayList<>();
}
