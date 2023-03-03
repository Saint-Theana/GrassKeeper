package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class GetPlayerBlacklistRsp {
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public List<FriendBrief> blacklist = new ArrayList<>();
}
