package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CutSceneEndNotify {
    public enum CutSceneEndNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=299) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer cutsceneId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
