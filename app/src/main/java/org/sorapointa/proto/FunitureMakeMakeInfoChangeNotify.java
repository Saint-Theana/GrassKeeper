package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FunitureMakeMakeInfoChangeNotify {
    public enum FunitureMakeMakeInfoChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4592) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public FurnitureMakeMakeInfo makeInfo = null;
}
