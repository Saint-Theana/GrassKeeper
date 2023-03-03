package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeDeliveryDailyRewardRsp {
    @Tag(tag=5) public Integer scheduleId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
