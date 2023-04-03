package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.StoreType.*;
import org.sorapointa.proto.StoreType;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class DropItemReq {
    public enum DropItemReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=614) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Long guid = null;
    @Tag(tag=3) public Integer count = null;
    @Tag(tag=12) public Integer storeType = null;
    @Tag(tag=13) public Vector pos = null;
}
