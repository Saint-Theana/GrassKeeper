package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBlockNotify {
    public enum HomeBlockNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4641) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer endTime = null;
}
