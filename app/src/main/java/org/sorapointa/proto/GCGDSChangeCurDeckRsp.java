package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCurDeckRsp {
    public enum BAHGDHIPKGL {
        @Tag(tag=0) None ,
        @Tag(tag=7565) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer deckId = null;
}
