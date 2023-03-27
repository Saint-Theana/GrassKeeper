package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneAvatarStaminaStepRsp {
    public enum SceneAvatarStaminaStepRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=224) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Boolean useClientRot = null;
    @Tag(tag=6) public Vector rot = null;
}
