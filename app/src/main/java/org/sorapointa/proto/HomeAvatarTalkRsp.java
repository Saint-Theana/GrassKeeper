package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeAvatarTalkFinishInfo.*;
import org.sorapointa.proto.HomeAvatarTalkFinishInfo;

public class HomeAvatarTalkRsp {
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public HomeAvatarTalkFinishInfo avatarTalkInfo = null;
}
