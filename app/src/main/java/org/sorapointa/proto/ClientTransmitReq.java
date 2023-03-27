package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientTransmitReq {
    public enum ClientTransmitReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=203) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Vector rot = null;
    @Tag(tag=13) public Integer reason = null;
    @Tag(tag=12) public Vector pos = null;
    @Tag(tag=8) public Integer sceneId = null;
}
