package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePS4FriendListNotify {
    @Tag(tag=15) public List<String> psnIdList = new ArrayList<>();
}
