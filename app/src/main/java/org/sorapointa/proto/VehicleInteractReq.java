package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VehicleInteractType.*;
import org.sorapointa.proto.VehicleInteractType;

public class VehicleInteractReq {
    @Tag(tag=8) public Integer interactType = null;
    @Tag(tag=12) public Integer pos = null;
    @Tag(tag=15) public Integer entityId = null;
}
