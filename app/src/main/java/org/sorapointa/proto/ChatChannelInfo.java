package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChatChannelInfo {
    @Tag(tag=4) public Integer channelId = null;
    @Tag(tag=2) public Boolean isShield = null;
}
