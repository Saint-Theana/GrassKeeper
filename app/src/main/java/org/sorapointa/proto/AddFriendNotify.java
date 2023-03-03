package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class AddFriendNotify {
    @Tag(tag=11) public Integer targetUid = null;
    @Tag(tag=10) public FriendBrief targetFriendBrief = null;
}
