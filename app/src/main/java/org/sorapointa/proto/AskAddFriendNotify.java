package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class AskAddFriendNotify {
    @Tag(tag=15) public FriendBrief targetFriendBrief = null;
    @Tag(tag=9) public Integer targetUid = null;
}
