package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OtherPlayerEnterHomeNotify_Reason.*;
import org.sorapointa.proto.OtherPlayerEnterHomeNotify_Reason;

public class OtherPlayerEnterHomeNotify {
    public enum OtherPlayerEnterHomeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4582) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer reason = null;
    @Tag(tag=11) public String nickname = null;
}
