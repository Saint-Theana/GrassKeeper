package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeLimitedShopInfo {
    @Tag(tag=14) public Integer nextGuestOpenTime = null;
    @Tag(tag=4) public Integer uid = null;
    @Tag(tag=12) public Vector djinnRot = null;
    @Tag(tag=2) public Integer nextCloseTime = null;
    @Tag(tag=6) public Vector djinnPos = null;
    @Tag(tag=15) public Integer nextOpenTime = null;
}
