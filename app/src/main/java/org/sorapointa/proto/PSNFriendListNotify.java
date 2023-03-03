package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class PSNFriendListNotify {
    @Tag(tag=8) public List<FriendBrief> psnFriendList = new ArrayList<>();
}
