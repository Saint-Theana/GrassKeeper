package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestRenameAvatarRsp {
    public enum LLGBKAMNLLC {
        @Tag(tag=0) None ,
        @Tag(tag=401) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public String avatarName = null;
    @Tag(tag=2) public Boolean isCheck = null;
    @Tag(tag=13) public Integer renameId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
