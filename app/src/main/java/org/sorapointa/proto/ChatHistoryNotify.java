package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatInfo.*;
import org.sorapointa.proto.ChatInfo;

public class ChatHistoryNotify {
    @Tag(tag=9) public List<ChatInfo> chatInfo = new ArrayList<>();
    @Tag(tag=12) public Integer channelId = null;
}
