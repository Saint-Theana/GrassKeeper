package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class FishCastRodReq {
    public enum FishCastRodReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5819) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer rodEntityId = null;
    @Tag(tag=1) public Vector pos = null;
    @Tag(tag=15) public Integer rodId = null;
    @Tag(tag=8) public Integer baitId = null;
}
