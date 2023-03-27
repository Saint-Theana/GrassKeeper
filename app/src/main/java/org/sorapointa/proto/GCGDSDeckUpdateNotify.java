package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSDeckUpdateNotify {
    public enum MGAEFBLCDDL {
        @Tag(tag=0) None ,
        @Tag(tag=7267) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Boolean isValid = null;
    @Tag(tag=3) public Integer deckId = null;
}
