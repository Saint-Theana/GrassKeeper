package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CreateVehicleReq {
    public enum CreateVehicleReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=858) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Vector pos = null;
    @Tag(tag=10) public Vector rot = null;
    @Tag(tag=1) public Integer vehicleId = null;
    @Tag(tag=15) public Integer scenePointId = null;
}
