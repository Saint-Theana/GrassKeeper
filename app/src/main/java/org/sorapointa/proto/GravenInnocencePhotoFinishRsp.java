package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocencePhotoFinishRsp {
    public enum DPEEEFFDLIH {
        @Tag(tag=0) None ,
        @Tag(tag=22592) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer objectId = null;
    @Tag(tag=11) public Integer param = null;
}
