package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCardBackReq {
    public enum DOPEECEBIKM {
        @Tag(tag=0) None ,
        @Tag(tag=7628) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer deckId = null;
    @Tag(tag=9) public Integer cardBackId = null;
}
