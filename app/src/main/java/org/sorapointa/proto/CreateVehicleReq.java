package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class CreateVehicleReq {
    @Tag(tag=11) public Vector pos = null;
    @Tag(tag=2) public Integer vehicleId = null;
    @Tag(tag=7) public Integer scenePointId = null;
    @Tag(tag=5) public Vector rot = null;
}
