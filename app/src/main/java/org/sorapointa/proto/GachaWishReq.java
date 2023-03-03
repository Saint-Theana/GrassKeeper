package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GachaWishReq {
    @Tag(tag=14) public Integer gachaScheduleId = null;
    @Tag(tag=13) public Integer gachaType = null;
    @Tag(tag=4) public Integer itemId = null;
}
