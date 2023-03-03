package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class ForceAddPlayerFriendRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public FriendBrief targetFriendBrief = null;
    @Tag(tag=9) public Integer targetUid = null;
}
