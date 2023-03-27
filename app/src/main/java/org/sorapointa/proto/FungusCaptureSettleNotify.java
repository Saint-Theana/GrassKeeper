package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusCaptureSettleNotify {
    public enum MIBABDMJBJL {
        @Tag(tag=0) None ,
        @Tag(tag=5585) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Boolean isSuccess = null;
}
