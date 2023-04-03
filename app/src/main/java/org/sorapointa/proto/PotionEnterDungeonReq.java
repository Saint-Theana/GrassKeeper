package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PotionAvatarInfo.*;
import org.sorapointa.proto.PotionAvatarInfo;

public class PotionEnterDungeonReq {
    public enum PotionEnterDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8571) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer modeId = null;
    @Tag(tag=8) public List<PotionAvatarInfo> avatarInfoList = new ArrayList<>();
    @Tag(tag=6) public Integer levelId = null;
    @Tag(tag=11) public List<Integer> buffIdList = new ArrayList<>();
    @Tag(tag=1) public Integer stageId = null;
}
