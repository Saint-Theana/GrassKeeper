package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFetterLevelRewardRsp {
    @Tag(tag=4) public Long avatarGuid = null;
    @Tag(tag=1) public Integer rewardId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer fetterLevel = null;
}
