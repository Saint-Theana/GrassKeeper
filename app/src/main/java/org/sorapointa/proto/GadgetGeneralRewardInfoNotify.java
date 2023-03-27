package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetGeneralRewardInfoNotify {
    public enum GadgetGeneralRewardInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=878) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer entityId = null;
    @Tag(tag=15) public GeneralReward generalRewardInfo = null;
}
