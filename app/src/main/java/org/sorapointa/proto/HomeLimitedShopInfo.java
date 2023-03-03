package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class HomeLimitedShopInfo {
    @Tag(tag=9,isFixed=true) public Integer nextCloseTime = null;
    @Tag(tag=11,isFixed=true) public Integer nextGuestOpenTime = null;
    @Tag(tag=7) public Vector djinnRot = null;
    @Tag(tag=4) public Integer uid = null;
    @Tag(tag=6,isFixed=true) public Integer nextOpenTime = null;
    @Tag(tag=2) public Vector djinnPos = null;
}
