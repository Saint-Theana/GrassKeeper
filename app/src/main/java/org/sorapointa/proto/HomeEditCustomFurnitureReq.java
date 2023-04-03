package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeCustomFurnitureInfo.*;
import org.sorapointa.proto.HomeCustomFurnitureInfo;

public class HomeEditCustomFurnitureReq {
    public enum HomeEditCustomFurnitureReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4685) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public HomeCustomFurnitureInfo customFurnitureInfo = null;
}
