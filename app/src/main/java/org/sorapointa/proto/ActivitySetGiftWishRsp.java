package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivitySetGiftWishRsp {
    @Tag(tag=15) public Integer scheduleId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
