package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum VehicleInteractType {
        @Tag(tag=0) VEHICLE_INTERACT_TYPE_NONE ,
        @Tag(tag=1) VEHICLE_INTERACT_TYPE_IN ,
        @Tag(tag=2) VEHICLE_INTERACT_TYPE_OUT ;
}
