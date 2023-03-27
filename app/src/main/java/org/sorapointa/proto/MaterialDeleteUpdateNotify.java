package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MaterialDeleteUpdateNotify {
    public enum MaterialDeleteUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=654) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

}
