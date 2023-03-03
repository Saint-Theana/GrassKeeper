package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GachaWishRsp {
    @Tag(tag=8) public Integer gachaType = null;
    @Tag(tag=7) public Integer gachaScheduleId = null;
    @Tag(tag=2) public Integer wishMaxProgress = null;
    @Tag(tag=5) public Integer wishProgress = null;
    @Tag(tag=3) public Integer wishItemId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
