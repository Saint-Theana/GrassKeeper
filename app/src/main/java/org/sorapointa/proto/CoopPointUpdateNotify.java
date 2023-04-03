package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopPoint.*;
import org.sorapointa.proto.CoopPoint;

public class CoopPointUpdateNotify {
    public enum CoopPointUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1987) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public CoopPoint coopPoint = null;
}
