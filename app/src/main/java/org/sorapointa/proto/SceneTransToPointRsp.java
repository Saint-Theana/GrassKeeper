package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneTransToPointRsp {
    public enum SceneTransToPointRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=300) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer sceneId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer pointId = null;
}
