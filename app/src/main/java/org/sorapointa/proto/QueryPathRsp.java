package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class QueryPathRsp {
    public enum PathStatusType {
        @Tag(tag=0) PATH_STATUS_TYPE_FAIL ,
        @Tag(tag=1) PATH_STATUS_TYPE_SUCC ,
        @Tag(tag=2) PATH_STATUS_TYPE_PARTIAL ;
    }

    @Tag(tag=12,isSigned=true) public Integer queryId = null;
    @Tag(tag=6) public List<Vector> corners = new ArrayList<>();
    @Tag(tag=8) public PathStatusType queryStatus = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
