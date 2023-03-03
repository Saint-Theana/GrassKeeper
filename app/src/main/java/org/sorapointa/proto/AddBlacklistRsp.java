package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class AddBlacklistRsp {
    @Tag(tag=13) public FriendBrief targetFriendBrief = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
