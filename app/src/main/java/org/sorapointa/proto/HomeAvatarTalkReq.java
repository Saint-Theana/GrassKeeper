package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarTalkReq {
    @Tag(tag=12) public Integer talkId = null;
    @Tag(tag=15) public Integer avatarId = null;
}
