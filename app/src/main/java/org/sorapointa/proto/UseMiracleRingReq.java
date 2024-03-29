package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class UseMiracleRingReq {
    public enum UseMiracleRingReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5238) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Vector pos = null;
    @Tag(tag=2) public Vector rot = null;
    @Tag(tag=1) public Integer miracleRingOpType = null;
}
