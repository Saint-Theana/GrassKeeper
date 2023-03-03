package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.QueryFilter.*;
import org.sorapointa.proto.QueryFilter;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.Vector3Int.*;
import org.sorapointa.proto.Vector3Int;

public class QueryPathReq {
    public enum OptionType {
        @Tag(tag=0) OPTION_TYPE_NONE ,
        @Tag(tag=1) OPTION_TYPE_NORMAL ,
        @Tag(tag=2) OPTION_TYPE_FIRST_CAN_GO ;
    }

    @Tag(tag=13) public OptionType queryType = null;
    @Tag(tag=6) public Vector3Int sourceExtend = null;
    @Tag(tag=2) public Vector sourcePos = null;
    @Tag(tag=12) public QueryFilter filter = null;
    @Tag(tag=15,isSigned=true) public Integer queryId = null;
    @Tag(tag=4) public Vector3Int destinationExtend = null;
    @Tag(tag=10) public List<Vector> destinationPos = new ArrayList<>();
    @Tag(tag=11) public Integer sceneId = null;
}
