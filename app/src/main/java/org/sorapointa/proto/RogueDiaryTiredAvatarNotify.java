package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDiaryTiredAvatarNotify {
    public enum RogueDiaryTiredAvatarNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8243) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Boolean isNeedShow = null;
    @Tag(tag=10) public Integer reserveAvatarNum = null;
    @Tag(tag=8) public Integer tiredType = null;
    @Tag(tag=15) public List<RogueDiaryAvatar> optianalTiredAvatarList = new ArrayList<>();
}
