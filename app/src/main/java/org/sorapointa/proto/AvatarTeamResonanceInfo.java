package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarTeamResonanceInfo {
    @Tag(tag=10) public Long avatarGuid = null;
    @Tag(tag=8) public List<Integer> delTeamResonanceIdList = new ArrayList<>();
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=2) public List<Integer> addTeamResonanceIdList = new ArrayList<>();
}
