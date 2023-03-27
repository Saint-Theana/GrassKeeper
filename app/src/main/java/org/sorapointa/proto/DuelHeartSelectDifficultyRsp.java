package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DuelHeartSelectDifficultyRsp {
    public enum KPFDDJIABAD {
        @Tag(tag=0) None ,
        @Tag(tag=21405) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
