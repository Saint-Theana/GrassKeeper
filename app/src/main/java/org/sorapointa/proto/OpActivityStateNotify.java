package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OpActivityTagBriefInfo.*;
import org.sorapointa.proto.OpActivityTagBriefInfo;

public class OpActivityStateNotify {
    public enum OpActivityStateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2505) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<Integer> finishedBonusActivityIdList = new ArrayList<>();
    @Tag(tag=3) public List<OpActivityTagBriefInfo> openedOpActivityInfoList = new ArrayList<>();
}
