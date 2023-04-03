package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomGadgetTreeInfo.*;
import org.sorapointa.proto.CustomGadgetTreeInfo;

public class WinterCampEditSnowmanCombinationReq {
    public enum WinterCampEditSnowmanCombinationReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8170) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=4) public CustomGadgetTreeInfo combinationInfo = null;
}
