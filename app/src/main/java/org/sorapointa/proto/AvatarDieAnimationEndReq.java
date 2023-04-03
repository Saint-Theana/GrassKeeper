package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AvatarDieAnimationEndReq {
    public enum AvatarDieAnimationEndReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1652) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Long dieGuid = null;
    @Tag(tag=4) public Integer skillId = null;
    @Tag(tag=10) public Vector rebornPos = null;
}
