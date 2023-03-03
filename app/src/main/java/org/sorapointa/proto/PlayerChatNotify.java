package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatInfo.*;
import org.sorapointa.proto.ChatInfo;

public class PlayerChatNotify {
    @Tag(tag=3) public ChatInfo chatInfo = null;
    @Tag(tag=6) public Integer channelId = null;
}
