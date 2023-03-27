package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneDataNotify {
    public enum SceneDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3295) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<String> levelConfigNameList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> sceneTagIdList = new ArrayList<>();
}
