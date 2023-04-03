package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShopInfo.*;
import org.sorapointa.proto.HomeLimitedShopInfo;

public class HomeBasicInfo {
    @Tag(tag=11) public Integer homeOwnerUid = null;
    @Tag(tag=2) public Integer curModuleId = null;
    @Tag(tag=15) public HomeLimitedShopInfo limitedShopInfo = null;
    @Tag(tag=9) public Integer level = null;
    @Tag(tag=3) public String ownerNickName = null;
    @Tag(tag=14) public Boolean isInEditMode = null;
    @Tag(tag=7) public Integer curRoomSceneId = null;
    @Tag(tag=13) public Long exp = null;
}
