package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DuelHeartSelectDifficultyReq {
    public enum PPBLCFIDCFN {
        @Tag(tag=0) None ,
        @Tag(tag=23596) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer difficulty = null;
}
