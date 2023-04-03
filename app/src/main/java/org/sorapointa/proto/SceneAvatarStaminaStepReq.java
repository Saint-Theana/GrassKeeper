package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class SceneAvatarStaminaStepReq {
    public enum SceneAvatarStaminaStepReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=214) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Vector rot = null;
    @Tag(tag=9) public Boolean useClientRot = null;
}
