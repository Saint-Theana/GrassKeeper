package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RedeemLegendaryKeyRsp {
    public enum RedeemLegendaryKeyRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=407) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer legendaryKeyCount = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
