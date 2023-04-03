package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MarkMapReq_Operation.*;
import org.sorapointa.proto.MarkMapReq_Operation;
import org.sorapointa.proto.MapMarkPoint.*;
import org.sorapointa.proto.MapMarkPoint;

public class MarkMapReq {
    public enum MarkMapReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3176) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer op = null;
    @Tag(tag=7) public MapMarkPoint old = null;
    @Tag(tag=10) public MapMarkPoint mark = null;
}
