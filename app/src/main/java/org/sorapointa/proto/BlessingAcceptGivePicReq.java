package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingAcceptGivePicReq {
    public enum BlessingAcceptGivePicReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2012) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=6) public Integer index = null;
}
