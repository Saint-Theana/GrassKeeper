package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerGCGMatchConfirmNotify {
    public enum CHFJHDNIIHH {
        @Tag(tag=0) None ,
        @Tag(tag=4160) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Boolean isAgree = null;
    @Tag(tag=8) public Integer matchId = null;
    @Tag(tag=7) public Integer uid = null;
}
