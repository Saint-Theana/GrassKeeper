package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionStartRsp {
    @Tag(tag=1) public Integer assistUid = null;
    @Tag(tag=7) public Integer pathId = null;
    @Tag(tag=4) public List<Integer> avatarIdList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer assistAvatarId = null;
}
