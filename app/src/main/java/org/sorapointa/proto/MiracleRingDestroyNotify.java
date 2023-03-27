package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MiracleRingDestroyNotify {
    public enum MiracleRingDestroyNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5216) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer entityId = null;
}
