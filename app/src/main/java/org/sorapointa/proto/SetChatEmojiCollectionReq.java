package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetChatEmojiCollectionReq {
    public enum SetChatEmojiCollectionReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4060) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public ChatEmojiCollectionData chatEmojiCollectionData = null;
}
