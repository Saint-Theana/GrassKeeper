package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RegionSearchChangeRegionNotify_RegionEvent.*;
import org.sorapointa.proto.RegionSearchChangeRegionNotify_RegionEvent;

public class RegionSearchChangeRegionNotify {
    public enum RegionSearchChangeRegionNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5645) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer regionId = null;
    @Tag(tag=12) public Integer event = null;
}
