package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PingReq {
    public enum PingReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=20) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer seq = null;
    @Tag(tag=13) public byte[] scData = null;
    @Tag(tag=4,isFloat=true) public Double totalTickTime = null;
    @Tag(tag=15,isFloat=true) public Float ueTime = null;
    @Tag(tag=8) public Integer clientTime = null;
}
