package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoinCollectCheckDoubleStartPlayRsp {
    public enum FOBGPGMPJMO {
        @Tag(tag=0) None ,
        @Tag(tag=24464) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer levelId = null;
}
