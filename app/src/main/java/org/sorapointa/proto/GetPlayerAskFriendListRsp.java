package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class GetPlayerAskFriendListRsp {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public List<FriendBrief> askFriendList = new ArrayList<>();
}
