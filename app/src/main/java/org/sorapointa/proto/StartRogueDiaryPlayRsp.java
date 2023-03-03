package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryAvatar.*;
import org.sorapointa.proto.RogueDiaryAvatar;

public class StartRogueDiaryPlayRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<RogueDiaryAvatar> trialAvatarList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> randCardList = new ArrayList<>();
    @Tag(tag=9) public List<RogueDiaryAvatar> avatarList = new ArrayList<>();
}
