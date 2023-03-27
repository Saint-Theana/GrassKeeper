package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum VehicleInteractType {
        @Tag(tag=0) VehicleInteractNone ,
        @Tag(tag=1) VehicleInteractIn ,
        @Tag(tag=2) VehicleInteractOut ;
}
