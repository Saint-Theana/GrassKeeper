package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneTimeNotify {
    public enum SceneTimeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=232) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Boolean isPaused = null;
    @Tag(tag=10) public Long sceneTime = null;
    @Tag(tag=13) public Integer sceneId = null;
}
