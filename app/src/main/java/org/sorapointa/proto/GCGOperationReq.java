package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGOperation.*;
import org.sorapointa.proto.GCGOperation;

public class GCGOperationReq {
    public enum GMDGEMKCKPF {
        @Tag(tag=0) None ,
        @Tag(tag=7487) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer redirectUid = null;
    @Tag(tag=6) public Integer opSeq = null;
    @Tag(tag=11) public GCGOperation op = null;
}
