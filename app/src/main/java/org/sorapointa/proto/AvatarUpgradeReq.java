package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarUpgradeReq {
    @Tag(tag=6) public Long avatarGuid = null;
    @Tag(tag=2) public Integer count = null;
    @Tag(tag=5) public Integer itemId = null;
}
