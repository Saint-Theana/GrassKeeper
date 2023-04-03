package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InstableSprayAvatarInfo.*;
import org.sorapointa.proto.InstableSprayAvatarInfo;

public class InstableSpraySwitchTeamReq {
    public enum OGDEKKEJBFI {
        @Tag(tag=0) None ,
        @Tag(tag=23451) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public List<InstableSprayAvatarInfo> avatarInfoList = new ArrayList<>();
}
