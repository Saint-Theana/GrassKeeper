package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneEntityUpdateNotify {
    public enum SceneEntityUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3388) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer appearType = null;
    @Tag(tag=2) public Integer param = null;
    @Tag(tag=7) public List<SceneEntityInfo> entityList = new ArrayList<>();
}
