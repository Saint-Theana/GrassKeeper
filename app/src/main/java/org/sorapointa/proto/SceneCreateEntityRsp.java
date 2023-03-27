package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneCreateEntityRsp {
    public enum SceneCreateEntityRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=273) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=4) public CreateEntityInfo entity = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
