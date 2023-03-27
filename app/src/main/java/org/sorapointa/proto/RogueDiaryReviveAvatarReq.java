package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDiaryReviveAvatarReq {
    public enum RogueDiaryReviveAvatarReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8076) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public RogueDiaryAvatar reviveAvatar = null;
}
