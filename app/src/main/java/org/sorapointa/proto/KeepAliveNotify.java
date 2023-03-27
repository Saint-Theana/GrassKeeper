package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class KeepAliveNotify {
    public enum KeepAliveNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

}
