package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFetterLevelRewardReq {
    @Tag(tag=1) public Long avatarGuid = null;
    @Tag(tag=6) public Integer fetterLevel = null;
}
