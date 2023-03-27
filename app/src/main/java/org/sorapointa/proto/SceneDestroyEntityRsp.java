package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneDestroyEntityRsp {
    public enum SceneDestroyEntityRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=245) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer entityId = null;
}
