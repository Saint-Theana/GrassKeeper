package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryAvatar.*;
import org.sorapointa.proto.RogueDiaryAvatar;
import org.sorapointa.proto.RogueDiaryRoomInfo.*;
import org.sorapointa.proto.RogueDiaryRoomInfo;

public class RogueDiaryRepairInfoNotify {
    public enum RogueDiaryRepairInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8681) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer stageId = null;
    @Tag(tag=13) public List<RogueDiaryAvatar> avatarList = new ArrayList<>();
    @Tag(tag=7) public List<RogueDiaryAvatar> selectAvatarList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> randCardList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> selectCardList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> chosenCardList = new ArrayList<>();
    @Tag(tag=3) public List<RogueDiaryAvatar> trialAvatarList = new ArrayList<>();
    @Tag(tag=5) public List<RogueDiaryRoomInfo> roomList = new ArrayList<>();
}
