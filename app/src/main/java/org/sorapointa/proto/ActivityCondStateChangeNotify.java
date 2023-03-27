package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityCondStateChangeNotify {
    public enum ActivityCondStateChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2089) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<Integer> expireCondList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> activatedSaleIdList = new ArrayList<>();
    @Tag(tag=15) public Integer scheduleId = null;
    @Tag(tag=3) public Integer activityId = null;
    @Tag(tag=8) public List<Uint32Pair> disableTransferPointInteractionList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> meetCondList = new ArrayList<>();
}
