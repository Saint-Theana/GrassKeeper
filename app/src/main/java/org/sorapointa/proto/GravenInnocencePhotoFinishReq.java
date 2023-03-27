package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocencePhotoFinishReq {
    public enum NDBMIJAJMLB {
        @Tag(tag=0) None ,
        @Tag(tag=23521) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer param = null;
    @Tag(tag=3) public Integer objectId = null;
}
