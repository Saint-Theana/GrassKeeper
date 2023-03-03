package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamReplyInviteRsp {
    @Tag(tag=4) public Boolean isTransPoint = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
