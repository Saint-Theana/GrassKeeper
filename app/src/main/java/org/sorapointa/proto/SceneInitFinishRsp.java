package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneInitFinishRsp {
    public enum SceneInitFinishRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=220) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer enterSceneToken = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
