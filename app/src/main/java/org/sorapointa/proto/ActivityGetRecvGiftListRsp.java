package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityRecvGiftData.*;
import org.sorapointa.proto.ActivityRecvGiftData;

public class ActivityGetRecvGiftListRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public List<ActivityRecvGiftData> recvGiftList = new ArrayList<>();
    @Tag(tag=6) public Integer scheduleId = null;
}
