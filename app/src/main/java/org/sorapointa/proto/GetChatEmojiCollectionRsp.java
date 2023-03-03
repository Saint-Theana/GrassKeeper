package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatEmojiCollectionData.*;
import org.sorapointa.proto.ChatEmojiCollectionData;

public class GetChatEmojiCollectionRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public ChatEmojiCollectionData chatEmojiCollectionData = null;
}
