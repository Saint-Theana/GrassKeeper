package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockNameCardNotify {
    public enum UnlockNameCardNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4085) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer nameCardId = null;
}
