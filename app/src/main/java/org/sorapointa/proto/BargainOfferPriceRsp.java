package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BargainResultType.*;
import org.sorapointa.proto.BargainResultType;

public class BargainOfferPriceRsp {
    public enum BargainOfferPriceRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=418) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer bargainResult = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=7,isSigned=true) public Integer curMood = null;
    @Tag(tag=11) public Integer resultParam = null;
}
