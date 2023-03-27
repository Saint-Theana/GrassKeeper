package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueDiaryPlayRsp {
    public enum StartRogueDiaryPlayRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8780) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<RogueDiaryAvatar> trialAvatarList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public List<Integer> randCardList = new ArrayList<>();
    @Tag(tag=13) public List<RogueDiaryAvatar> avatarList = new ArrayList<>();
}
