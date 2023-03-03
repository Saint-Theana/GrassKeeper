package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarPromoteGetRewardRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer rewardId = null;
    @Tag(tag=11) public Long avatarGuid = null;
    @Tag(tag=12) public Integer promoteLevel = null;
}
