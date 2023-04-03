package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class TakeHuntingOfferReq {
    public enum TakeHuntingOfferReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4338) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public HuntingPair huntingPair = null;
    @Tag(tag=14) public Integer cityId = null;
}
