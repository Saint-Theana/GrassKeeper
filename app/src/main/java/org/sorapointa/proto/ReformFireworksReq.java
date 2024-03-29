package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksReformData.*;
import org.sorapointa.proto.FireworksReformData;

public class ReformFireworksReq {
    public enum ReformFireworksReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5941) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public FireworksReformData fireworksReformData = null;
}
