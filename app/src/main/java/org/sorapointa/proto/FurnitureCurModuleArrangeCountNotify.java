package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FurnitureCurModuleArrangeCountNotify {
    public enum FurnitureCurModuleArrangeCountNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4851) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<Uint32Pair> furnitureArrangeCountList = new ArrayList<>();
}
