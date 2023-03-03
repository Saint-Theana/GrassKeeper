package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FriendInfoChangeNotify {
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=9) public String onlineId = null;
}
