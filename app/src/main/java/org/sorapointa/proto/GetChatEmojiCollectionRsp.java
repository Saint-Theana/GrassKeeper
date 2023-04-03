package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatEmojiCollectionData.*;
import org.sorapointa.proto.ChatEmojiCollectionData;

public class GetChatEmojiCollectionRsp {
    public enum GetChatEmojiCollectionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4091) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public ChatEmojiCollectionData chatEmojiCollectionData = null;
}
