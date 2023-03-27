package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCardBackRsp {
    public enum OFPOBKOCGBC {
        @Tag(tag=0) None ,
        @Tag(tag=7569) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer cardBackId = null;
    @Tag(tag=3) public Integer deckId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
