package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GMShowNavMeshReq {
    public enum GMShowNavMeshReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2390) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Vector center = null;
    @Tag(tag=13) public Vector extent = null;
}
