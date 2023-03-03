package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendBrief.*;
import org.sorapointa.proto.FriendBrief;

public class PSNBlackListNotify {
    @Tag(tag=11) public List<FriendBrief> psnBlacklist = new ArrayList<>();
}
