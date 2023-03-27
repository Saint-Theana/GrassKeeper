package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeDeckNameRsp {
    public enum INBIKEHAJAL {
        @Tag(tag=0) None ,
        @Tag(tag=7459) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public String name = null;
    @Tag(tag=2) public Boolean dniijjknndg = null;
    @Tag(tag=14) public Integer deckId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
