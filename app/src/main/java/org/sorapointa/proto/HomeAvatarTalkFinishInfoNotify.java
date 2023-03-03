package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeAvatarTalkFinishInfo.*;
import org.sorapointa.proto.HomeAvatarTalkFinishInfo;

public class HomeAvatarTalkFinishInfoNotify {
    @Tag(tag=9) public List<HomeAvatarTalkFinishInfo> avatarTalkInfoList = new ArrayList<>();
}
