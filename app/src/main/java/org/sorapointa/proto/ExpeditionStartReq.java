package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionStartReq {
    @Tag(tag=1) public List<Integer> avatarIdList = new ArrayList<>();
    @Tag(tag=5) public Integer assistUid = null;
    @Tag(tag=8) public Integer assistAvatarId = null;
    @Tag(tag=7) public Integer pathId = null;
}
