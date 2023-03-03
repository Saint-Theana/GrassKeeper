package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialSelectAvatarAndEnterDungeonReq {
    @Tag(tag=4) public Integer trialId = null;
    @Tag(tag=10) public List<Integer> selectTrialAvatarIdList = new ArrayList<>();
    @Tag(tag=7) public Integer enterPointId = null;
}
