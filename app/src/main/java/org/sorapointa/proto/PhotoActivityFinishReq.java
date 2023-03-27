package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PhotoActivityFinishReq {
    public enum PhotoActivityFinishReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8021) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Boolean isSucc = null;
    @Tag(tag=3) public Integer checkRootId = null;
    @Tag(tag=5) public Integer posId = null;
}
