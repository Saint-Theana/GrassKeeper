package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class TakeHuntingOfferRsp {
    public enum TakeHuntingOfferRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4345) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer cityId = null;
    @Tag(tag=6) public HuntingPair huntingPair = null;
}
