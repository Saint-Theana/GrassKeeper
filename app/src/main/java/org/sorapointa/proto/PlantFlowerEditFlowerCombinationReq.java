package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerEditFlowerCombinationReq {
    public enum PlantFlowerEditFlowerCombinationReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8837) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer scheduleId = null;
    @Tag(tag=3) public CustomGadgetTreeInfo flowerCombinationInfo = null;
    @Tag(tag=7) public Integer entityId = null;
}
