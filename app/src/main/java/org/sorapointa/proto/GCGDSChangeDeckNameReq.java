package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeDeckNameReq {
    public enum IOLDDAGKLEA {
        @Tag(tag=0) None ,
        @Tag(tag=7769) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Boolean dniijjknndg = null;
    @Tag(tag=1) public String name = null;
    @Tag(tag=5) public Integer deckId = null;
}
