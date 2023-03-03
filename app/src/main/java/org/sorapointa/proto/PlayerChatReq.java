package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatInfo.*;
import org.sorapointa.proto.ChatInfo;

public class PlayerChatReq {
    @Tag(tag=13) public Integer channelId = null;
    @Tag(tag=15) public ChatInfo chatInfo = null;
}
