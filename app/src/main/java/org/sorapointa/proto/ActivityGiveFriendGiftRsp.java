package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityGiveFriendGiftRsp {
    @Tag(tag=3) public List<Integer> limitGiftList = new ArrayList<>();
    @Tag(tag=4) public Integer scheduleId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
