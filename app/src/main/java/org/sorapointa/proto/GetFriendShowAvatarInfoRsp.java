package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShowAvatarInfo.*;
import org.sorapointa.proto.ShowAvatarInfo;

public class GetFriendShowAvatarInfoRsp {
    @Tag(tag=6) public Integer uid = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<ShowAvatarInfo> showAvatarInfoList = new ArrayList<>();
}
