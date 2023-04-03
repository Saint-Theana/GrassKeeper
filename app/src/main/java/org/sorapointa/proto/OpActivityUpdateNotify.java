package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OpActivityInfo.*;
import org.sorapointa.proto.OpActivityInfo;

public class OpActivityUpdateNotify {
    public enum OpActivityUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5198) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public OpActivityInfo opActivityInfo = null;
}
