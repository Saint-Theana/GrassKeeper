package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarExpeditionStartReq {
    public enum AvatarExpeditionStartReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1656) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer hourTime = null;
    @Tag(tag=8) public Long avatarGuid = null;
    @Tag(tag=14) public Integer expId = null;
}
