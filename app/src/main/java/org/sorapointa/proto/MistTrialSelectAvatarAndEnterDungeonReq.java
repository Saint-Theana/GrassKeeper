package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialSelectAvatarAndEnterDungeonReq {
    public static class SelectAvatarIndex {
        @Tag(tag=13) public Integer mistTrialAvatarId = null;
        @Tag(tag=15) public Long formalAvatarGuid = null;
    }

    public enum MistTrialSelectAvatarAndEnterDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8537) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer trialId = null;
    @Tag(tag=5) public Integer enterPointId = null;
    @Tag(tag=6) public List<SelectAvatarIndex> selectAvatarIndexList = new ArrayList<>();
    @Tag(tag=9) public List<Integer> selectTrialAvatarIdList = new ArrayList<>();
}
