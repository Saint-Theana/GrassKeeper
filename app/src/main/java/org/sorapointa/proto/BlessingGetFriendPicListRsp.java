package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlessingFriendPicData.*;
import org.sorapointa.proto.BlessingFriendPicData;

public class BlessingGetFriendPicListRsp {
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<BlessingFriendPicData> friendPicDataList = new ArrayList<>();
}
