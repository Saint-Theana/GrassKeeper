package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChatChannelUpdateNotify {
    @Tag(tag=3) public Integer channelId = null;
    @Tag(tag=15) public Boolean isCreate = null;
}
