package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestRenameAvatarReq {
    public enum AMBGOMJIBBP {
        @Tag(tag=0) None ,
        @Tag(tag=467) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Boolean isCheck = null;
    @Tag(tag=9) public Integer renameId = null;
    @Tag(tag=11) public String avatarName = null;
}
