package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatInfo.*;
import org.sorapointa.proto.ChatInfo;

public class PrivateChatNotify {
    @Tag(tag=7) public ChatInfo chatInfo = null;
}
