package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarSkillInfo.*;
import org.sorapointa.proto.AvatarSkillInfo;

public class AvatarSkillInfoNotify {
    public static class MapSkillMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public AvatarSkillInfo value = null;
    }

    @Tag(tag=11) public List<MapSkillMap> skillMap = new ArrayList<>();
    @Tag(tag=4) public Long guid = null;
}
