package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DuelHeartSettleNotify {
    public enum DCPKPJOKOHK {
        @Tag(tag=0) None ,
        @Tag(tag=20655) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Boolean isNewRecord = null;
    @Tag(tag=5) public Boolean isSucc = null;
    @Tag(tag=1) public Integer costTime = null;
}
