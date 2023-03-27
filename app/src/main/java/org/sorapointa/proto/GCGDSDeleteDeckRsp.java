package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSDeleteDeckRsp {
    public enum GKKOJFEKJII {
        @Tag(tag=0) None ,
        @Tag(tag=7399) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer deckId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
