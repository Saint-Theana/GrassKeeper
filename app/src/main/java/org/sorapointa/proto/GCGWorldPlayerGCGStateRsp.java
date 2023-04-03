package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGPlayerGCGState.*;
import org.sorapointa.proto.GCGPlayerGCGState;

public class GCGWorldPlayerGCGStateRsp {
    public enum NGMOOLEDMPJ {
        @Tag(tag=0) None ,
        @Tag(tag=7280) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public List<GCGPlayerGCGState> playerState = new ArrayList<>();
}
