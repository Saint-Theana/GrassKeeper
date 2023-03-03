package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class GetPlayerFriendListRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public List<FriendBrief> askFriendList = new ArrayList<>();
    @Tag(tag=14) public List<FriendBrief> friendList = new ArrayList<>();
}
