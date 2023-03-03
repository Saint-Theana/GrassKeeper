package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarTeamResonanceInfo {
    @Tag(tag=5) public List<Integer> addTeamResonanceIdList = new ArrayList<>();
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=3) public Long avatarGuid = null;
    @Tag(tag=14) public List<Integer> delTeamResonanceIdList = new ArrayList<>();
}
