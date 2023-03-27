package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomePriorCheckNotify {
    public enum HomePriorCheckNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4694) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer endTime = null;
}
