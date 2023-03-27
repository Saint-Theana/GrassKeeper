package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeGetBlueprintSlotInfoRsp {
    public enum PBAPEFNPDAF {
        @Tag(tag=0) None ,
        @Tag(tag=4541) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<Integer> deleteSlotIdList = new ArrayList<>();
    @Tag(tag=11) public List<HomeBlueprintSlotInfo> slotInfoList = new ArrayList<>();
}
