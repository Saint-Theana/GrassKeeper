package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector3Int.*;
import org.sorapointa.proto.Vector3Int;
import org.sorapointa.proto.QueryPathReq_OptionType.*;
import org.sorapointa.proto.QueryPathReq_OptionType;
import org.sorapointa.proto.QueryFilter.*;
import org.sorapointa.proto.QueryFilter;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class QueryPathReq {
    public enum QueryPathReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2305) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13,isSigned=true) public Integer queryId = null;
    @Tag(tag=4) public List<Vector> destinationPos = new ArrayList<>();
    @Tag(tag=5) public Vector3Int destinationExtend = null;
    @Tag(tag=12) public Integer queryType = null;
    @Tag(tag=2) public QueryFilter filter = null;
    @Tag(tag=15) public Vector3Int sourceExtend = null;
    @Tag(tag=7) public Integer sceneId = null;
    @Tag(tag=10) public Vector sourcePos = null;
}
