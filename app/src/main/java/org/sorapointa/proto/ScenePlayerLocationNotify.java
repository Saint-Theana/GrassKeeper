package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VehicleLocationInfo.*;
import org.sorapointa.proto.VehicleLocationInfo;
import org.sorapointa.proto.PlayerLocationInfo.*;
import org.sorapointa.proto.PlayerLocationInfo;

public class ScenePlayerLocationNotify {
    public enum ScenePlayerLocationNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=278) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer sceneId = null;
    @Tag(tag=3) public List<VehicleLocationInfo> vehicleLocList = new ArrayList<>();
    @Tag(tag=12) public List<PlayerLocationInfo> playerLocList = new ArrayList<>();
}
