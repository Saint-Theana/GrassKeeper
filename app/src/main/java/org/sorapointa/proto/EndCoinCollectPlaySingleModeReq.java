package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EndCoinCollectPlaySingleModeReq {
    public enum CMDNHEBKKEO {
        @Tag(tag=0) None ,
        @Tag(tag=20052) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer multistagePlayIndex = null;
}
