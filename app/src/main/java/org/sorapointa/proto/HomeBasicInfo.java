package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShopInfo.*;
import org.sorapointa.proto.HomeLimitedShopInfo;

public class HomeBasicInfo {
    @Tag(tag=10) public Integer level = null;
    @Tag(tag=13) public Integer curRoomSceneId = null;
    @Tag(tag=9) public Integer curModuleId = null;
    @Tag(tag=5) public Boolean isInEditMode = null;
    @Tag(tag=3) public Integer homeOwnerUid = null;
    @Tag(tag=14) public Long exp = null;
    @Tag(tag=15) public HomeLimitedShopInfo limitedShopInfo = null;
    @Tag(tag=4) public String ownerNickName = null;
}
