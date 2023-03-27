package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneCreateEntityReq {
    public enum SceneCreateEntityReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=228) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Boolean isDestroyWhenDisconnect = null;
    @Tag(tag=9) public CreateEntityInfo entity = null;
    @Tag(tag=1) public Integer reason = null;
}
