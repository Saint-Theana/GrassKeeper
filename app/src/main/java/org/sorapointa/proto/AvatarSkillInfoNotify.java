package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillInfoNotify {
    public static class MapSkillMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AvatarSkillInfo value = null;
    }

    public enum AvatarSkillInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1070) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<MapSkillMap> skillMap = new ArrayList<>();
    @Tag(tag=4) public Long guid = null;
}
