package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGStartChallengeRsp {
    public enum OBMPGGOELEB {
        @Tag(tag=0) None ,
        @Tag(tag=7351) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer configId = null;
    @Tag(tag=6) public Integer levelType = null;
    @Tag(tag=5) public Integer levelId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
