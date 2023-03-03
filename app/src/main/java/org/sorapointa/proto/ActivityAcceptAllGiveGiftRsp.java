package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityAcceptGiftResultInfo.*;
import org.sorapointa.proto.ActivityAcceptGiftResultInfo;

public class ActivityAcceptAllGiveGiftRsp {
    @Tag(tag=5) public List<ActivityAcceptGiftResultInfo> acceptGiftResultInfoList = new ArrayList<>();
    @Tag(tag=10) public Integer scheduleId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
