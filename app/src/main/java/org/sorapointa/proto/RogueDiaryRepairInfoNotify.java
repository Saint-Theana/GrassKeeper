package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryAvatar.*;
import org.sorapointa.proto.RogueDiaryAvatar;
import org.sorapointa.proto.RogueDiaryRoomInfo.*;
import org.sorapointa.proto.RogueDiaryRoomInfo;

public class RogueDiaryRepairInfoNotify {
    @Tag(tag=8) public Integer stageId = null;
    @Tag(tag=14) public List<Integer> selectCardList = new ArrayList<>();
    @Tag(tag=13) public List<RogueDiaryAvatar> avatarList = new ArrayList<>();
    @Tag(tag=2) public List<RogueDiaryRoomInfo> roomList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> randCardList = new ArrayList<>();
    @Tag(tag=9) public List<RogueDiaryAvatar> selectAvatarList = new ArrayList<>();
    @Tag(tag=15) public List<Integer> chosenCardList = new ArrayList<>();
    @Tag(tag=11) public List<RogueDiaryAvatar> trialAvatarList = new ArrayList<>();
}
