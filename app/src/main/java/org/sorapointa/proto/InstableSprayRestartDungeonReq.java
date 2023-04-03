package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InstableSprayAvatarInfo.*;
import org.sorapointa.proto.InstableSprayAvatarInfo;

public class InstableSprayRestartDungeonReq {
    public enum IOEAANEKHFD {
        @Tag(tag=0) None ,
        @Tag(tag=20911) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public List<InstableSprayAvatarInfo> avatarInfoList = new ArrayList<>();
}
