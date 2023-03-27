package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeSelectAvatarAndEnterDungeonReq {
    public enum RoguelikeSelectAvatarAndEnterDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8281) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<Long> onstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=12) public Integer stageId = null;
    @Tag(tag=1) public List<Long> backstageAvatarGuidList = new ArrayList<>();
}
