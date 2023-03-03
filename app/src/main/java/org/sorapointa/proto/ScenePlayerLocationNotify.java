package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerLocationInfo.*;
import org.sorapointa.proto.PlayerLocationInfo;
import org.sorapointa.proto.VehicleLocationInfo.*;
import org.sorapointa.proto.VehicleLocationInfo;

public class ScenePlayerLocationNotify {
    @Tag(tag=3) public List<VehicleLocationInfo> vehicleLocList = new ArrayList<>();
    @Tag(tag=9) public Integer sceneId = null;
    @Tag(tag=14) public List<PlayerLocationInfo> playerLocList = new ArrayList<>();
}
