package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ItemRenameAvatarReq {
    public enum GGOKOJMMCDI {
        @Tag(tag=0) None ,
        @Tag(tag=1747) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public String avatarName = null;
    @Tag(tag=14) public Integer renameId = null;
}
