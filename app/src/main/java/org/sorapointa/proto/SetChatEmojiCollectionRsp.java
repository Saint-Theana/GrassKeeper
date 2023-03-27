package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetChatEmojiCollectionRsp {
    public enum SetChatEmojiCollectionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4004) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
