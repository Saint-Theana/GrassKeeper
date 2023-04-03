package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryAvatar.*;
import org.sorapointa.proto.RogueDiaryAvatar;

public class EnterRogueDiaryDungeonReq {
    public enum EnterRogueDiaryDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8647) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<RogueDiaryAvatar> chosenAvatarList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> chosenCardList = new ArrayList<>();
}
