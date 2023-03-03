package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChatInfo.*;
import org.sorapointa.proto.ChatInfo;

public class PullRecentChatRsp {
    @Tag(tag=15) public List<ChatInfo> chatInfo = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
