package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityAcceptGiftResultInfo.*;
import org.sorapointa.proto.ActivityAcceptGiftResultInfo;

public class ActivityAcceptGiveGiftRsp {
    @Tag(tag=4) public ActivityAcceptGiftResultInfo acceptGiftResultInfo = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer scheduleId = null;
}
