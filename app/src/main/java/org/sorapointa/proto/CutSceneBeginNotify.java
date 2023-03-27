package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CutSceneBeginNotify {
    public enum CutSceneBeginNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=217) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Boolean isWaitOthers = null;
    @Tag(tag=14) public List<CutSceneExtraParam> extraParamList = new ArrayList<>();
    @Tag(tag=2) public Integer cutsceneId = null;
}
