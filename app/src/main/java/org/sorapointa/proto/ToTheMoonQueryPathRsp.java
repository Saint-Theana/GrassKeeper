package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ToTheMoonQueryPathRsp {
    public enum PathStatusType {
        @Tag(tag=0) PATH_STATUS_TYPE_FAIL ,
        @Tag(tag=1) PATH_STATUS_TYPE_SUCC ,
        @Tag(tag=2) PATH_STATUS_TYPE_PARTIAL ;
    }

    @Tag(tag=7) public PathStatusType queryStatus = null;
    @Tag(tag=3,isSigned=true) public List<Long> index = new ArrayList<>();
    @Tag(tag=14) public List<Vector> corners = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public List<Integer> level = new ArrayList<>();
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=9,isSigned=true) public Integer queryId = null;
}
